import java.util.*;

public class J04015 {
    static class Teacher{
        private String id, ten;
        private int bac, phuCap, thuNhap;
        public Teacher(String id, String ten, int luongCB){
            this.id = id;
            this.ten = ten;

            String role = id.substring(0, 2);
            phuCap = 0;
            if (role.equals("HT")) phuCap = 2000000;
            else if (role.equals("HP")) phuCap = 900000;
            else if (role.equals("GV")) phuCap = 500000;

            bac = Integer.parseInt(id.substring(2));
            thuNhap = luongCB*bac + phuCap;
        }
        @Override 
        public String toString(){
            return id + " " + ten + " " + bac + " " + phuCap + " " + thuNhap;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String ten = sc.nextLine();
        int luongCB = sc.nextInt();
        Teacher a = new Teacher(id, ten, luongCB);
        System.out.println(a);
        sc.close();

    }
}
