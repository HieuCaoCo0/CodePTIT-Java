import java.util.*;

public class J01020 {
    static long ans = (1 << 10) - 1;
    static void solve(int n){
        if (n == 0){
            System.out.println("Impossible");
            return;
        }
        long r = 0;
        for (int i = 1; i < 1000000; i ++){
            long x = n*i;
            while (x > 0){
                r |= (1 << x%10);
                x /= 10;
            }
            if (r == ans){
                System.out.println(n*i);
                return;
            }
        }
        System.out.println("Impossible");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            solve(sc.nextInt());
        }
        sc.close();
    }
}
