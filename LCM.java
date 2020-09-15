public class LCM {
	public static void main(String[] args) {
		int n1=24,n2=36,lcm;
		lcm= (n1>n2)? n1:n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.printf				("The LCM of the two numbers is %d", lcm);
				break;
			}
			lcm++;
		}
	}
}
