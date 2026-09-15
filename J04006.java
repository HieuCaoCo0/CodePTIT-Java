import java.util.*;
public class J04006 {
    static String chuanHoa(String s){
        String[] a = s.split("/");
        if (a[0].length() == 1) a[0] = "0" + a[0];
        if (a[1].length() == 1) a[1] = "0" + a[1];
        return a[0] + "/" + a[1] + "/" + a[2];
    }
    static class Student{
        private String id, ten, lop, ns;
        private float gpa;
        public Student(){
            id = ten = lop = ns = "";
            gpa = 0;
        }
        
        public Student(String ten, String lop, String ns, float gpa){
            this.ten = ten;
            this.lop = lop;
            this.ns = chuanHoa(ns);
            this.gpa = gpa;

            id = "B20DCCN001";
        }
        @Override 
        public String toString(){
            return String.format("%s %s %s %s %.2f", id, ten, lop, ns, gpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.useLocale(Locale.US);
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ns = sc.nextLine();
        float gpa = sc.nextFloat();
        Student a = new Student(ten, lop, ns, gpa);
        System.out.println(a);
        sc.close();
    }
}
