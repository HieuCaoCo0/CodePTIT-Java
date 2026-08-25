import java.util.*;

public class J01005 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        int n = sc.nextInt(), h = sc.nextInt();
        for (double i = 1d; i < n; i++){
            System.out.printf("%.6f ", Math.sqrt(i/n)*h);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) solve();
    }
}
