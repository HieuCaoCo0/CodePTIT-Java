import java.util.*;

public class J01007 {
    static Scanner sc = new Scanner(System.in);
    static long[] f = new long[93];
    static void init(){
        f[0] = 0; f[1] = 1;
        for (int i = 2; i < 93; i++){
            f[i] = f[i-1] + f[i-2];
        }
    }
    static boolean check(long n){
        for (long x : f){
            if (x == n) return true;
            else if (x > n) return false;
        } return false;
    }
    public static void main(String[] args) {
        init();
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            if (check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
