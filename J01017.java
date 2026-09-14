import java.util.*;
public class J01017 {
    public static boolean check(String s){
        for (int i = 1; i < s.length(); i++){
            char c1 = s.charAt(i), c0 = s.charAt(i-1);
            if (c1 != c0 - 1 && c1 != c0 + 1){
                return false;
            }
        }
        return true;
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
