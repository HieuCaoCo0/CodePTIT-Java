import java.util.*;
import java.io.*;
public class J07002 {
    public static void main(String[] args) throws IOException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        Long sum = 0L;
        while (sc.hasNext()){
            try{
                sum += Integer.parseInt(sc.next());
            } catch(NumberFormatException e){
                continue;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
