import java.util.*;

public class J05003 {
    static String chuanHoa(String s){
        String[] a = s.split("/");
        int d = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int y = Integer.parseInt(a[2]);
        return String.format("%02d/%02d/%04d", d,m,y);
    }
    static class SinhVien {
        private String ma, ten, ns, lop;
        private double gpa;
        public SinhVien(String ma, String ten, String ns, String lop, double gpa){
            this.ma = ma;
            this.ten = ten;
            this. ns = ns;
            this.lop = lop;
            this.gpa = gpa;
        }
        @Override 
        public String toString(){
            return String.format("%s %s %s %s %.2f", ma, ten, lop, ns, gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++){
            String ma = "B20DCCN" + String.format("%03d", i);
            String ten = sc.nextLine();
            
            String lop = sc.nextLine();
            String ns = chuanHoa(sc.nextLine());
            Double gpa = Double.parseDouble(sc.nextLine().trim());
            SinhVien sv = new SinhVien(ma, ten, ns, lop, gpa);
            System.out.println(sv);
        }
        sc.close();
    }
}
