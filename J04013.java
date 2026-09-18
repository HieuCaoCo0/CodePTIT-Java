import java.util.*;

public class J04013 {
    public static String lamTron(float f){
        if (f == (int)f){
            return String.format("%.0f", f);
        } return String.format("%.1f", f);
    }
    static class ThiSinh{
        private String id, name, status;
        private float priority, sum;
        public ThiSinh(String id, String ten, float d1, float d2, float d3){
            this.id = id;
            name = ten;
            sum = d1*2 + d2 + d3;
            priority = 0;
            String kv= id.substring(0, 3);
            if (kv.equals("KV1")) priority = 0.5f;
            else if (kv.equals("KV2")) priority = 1;
            else if (kv.equals("KV3")) priority = 2.5f;

            if (sum + priority < 24) status = "TRUOT";
            else status = "TRUNG TUYEN";
        }
        @Override 
        public String toString(){
            String s_sum = lamTron(sum), s_prio = lamTron(priority);
            return id + " " + name + " " + s_prio + " " + s_sum + " " + status;   
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String id = sc.nextLine();
        String ten = sc.nextLine();
        ThiSinh a = new ThiSinh(id, ten, sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(a);
        sc.close();
    }
}
