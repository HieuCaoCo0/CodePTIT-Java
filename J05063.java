import java.util.*;

public class J05063 {
    static class HangTu {
        private int heSo, bac; 
        public HangTu(String s){
            String[] a = s.replace("*x^", " ").split("\\s+");
            heSo = Integer.parseInt(a[0]);
            bac = Integer.parseInt(a[1]);
        }
        public HangTu(int heSo, int bac){
            this.heSo = heSo;
            this.bac = bac;
        }
    }
    static class DaThuc{
        private ArrayList<HangTu> a;
        public DaThuc(String s){
            a = new ArrayList<>();
            String[] ht = s.replace("+", " ").split("\\s+");
            for (String w : ht){
                a.add(new HangTu(w));
            }
        }
        public DaThuc(){
            a = new ArrayList<>();
        }

        public DaThuc cong(DaThuc q){
            int n = this.a.size(), m = q.a.size();
            DaThuc res = new DaThuc();
            int i = 0, j = 0;
            while (i < n && j < m){         
                int b1 = this.a.get(i).bac, b2 = q.a.get(j).bac; 
                if (b1 > b2) {
                    HangTu tmp = new HangTu(this.a.get(i).heSo, b1);
                    res.a.add(tmp);           
                    i++;
                }
                else if (b2 < b1){
                    HangTu tmp = new HangTu(this.a.get(j).heSo, b2);
                    res.a.add(tmp);  
                    j++;
                }
                else{
                    HangTu tmp = new HangTu(this.a.get(i).heSo + q.a.get(i).heSo, b2);
                    res.a.add(tmp);
                    i++; j++;
                }
            }
            while (i < n) {
                res.a.add(this.a.get(i));
                i++;
            }
            while (j < m) {
                res.a.add(q.a.get(j));
                j++;
            }
            return res;
        }
        @Override 
        public String toString(){
            int n = a.size();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++){
                HangTu x = a.get(i);
                sb.append(String.format("%dx^%d", x.heSo, x.bac, null));
                if (i != n-1) sb.append(" + ");
            }
            return sb.toString();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
