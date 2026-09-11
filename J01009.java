import java.util.*;

public class J01009 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long cur = 1, sum = 1;
        for (int i = 2; i <= n; i++){
            cur *= i;
            sum += cur;
        }
        System.out.println(sum);
    }
}
