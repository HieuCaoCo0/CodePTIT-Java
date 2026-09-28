import java.io.*;
import java.util.*;

public class J07005 {
    static int btoi(String bin){
        int res = 0;
        int n = bin.length();
        for (int i = 0; i < n; i++){
             res = res * 2 + (bin.charAt(i) - '0');
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        File file = new File("DATA.IN");
        Scanner sc = new Scanner(file);
        Map<String, Integer> map = new HashMap<>();
        while (sc.hasNext()){
            String bin = sc.next();
            if (map.get(bin) == null) map.put(bin, 1);
            else map.put(bin, map.get(bin) + 1);
        }
        Map<Integer, Integer> res = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String bin = entry.getKey();
            int cnt = entry.getValue();
            int n = btoi(bin);
            res.put(n, cnt);
        }
        for (Map.Entry<Integer, Integer> entry : res.entrySet()){
            int k = entry.getKey(), cnt = entry.getValue();
            System.out.println(k + " " + cnt);
        }
        sc.close();
    }
}
