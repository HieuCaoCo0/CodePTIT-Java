/*
 * Ngôn ngữ: Java (JDBC — gói java.sql có sẵn trong JDK)
 *
 * Công dụng: chạy đúng bài SELECT cột cụ thể + alias (AS) + DISTINCT nhưng từ
 * CODE ỨNG DỤNG — cách một app Java thật sự gọi MySQL qua JDBC và nhận kết quả về.
 *
 * Tại sao cần học: câu SQL không sống một mình — nó luôn được gọi từ code.
 * JDBC là cầu nối chuẩn của Java tới mọi database; đây là đúng dialect MySQL
 * trong solution.sql, không đổi một chữ.
 *
 * Biên dịch: javac Solution.java   (chỉ cần JDK, không cần driver)
 * Chạy thật: cần MySQL đang chạy + driver mysql-connector-j:
 *   java -cp ".;mysql-connector-j-9.x.jar" Solution "jdbc:mysql://localhost:3306/code4life" root matkhau
 */
import java.sql.Connection;    // đại diện 1 kết nối tới database
import java.sql.DriverManager; // nơi xin kết nối từ chuỗi jdbc:...
import java.sql.ResultSet;     // con trỏ đọc từng dòng kết quả SELECT
import java.sql.SQLException;  // lỗi phía database ném ra dưới dạng exception này
import java.sql.Statement;     // đối tượng gửi câu SQL xuống database
import java.util.ArrayList;    // thư viện chuẩn: gom các dòng kết quả lại để so sánh
import java.util.List;         // interface danh sách

public class atest { // class chứa toàn bộ bài — Java bắt buộc code nằm trong class

    private static void check(boolean ok, String msg) { // hàm phụ trợ: nếu "ok" sai thì báo lỗi kèm thông điệp "msg"
        if (!ok) throw new AssertionError(msg); // ném lỗi để dừng ngay và chỉ rõ chỗ sai
    }

    private static List<String> rows(Statement st, String sql) throws SQLException { // chạy SELECT rồi gom mỗi dòng thành chuỗi "cột1|cột2|..."
        List<String> out = new ArrayList<>(); // danh sách kết quả
        try (ResultSet rs = st.executeQuery(sql)) { // executeQuery: gửi SELECT xuống DB; try-with-resources tự đóng ResultSet
            int cols = rs.getMetaData().getColumnCount(); // hỏi metadata: kết quả có bao nhiêu cột
            while (rs.next()) { // next(): nhích con trỏ sang dòng kế tiếp, hết dòng trả false
                StringBuilder sb = new StringBuilder(); // ghép các cột của 1 dòng
                for (int i = 1; i <= cols; i++) { // cột JDBC đánh số TỪ 1, không phải từ 0
                    if (i > 1) sb.append('|'); // ngăn cách các cột bằng dấu |
                    sb.append(rs.getString(i)); // đọc giá trị cột dưới dạng chuỗi (DECIMAL ra "150000.00", NULL ra "null")
                }
                out.add(sb.toString()); // thêm dòng đã ghép vào danh sách
            }
        }
        return out; // trả về toàn bộ kết quả để so với kỳ vọng
    }

    public static void main(String[] args) throws SQLException { // điểm bắt đầu chạy chương trình
        String url  = args.length > 0 ? args[0] : "jdbc:mysql://localhost:3306/code4life"; // chuỗi kết nối — sửa theo máy bạn hoặc truyền tham số
        String user = args.length > 1 ? args[1] : "root"; // tài khoản MySQL
        String pass = args.length > 2 ? args[2] : "";     // mật khẩu MySQL

        try (Connection conn = DriverManager.getConnection(url, user, pass); // mở kết nối tới MySQL — try-with-resources tự đóng khi xong
             Statement st = conn.createStatement()) { // tạo đối tượng gửi SQL

            st.executeUpdate("DROP TABLE IF EXISTS products"); // xóa bảng cũ nếu có, để file chạy lại được nhiều lần mà không lỗi
            st.executeUpdate("CREATE TABLE products ("        // tạo bảng products với 5 cột — đúng schema trong solution.sql
                    + " id       INT PRIMARY KEY,"            // khóa chính, định danh duy nhất cho mỗi dòng
                    + " name     VARCHAR(100) NOT NULL,"      // tên sản phẩm, bắt buộc phải có
                    + " category VARCHAR(50)  NOT NULL,"      // danh mục sản phẩm, bắt buộc phải có
                    + " price    DECIMAL(10,2) NOT NULL,"     // giá tiền — DECIMAL chính xác, không dùng float cho tiền
                    + " stock    INT NOT NULL)");             // số lượng tồn kho
            st.executeUpdate("INSERT INTO products (id, name, category, price, stock) VALUES" // dữ liệu mẫu để bài chạy độc lập được ngay
                    + " (1, 'Ao Thun',     'Ao',   150000, 20),"
                    + " (2, 'Quan Jean',    'Quan', 350000, 10),"
                    + " (3, 'Ao Khoac',     'Ao',   500000,  5),"
                    + " (4, 'Giay Sneaker', 'Giay', 800000,  8),"
                    + " (5, 'Quan Short',   'Quan', 200000, 15)");

            // Câu 1: chỉ lấy tên và giá, đặt lại tên cột cho dễ đọc (AS)
            List<String> q1 = rows(st, "SELECT name AS ten_san_pham, price AS gia FROM products"); // y hệt câu SQL trong solution.sql
            check(q1.equals(List.of( // so kết quả với "Kết quả kỳ vọng" — DECIMAL(10,2) hiển thị dạng 150000.00
                    "Ao Thun|150000.00", "Quan Jean|350000.00", "Ao Khoac|500000.00",
                    "Giay Sneaker|800000.00", "Quan Short|200000.00")), "câu 1 sai");

            // Câu 2: liệt kê các category duy nhất (không lặp)
            List<String> q2 = rows(st, "SELECT DISTINCT category FROM products"); // DISTINCT loại bỏ giá trị trùng nhau
            check(q2.stream().sorted().toList().equals(List.of("Ao", "Giay", "Quan")), "câu 2 sai"); // không ORDER BY thì thứ tự không đảm bảo — sắp lại rồi so
        }

        System.out.println("OK"); // in "OK" nếu mọi check ở trên đều đúng
    }
}