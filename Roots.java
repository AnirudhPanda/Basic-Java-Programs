import java.lang.Math;
public class Roots {
	public static void main(String[] args){
		int b=2,a=1,c=1;
		double r = (-b + Math.sqrt(b*b-	4*a*c))/2*a;
		double q = (-b - Math.sqrt(b*b-	4*a*c))/2*a;
		System.out.println("Roots are " +r + " and " + +q);
	}
}
