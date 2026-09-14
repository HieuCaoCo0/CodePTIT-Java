import java.util.*;

public class J01018 {
    public static boolean check(String s){
        int n = s.length();
        int sum = 0;
        for (int i = 1; i < n; i++){
            int d1 = s.charAt(i) - '0';
            int d0 = s.charAt(i-1) - '0';
            sum += d1;
            if (i == 1) sum += d0;
            if (Math.abs(d0 - d1) != 2) return false;
        }
        return sum % 10 == 0;
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
