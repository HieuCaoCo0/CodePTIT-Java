import java.util.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long can = (long) Math.sqrt(n);
            long ans = 1;
            for (long i = 2; i <= can; i++){
                while (n%i == 0){
                    ans = i;
                    n /= i;
                }
            }
            if (n > 1) ans = n;
            System.out.println(ans);
        }
        sc.close();
    }
}
