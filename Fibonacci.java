public class Fibonacci{
	public static void main(String[] args){
		int n=40,t1=0,t2=1;
		System.out.print("First " + n + " terms: ");
		for(int i=1;i<=n;i++)
		{
			System.out.print(t1 + " , ");
			int sum=t2+t1;
			t1=t2;
			t2=sum;
			
		}
		
	}
}