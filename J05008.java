import java.util.*;

public class J05008 {
    static class Point {
        private double x, y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public static double distance(Point p1, Point p2){
            return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
        }
        static double area(Point[] p){
            double sum = 0;
            int n = p.length;
            for (int i = 0; i < n; i++){
                int j = (i+1) % n;
                sum += p[i].x*p[j].y - p[i].y*p[j].x;
            }
            return Math.abs(sum) / 2;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            Point[] p = new Point[n];
            for (int i = 0; i < n; i++){
                p[i] = new Point(sc.nextDouble(), sc.nextDouble());
            }
            System.out.printf("%.3f\n", Point.area(p));
        }
        sc.close();
    }
}
