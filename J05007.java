import java.util.*;

public class J05007 {
    static class NhanVien implements Comparable<NhanVien> {
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
        @Override 
        public int compareTo(NhanVien o){
            String[] a1 = this.ns.split("/");
            String[] a2 = o.ns.split("/");
            int d1 = Integer.parseInt(a1[0]);
            int m1 = Integer.parseInt(a1[1]);
            int y1 = Integer.parseInt(a1[2]);
            int d2 = Integer.parseInt(a2[0]);
            int m2 = Integer.parseInt(a2[1]);
            int y2 = Integer.parseInt(a2[2]);
            if (y1 == y2){
                if (m1 == m2){
                    if (d1 == d2) return this.ma.compareTo(o.ma);
                    return Integer.compare(d1, d2);
                }
                return Integer.compare(m1, m2);
            } return Integer.compare(y1, y2);
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
        Collections.sort(ds);
        for (NhanVien nv : ds){
            System.out.println(nv);
        }
        sc.close();
    }
}
