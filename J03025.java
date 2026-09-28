import java.util.*;

public class J03025 {
    static boolean check(String s){
        boolean ok = true;
        int n = s.length();
        for (int i = 0; i < n/2; i++){
            char c1 = s.charAt(i), c2 = s.charAt(n-i-1);
            if (c1 != c2){
                if (!ok) return false;
                ok = false;
            }
        }
        if (ok){
            if (n % 2 == 0) return false;
            else return true;
        } return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
