import java.util.*;
class Employee
{
	float basic,da,hra,tax,gross_salary;
	
	void input()
	{
		System.out.println("Enter the basic of employee");
		Scanner sc = new Scanner(System.in);
		basic = sc.nextFloat();
		System.out.println("enter the da hra  and tax of employee in percentile");
		da = sc.nextFloat();
		hra = sc.nextFloat();
		tax = sc.nextFloat();
	}
	void calculate()
	{		gross_salary= basic + (basic * (da/100)) + (basic * (hra/100)) - (basic * (tax/100));
	}
	void display()
	{
		System.out.println("gross salary is " + gross_salary);
	}
}
public class EmployeeSalaryClass
{
	public static void main(String args[])
	{
		Employee ob1 = new Employee();
		ob1.input();
		ob1.calculate();
		ob1.display();
	}
}