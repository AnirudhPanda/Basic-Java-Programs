import java.util.*;
public class AdamNumber{
	public static void main(String[] args) 
	{ 
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till which you need adam number: ");
		num=sc.nextInt();
		for(int i=0;i<=num;i++){
			
		
			if (checkAdamNumber(i)) 
				System.out.println(i+ " is a Adam Number"); 
			else
				System.out.println(i+ " is Not a Adam Number");	 
	} 
}
	static int reverseDigits(int num) 
	{ 
		int rev = 0; 
		while (num > 0) 
		{ 
			rev = rev * 10 + num % 10; 
			num /= 10; 
		} 
		return rev; 
	} 
	static int square(int num) 
	{ 
		return (num * num); 
	} 

	static boolean checkAdamNumber(int num) 
	{ 
		// Square first number and square 
		// reverse digits of second number 
		int a = square(num); 
		int b = square(reverseDigits(num)); 
		
		// If reverse of b equals a then given 
		// number is Adam number 
		if (a == reverseDigits(b)) 
		return true; 
		return false;		 
	} 
}
