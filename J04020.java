import java.util.*;

public class J04020 {
    static boolean nt(Integer n){
        if (n < 2) return false;
        Integer sqr = (int) Math.sqrt(n);
        for (int i = 2; i <= sqr; i++){
            if (n % i == 0) return false;
        }return true;
    }
    static class Pair<T, K>{
        private Integer x, y;
        public Pair(Integer a, Integer b){
            x = a;
            y = b;
        }
        public boolean isPrime(){
            return nt(x) && nt(y);
        }
        @Override
        public String toString(){
            return x + " " + y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
