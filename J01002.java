import java.util.*;
public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long res = (1 + n)*n/2;
            System.out.println(res);
        }
        sc.close();
    }
}
