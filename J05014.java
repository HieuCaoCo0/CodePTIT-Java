import java.util.*;
public class J05014 {
    static class GiaoVien implements Comparable<GiaoVien>{
        private String id, ten, mon, status;
        private double diem;
        public GiaoVien(String id,String ten, String ma, double diem_tin, double diem_cm){
            this.id = id;
            this.ten = ten;
            this.mon = "";
            if (ma.charAt(0) == 'A') this.mon = "TOAN";
            else if (ma.charAt(0) == 'B') this.mon = "LY";
            else if (ma.charAt(0) == 'C') this.mon = "HOA";

            this.diem = diem_tin*2+diem_cm;
            if (ma.charAt(1) == '1') this.diem += 2;
            else if (ma.charAt(1) == '2') this.diem += 1.5;
            else if (ma.charAt(1) == '3') this.diem += 1;

            if (this.diem >= 18) this.status = "TRUNG TUYEN";
            else this.status = "LOAI";
        }
        @Override 
        public int compareTo(GiaoVien o){
            if (this.diem == o.diem) return this.id.compareTo(o.id);
            return Double.compare(o.diem, this.diem);
        }
        @Override 
        public String toString(){
            return String.format("%s %s %s %.1f %s", id, ten, mon, diem, status);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<GiaoVien> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String id = String.format("GV%02d", i);
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            ds.add(new GiaoVien(id, ten, ma, d1, d2));
        }
        Collections.sort(ds);
        for (GiaoVien gv : ds){
            System.out.println(gv);
        } sc.close();
    }
}
