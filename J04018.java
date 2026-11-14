import java.util.*;

public class J04018 {
    static class SoPhuc{
        private int a, b;
        public SoPhuc(int a, int b){
            this.a = a;
            this.b = b;
        }
        static public SoPhuc add(SoPhuc x, SoPhuc y){
            int a0 = x.a + y.a;
            int b0 = x.b + y.b;
            return new SoPhuc(a0, b0);
        }
        static public SoPhuc mul(SoPhuc x, SoPhuc y){
            int a0 = x.a*y.a - x.b*y.b;
            int b0 = x.a*y.b + x.b*y.a;
            return new SoPhuc(a0, b0);
        }
        static public SoPhuc cal_c(SoPhuc x, SoPhuc y){
            return mul(x,add(x,y));
        }
        static public SoPhuc cal_d(SoPhuc x, SoPhuc y){
            return mul(add(x, y), add(x, y));
        }
        @Override 
        public String toString(){
            return a + " + " + b + "i";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc c = SoPhuc.cal_c(a, b);
            SoPhuc d = SoPhuc.cal_d(a, b);
            System.out.println(c + ", " + d);
        }
        sc.close();
    }
}
