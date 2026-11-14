import java.util.*;

public class J02012 {
    public static void sort(int[] a, int n){
        System.out.println("Buoc 0: "+a[0]);
        for (int i = 1; i < n; i++){
            
            System.out.println();
            for (int j = i-1; j >= 0; j--){
                if (a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            System.out.print("Buoc " + i + ": ");
            for (int j = 0; j < i; j++) System.out.print(a[j] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        sort(a, n);
        sc.close();
    }
}
