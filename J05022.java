import java.util.*;

public class J05022 {
    static class SinhVien{
        private String id, ten, lop, email;
        public SinhVien(String id, String ten, String lop, String email){
            this.id = id;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }
        @Override 
        public String toString(){
            return id + " " + ten + " " + lop + " " + email;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String,List<SinhVien>> map = new HashMap<>();
        while (t-- > 0){
            SinhVien sv = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            if (map.get(sv.lop) == null){
                List<SinhVien> tmp = new ArrayList<>();
                tmp.add(sv);
                map.put(sv.lop, tmp); 
            }
            else map.get(sv.lop).add(sv);
        }
        int q = sc.nextInt();
        while (q-- > 0){
            String lop = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (SinhVien sv : map.get(lop)){
                System.out.println(sv);
            }
        }
        sc.close();
    }
}
