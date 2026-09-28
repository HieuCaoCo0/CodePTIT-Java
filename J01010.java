import java.util.*;

public class J01010 {
    static void solve(String s){
        StringBuilder sb = new StringBuilder(s);
        boolean ok = false;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c != '0' && c != '1' && c != '8' && c != '9'){
                System.out.println("INVALID");
                return;
            }

            if (c == '1'){
                sb.setCharAt(i, '1');
                ok = true;
            }
            else sb.setCharAt(i, '0');
        }
        
        if (ok){
            int i = 0;
            while (sb.charAt(i) == '0') i++;
            sb.delete(0, i);
            System.out.println(sb.toString());
        } 
        else System.out.println("INVALID");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            solve(s);
        }
        sc.close();
    }
    
}

