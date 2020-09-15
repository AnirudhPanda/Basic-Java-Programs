import java.lang.Math;
public class Area {
    public static void main(String[] args) {
      double x=3.0,y=4.0,z=5.0;
      double s=(x+y+z)/2;
      double a= Math.sqrt(s*(s-x)*(s-y)*(s-z));

      System.out.printf("Area is = %4.2f", a);
    }
}