import java.util.*;

public class J01004 {
    static Scanner sc = new Scanner(System.in);
    static boolean nt(int n){
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        int sqr = (int) Math.sqrt(n);
        for (int i = 2; i <= sqr; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    static void solve(){
        int n = sc.nextInt();
        if (nt(n)) System.out.println("YES");
        else System.out.println("NO");
    }    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0){
            solve();
        }
    }
}
