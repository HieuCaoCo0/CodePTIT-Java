import java.util.*;

public class J05004 {
    static String chuanHoa(String s){
        String[] a = s.split("/");
        int d = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int y = Integer.parseInt(a[2]);
        return String.format("%02d/%02d/%04d", d,m,y);
    }
    static String chuanHoaTen(String s){
        String[] a = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (String w : a){
            if (!w.isEmpty()){
                sb.append(w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase() + " ");
            }
            
        }
        return sb.toString().trim();
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
        public double getGPA(){return this.gpa;}
        @Override 
        public String toString(){
            return String.format("%s %s %s %s %.2f", ma, ten, lop, ns, gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String ma = "B20DCCN" + String.format("%03d", i);
            String ten = chuanHoaTen(sc.nextLine());
            
            String lop = sc.nextLine();
            String ns = chuanHoa(sc.nextLine());
            Double gpa = Double.parseDouble(sc.nextLine().trim());
            SinhVien sv = new SinhVien(ma, ten, ns, lop, gpa);
            // System.out.println(sv);
            ds.add(sv);
        }
        ds.sort((a,b) -> Double.compare(b.getGPA(),a.getGPA()));
        for (SinhVien sv : ds){
            System.out.println(sv);
        }
        sc.close();
    }
}
