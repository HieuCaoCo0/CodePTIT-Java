import java.util.*;

public class J04007 {
    static class NhanVien{
        private String id, ten, gt, ns, addr, maThue, ngay_ky;
        public NhanVien(String ten, String gt, String ns, String addr, String maThue, String ngay_ky){
            id = "00001";
            this.ten = ten;
            this.gt = gt;
            this.ns = ns;
            this.addr = addr;
            this.maThue = maThue;
            this. ngay_ky = ngay_ky;
        }
        @Override 
        public String toString(){
            return id + " " + ten + " " + gt + " " + ns + " " + addr + " " + maThue + " " + ngay_ky; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gt = sc.nextLine();
        String ns = sc.nextLine();
        String dc = sc.nextLine();
        String maThue = sc.nextLine();
        String ngayKy = sc.nextLine();
        NhanVien nv = new NhanVien(ten, gt, ns, dc, maThue, ngayKy);
        System.out.println(nv);
        sc.close();
    }
}
