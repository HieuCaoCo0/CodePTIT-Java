import java.util.*;

public class J04009 {
    static class Point {
        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public static double distance(Point p1, Point p2) {
            double dx = p1.x - p2.x;
            double dy = p1.y - p2.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    static class Triangle {
        private double a, b, c;

        public Triangle(Point p1, Point p2, Point p3) {
            a = Point.distance(p1, p2);
            b = Point.distance(p2, p3);
            c = Point.distance(p1, p3);
        }

        public boolean check() {
            double m = Math.max(a, Math.max(b, c));
            return 2 * m < a + b + c;
        }

        public String dienTich() {
            double S = Math.sqrt(
                (a + b + c) *
                (a + b - c) *
                (a - b + c) *
                (-a + b + c)
            ) / 4;

            return String.format("%.2f", S);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

            Triangle triangle = new Triangle(p1, p2, p3);

            if (triangle.check()) {
                System.out.println(triangle.dienTich());
            } else {
                System.out.println("INVALID");
            }
        }

        sc.close();
    }
}