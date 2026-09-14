import java.util.*;

public class J05043 {
    static class NhanVien{
        private String id, ten;
        private int luong, phuCap, tamUng, conLai;
        NhanVien(){}
        NhanVien(String id, String ten, String role, int luongCB, int ngayCong){
            this.id = id;
            this.ten = ten;
            this.luong = luongCB*ngayCong;

            if (role.equals("GD")) this.phuCap = 500;
            else if (role.equals("PGD")) this.phuCap = 400;
            else if (role.equals("TP")) this.phuCap = 300;
            else if (role.equals("KT")) this.phuCap = 250;
            else this.phuCap = 100;

            int tmp = (luong+phuCap) * 2/3;
            if (tmp < 25000) this.tamUng = Math.round(tmp/1000.0f) * 1000;
            else this.tamUng = 25000;

            this.conLai = luong + phuCap - tamUng;
        }
        @Override 
        public String toString(){
            return id + " " + ten + " " + phuCap + " " + luong + " " + tamUng + " " + conLai;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        NhanVien[] ds = new NhanVien[t];
        for (int i = 0; i < t; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String role = sc.nextLine();
            int luongCB = sc.nextInt(), ngayCong = sc.nextInt();
            String id = String.format("NV%02d", i+1);
            ds[i] = new NhanVien(id, ten, role, luongCB, ngayCong);
        }
        for (NhanVien x : ds) System.out.println(x);
        sc.close();
    }
}
