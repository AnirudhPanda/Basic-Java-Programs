import java.util.*;

class ComplexClass
{
	float real,img;
	
	void input()
	{
		System.out.println("Enter the real and imaginary part");
		Scanner sc = new Scanner(System.in);
		real = sc.nextFloat();
		img = sc.nextFloat();
	}
	void addition(ComplexClass ob1, ComplexClass ob2)
	{
		real = ob1.real + ob2.real;
		img = ob1.img + ob2.img;
		
	}
		
	void display()
	{
		System.out.println("The addition of two complex number is: " + real + " " + "+ " + img + "i");
		
	}

}
public class ComplexAdditionClass
{
	public static void main(String args[])
	{
		ComplexClass ob1 = new ComplexClass();
		ComplexClass ob2 = new ComplexClass();
		ComplexClass ob3 = new ComplexClass();
		ob1.input();
		ob2.input();
		ob3.addition(ob1,ob2);
		ob3.display();
	}
}