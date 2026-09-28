import java.util.*;
public class J02007 {
    static boolean nt(int n){
        if (n < 2) return false;
        int sqr = (int) Math.sqrt(n);
        for (int i = 2; i <= sqr; i++){
            if (n % i == 0) return false;
        } return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            int n = sc.nextInt();
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int j = 0; j < n; j++){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0)+1);
            }
            System.out.println("Test " + i + ":");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                int num = entry.getKey(), cnt = entry.getValue();
                System.out.printf("%d xuat hien %d lan\n", num, cnt);
            }
        }
        sc.close();
    }
}
