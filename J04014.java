import java.util.*;

public class J04014 {
    static long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    static class PhanSo{
        private long tu, mau;
        public PhanSo(long a, long b){
            if (b < 0){
                a = -a;
                b = -b;
            }
            
            tu = a;
            mau = b;
        }
        public PhanSo(){}
        public void rutGon(){
            long ucln = gcd(Math.abs(tu), Math.abs(mau));
            mau /= ucln;
            tu /= ucln;
        }
        public static PhanSo tong(PhanSo a, PhanSo b){
            long x = a.tu*b.mau + a.mau*b.tu;
            long y = a.mau*b.mau;

            PhanSo res = new PhanSo(x, y);
            res.rutGon();
            return res;
        }
        public static PhanSo tich(PhanSo a, PhanSo b){
            long x = a.tu*b.tu;
            long y = a.mau*b.mau;

            PhanSo res = new PhanSo(x, y);
            res.rutGon();
            return res;
        }
        @Override 
        public String toString(){
            return tu + "/" + mau;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = PhanSo.tich(PhanSo.tong(a, b), PhanSo.tong(a, b));
            PhanSo d = PhanSo.tich(a, PhanSo.tich(c, b));
            System.out.println(c + " " + d);
        }
        sc.close();
    }
}
