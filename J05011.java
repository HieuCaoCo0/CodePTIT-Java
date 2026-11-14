import java.util.*;
public class J05011 {
    static int doiPhut(String s){
        String[] a = s.split(":");
        int gio = Integer.parseInt(a[0]);
        int phut = Integer.parseInt(a[1]);
        return gio*60+phut;
    }
    static class GameThu implements Comparable<GameThu>{
        private String ma, ten;
        private int gio, phut;
        public GameThu(String ma, String ten, String vao, String ra){
            this.ma = ma;
            this.ten = ten;
            int phut_choi = doiPhut(ra) - doiPhut(vao);
            this.gio = phut_choi / 60;
            this.phut = phut_choi - this.gio*60;
        }
        @Override 
        public int compareTo(GameThu o){
            if (o.gio == this.gio){
                if (o.phut == this.phut) return this.ma.compareTo(o.ma);
                return Integer.compare(o.phut, this.phut);
            } return Integer.compare(o.gio, this.gio);
        }
        @Override 
        public String toString(){
            return ma + " " + ten + " " + gio + " gio " + phut + " phut";
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<GameThu> ds = new ArrayList<>();
        while (t-- > 0) {
            GameThu a = new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for (GameThu a : ds){
            System.out.println(a);
        }
        sc.close();
    }
}
