import java.util.*;
class Point{
    private double x, y;
    public Point(){}
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public double distance(Point sec_p){
        double x0 = this.x - sec_p.x;
        double y0 = this.y - sec_p.y;
        return Math.sqrt(x0*x0 + y0*y0);
    }
    public static double distance(Point p1, Point p2){
        double x0 = p1.x - p2.x;
        double y0 = p1.y - p2.y;
        return Math.sqrt(x0*x0 + y0*y0);
    }
    @Override 
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            Point p1 = new Point(x1, y1), p2 = new Point(x2, y2);
            System.out.printf("%.4f\n", p1.distance(p2));
        }
        sc.close();
    }
}