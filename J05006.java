import java.util.*;

public class J05006 {
    static class NhanVien {
        private String ma, ten, gt, ns, dia_chi, ma_thue, ngay_ky;
        public NhanVien(String ma, String ten, String gt, String ns, String dia_chi, String ma_thue, String ngay_ky){
            this.ma = ma;
            this.ten = ten;
            this.ns = ns;
            this.gt = gt;
            this.dia_chi = dia_chi;
            this.ma_thue = ma_thue;
            this.ngay_ky = ngay_ky;
        }
        @Override 
        public String toString(){
            return String.format("%s %s %s %s %s %s %s", ma, ten, gt, ns, dia_chi, ma_thue, ngay_ky);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String ma = String.format("%05d", i);
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dia_chi = sc.nextLine();
            String ma_thue = sc.nextLine();
            String ngay_ky = sc.nextLine();
            NhanVien nv = new NhanVien(ma, ten, gt, ns, dia_chi, ma_thue, ngay_ky);
            ds.add(nv);
        }
        for (NhanVien nv : ds){
            System.out.println(nv);
        }
        sc.close();
    }
}
