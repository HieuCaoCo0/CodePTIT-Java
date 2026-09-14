import java.util.*;;

public class J02011 {
    public static void sort(int[] a){
        int n = a.length;
        for (int i = 0; i < n-1; i++){
            int min_id = i;
            for (int j = i + 1; j < n; j++){
                if (a[j] < a[min_id]){
                    min_id = j;
                }
            }
            int tmp = a[i]; a[i] = a[min_id]; a[min_id] = tmp;
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
