import java.util.*;

public class J04019 {
    static class Point {
        double x, y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public static Point nextPoint(Scanner sc){
            Point res = new Point(sc.nextDouble(), sc.nextDouble());
            return res;
        }
        public static double dis(Point a, Point b){
            double x0 = a.x - b.x;
            double y0 = a.y - b.y;
            return Math.sqrt(x0*x0 + y0*y0);
        }
    }
    static class Triangle {
        private double a, b, c;
        public Triangle(Point p1, Point p2, Point p3){
            a = Point.dis(p1,p2);
            b = Point.dis(p2,p3);
            c = Point.dis(p1,p3);
        }
        public boolean valid(){
            return a + b + c > 2* Math.max(a, Math.max(c, b));
        } 
        public String getPerimeter(){
            return String.format("%.3f", a+b+c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
