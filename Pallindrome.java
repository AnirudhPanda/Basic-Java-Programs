public class Pallindrome {
	public static void main(String[] args) {
		int n=120,temp;
		int sum=0, rem;
	temp=n;
	while(n>0) {
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
		}
	if(sum==temp)
		System.out.println("Its a Pallindrome");
	else
		System.out.println("Not a Pallindrome");
	}
}