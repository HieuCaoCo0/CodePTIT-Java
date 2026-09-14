import java.util.*;;

public class J04002 {
    static String st(String s){
        if(s.length()==1) return "" + Character.toUpperCase(s.charAt(0));
        s = s.toLowerCase();
        return "" + Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String c = sc.next();
        if(a>0 && b>0) System.out.printf("%d %d %s",(a+b)*2, a*b, st(c));
        else System.out.println("INVALID");
        sc.close();
    }

    // public static String chuanHoa(String s){
    //     return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    // }
    // static class Rectangle {
    //     private double w, h;
    //     private String c;
    //     public Rectangle(){
    //         w = h = 1;
    //         c = "";
    //     }
    //     public Rectangle(double w, double h, String c){
    //         this.w = w;
    //         this.h = h;
    //         this.c = chuanHoa(c);
    //     }
    //     public double getWidth(){return w;}
    //     public double getHeight(){return h;}
    //     public String getColor(){return c;}
    //     public void setColor(String new_c){c = new_c;}
    //     public double findArea(){
    //         return w*h;
    //     }
    //     public double findPerimeter(){
    //         return (w+h)*2;
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     double w = sc.nextDouble(), h = sc.nextDouble();
    //     String c = sc.next();
    //     if (w <= 0 || h <= 0) System.out.println("INVALID");
    //     else{
    //         Rectangle rec = new Rectangle(w, h, c);
    //         System.out.println(rec.findPerimeter() + " " + rec.findArea() + " " + rec.getColor());
    //     }
    //     sc.close();
    // }
}
