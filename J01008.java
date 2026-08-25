import java.util.*;

public class J01008 {
    public static Scanner sc = new Scanner(System.in);
    public static void solve(){
        int n = sc.nextInt();
        int sqr = (int) Math.sqrt(n);
        for (int i = 2; i <= sqr; i++){
            if (n % i == 0){
                int cnt = 0;
                while (n % i == 0){
                    cnt++;
                    n/=i;
                }
                System.out.printf("%d(%d) ", i, cnt);
            }
        }
        if (n > 1) System.out.printf("%d(1)", n);
        System.out.println();
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            System.out.printf("Test %d: ", i);
            solve();
        }
    }
}
