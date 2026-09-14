import java.util.*;

public class J02013 {
    public static void sort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            boolean ok = true;
            for (int j = 0; j < n-i-1; j++){
                if (a[j] > a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                    ok = false; 
                }
            }
            if (ok) break;
            System.out.printf("Buoc %d: ", i+1);
            for (int x : a) System.out.print(x + " ");
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sort(a);
        sc.close();
    }
}
