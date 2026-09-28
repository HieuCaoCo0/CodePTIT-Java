import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < n; i++) a.add(sc.nextInt());
        for (int i = 0; i < m; i++) b.add(sc.nextInt());
        // Set<Integer> u = new HashSet<>(a);
        // Set<Integer> i = new HashSet<>(a);
        // u.addAll(b); i.retainAll(b);
        a.retainAll(b);
        
        for (int i : a){
            System.out.printf("%d ", i);
        }System.out.println();
        sc.close();
    }
}
