import java.util.*;

public class J04003 {
    static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static class PhanSo {
        private long tu, mau;

        PhanSo(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }

        public void rutGon() {
            long g = gcd(tu, mau);
            tu /= g;
            mau /= g;
            if (mau < 0) {
                tu = -tu;
                mau = -mau;
            }
        }
        public static PhanSo add(PhanSo a, PhanSo b){
            PhanSo res = new PhanSo(0, 0);
            res.tu = a.tu*b.mau + a.mau*b.tu;
            res.mau = a.mau*b.mau;
            res.rutGon();
            return res;
        }

        @Override
        public String toString() {
            return tu + "/" + mau;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextLong();
        long b1 = sc.nextLong();
        long a2 = sc.nextLong();
        long b2 = sc.nextLong();

        PhanSo ps1 = new PhanSo(a1, b1);
        PhanSo ps2 = new PhanSo(a2, b2);

        System.out.println(PhanSo.add(ps1, ps2));
        
        sc.close();
    }
}
