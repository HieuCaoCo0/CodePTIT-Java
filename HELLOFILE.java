import java.util.*;
import java.io.*;

public class HELLOFILE {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNextLine()) System.out.println(sc.nextLine());
        sc.close();
    }
}
