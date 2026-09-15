import java.util.*;

public class J04005 {
    static class ThiSinh{
        private String ten, birth;
        private float diem_sum;
        public ThiSinh(String ten, String birth, float d1, float d2, float d3){
            this.ten = ten;
            this.birth = birth;
            this.diem_sum = d1+d2+d3;
        }
        @Override 
        public String toString(){
            return String.format("%s %s %.1f", ten, birth, diem_sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String ten = sc.nextLine();
        String ns = sc.nextLine();
        float d1 = sc.nextFloat(), d2 = sc.nextFloat(), d3 = sc.nextFloat();
        ThiSinh a = new ThiSinh(ten, ns, d1, d2, d3);
        System.out.println(a);
        sc.close();
    }
}
