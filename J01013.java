import java.util.*;

public class J01013 {
    public static final int MAXN = 20000006;
    public static int[] nt = new int[MAXN];
    public static void qhd(){
        nt[0] = 1; nt[1] = 1;
        for (int i = 2; i * i < MAXN; i++){
            if (nt[i] == 0){
                // nt[i] = i;
                for (int j = i*i; j < MAXN; j += i){
                    nt[j] = i;
                }
            }
        }

        for (int i = 2; i < MAXN; i++){
            if (nt[i] > 0) nt[i] += nt[i/nt[i]];
            else nt[i] = i;
        }
    }
    public static void main(String[] args) {
        qhd();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 0;
        while (t-- > 0){
            int n = sc.nextInt();
            res += nt[n];
        }
        System.out.println(res);
        sc.close();
    }
}
