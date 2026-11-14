import java.util.*;
public class J05019 {
    public static double doiPhut(String s){
        String a[] = s.split(":");
        double gio = Double.parseDouble(a[0]);
        double phut = Double.parseDouble(a[1]);
        return gio*60+phut;
    }
    static class TramDo {
        private String id, ten;
        private double total_rain, total_time, tb;
        public TramDo(int i,String ten){
            this.id = String.format("T%02d", i);
            this.ten = ten;
            this.total_rain = 0;
            this.total_time = 0;
        }
        public void update(String start, String end, double luongMua){
            total_time += (doiPhut(end) - doiPhut(start)) / 60;
            total_rain += luongMua;
        }
        @Override 
        public String toString(){
            this.tb = total_rain / total_time;
            return String.format("%s %s %.2f", id, ten, tb);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, TramDo> map = new LinkedHashMap<>();
        while (t--> 0){
            String ten = sc.nextLine();
            if (map.get(ten) == null){
                map.put(ten, new TramDo(map.size()+1, ten));
            }
            map.get(ten).update(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        }
        for (Map.Entry<String, TramDo> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
        sc.close();
    }
}
