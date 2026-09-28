import java.util.*;
public class J01021 {
    public static  final Long MOD = 1000000007L;
    static Long pow(Long n, Long k){
        if (k == 0) return 1L;
        if (k == 1) return n % MOD;
        Long x = pow(n, k/2);
        Long y = (x*x)%MOD;
        if (k % 2 == 0) return y;
        else return (y*n) % MOD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 20;
        while (t-- > 0){
            Long a = sc.nextLong(), b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(pow(a, b));
        }
        sc.close();
    }
}
