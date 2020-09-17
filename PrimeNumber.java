public class PrimeNumber
{
	public static void main(String[] args)
	{
		int start=1,end=100;
		
		for(int i = start ; i <= end ; i++)
		{
			
			Boolean flag= true;
			for(int j = 2 ; j <= i-1 ; j++)	
			{
				if(i % j == 0)
					flag=false;
			}
			if(flag==true && i!=1)
				System.out.println(i);
		}
	
	}
}