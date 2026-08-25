import java.util.*;
public class J01006 {
    static Scanner sc = new Scanner(System.in);
    static long[] fibo = new long[93];
    static void init(){
        fibo[0] = 0; fibo[1] = 1;
        for (int i = 2; i < 93; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    } 
    public static void main(String[] args) {
        init();
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }
}
