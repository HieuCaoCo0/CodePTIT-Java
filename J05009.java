import java.util.*;

public class J05009 {
    static class ThiSinh implements Comparable<ThiSinh> {
        private int ma;
        private String ten, ns;
        private double diem;
        public ThiSinh(int ma, String ten, String ns, double d1, double d2, double d3){
            this.ma = ma;
            this.ten = ten;
            this.ns = ns;
            this.diem = d1+d2+d3;
        }
        @Override
        public String toString(){
            return String.format("%d %s %s %.1f", ma, ten, ns, diem);
        }
        @Override 
        public int compareTo(ThiSinh o){
            if (this.diem == o.diem) return Integer.compare(this.ma, o.ma);
            return Double.compare(o.diem, this.diem);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<ThiSinh> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            ThiSinh ts = new ThiSinh(i, sc.nextLine(), sc.nextLine(), 
                Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(ts);
        }
        Collections.sort(ds);
        System.out.println(ds.get(0));
        int i = 1;
        while (ds.get(i).diem == ds.get(0).diem){
            System.out.println(ds.get(i));
            i++;
        }
        sc.close();
    }
}
