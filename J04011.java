import java.util.*;


public class J04011 {
    static class Vector{
        private double x, y, z;
        public Vector(Point3D p1, Point3D p2){
            x = p1.x - p2.x;
            y = p1.y - p2.y;
            z = p1.z - p2.z;
        }
        public Vector(){}
        public static Vector tichCoHuong(Vector a, Vector b){
            Vector res = new Vector();
            res.x = a.y*b.z - a.z*b.y;
            res.y = a.z*b.x - a.x*b.z;
            res.z = a.x*b.y - a.y*b.x;
            return res;
        }
        public static double tichVoHuong(Vector a, Vector b){
            return a.x*b.x + a.y*b.y + a.z*b.z;
        }
    }
    static class Point3D{
        private double x, y, z;
        public Point3D(double a, double b, double c){
            x = a; y = b; z = c;
        }
        public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
            Vector v12 = new Vector(p2, p1);
            Vector v13 = new Vector(p3, p1);
            Vector v14 = new Vector(p4, p1);
            Vector h = Vector.tichCoHuong(v12, v13);
            double check = Vector.tichVoHuong(h, v14);
            if (check == 0.0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            
            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
