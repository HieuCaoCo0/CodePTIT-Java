import java.util.*;

public class J01024 {
    static boolean check(String s){
        for (char c : s.toCharArray()){
            if (c != '0' && c != '1' && c != '2'){
                return false;
            }
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
