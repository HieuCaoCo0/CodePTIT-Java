import java.util.*;
public class J01012 {
    public static Scanner sc = new Scanner(System.in);
    public static void solve(){
        int n = sc.nextInt();
        int cnt = 0;
        int sqr = (int) Math.sqrt(n);
        for (int i = 1; i <= sqr; i++){
            if (n % i == 0){
                if (i % 2 == 0) cnt++;
                if (n/i % 2 == 0) cnt++;
            }
        }
        if (sqr*sqr == n && sqr % 2 == 0) cnt--;
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0){
            solve();
        }
    }
}
