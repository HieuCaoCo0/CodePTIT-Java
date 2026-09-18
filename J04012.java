import java.util.*;

public class J04012 {
    static class NhanVien{
        private String id, ten;
        private int luong, phuCap, thuNhap, thuong;
        public NhanVien(String name, int luongCB, int ngay, String role){
            id = "NV01";
            ten = name;
            luong = luongCB*ngay;
            thuong = 0;
            if (ngay >= 25) thuong = (int) (luong * 0.2);
            else if (ngay >= 22) thuong = (int) (luong * 0.1);
            
            if (role.equals("GD")) phuCap = 250000;
            else if (role.equals("PGD")) phuCap = 200000;
            else if (role.equals("TP")) phuCap = 180000;
            else if (role.equals("NV")) phuCap = 150000;

            thuNhap = luong + thuong + phuCap;
        }
        @Override 
        public String toString(){
            return String.format("%s %s %d %d %d %d", id, ten, luong, thuong, phuCap, thuNhap);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(nv);
        sc.close();
    }
    
}
