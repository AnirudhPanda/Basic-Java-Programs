
class Employee
{
	int basic,da,hra,tax,gross_sal;
	Employee(int basic1,int hra1,int da1,int tax1)
	{
		basic=basic1;
		hra=hra1;
		da=da1;
		tax=tax1;

	}
	void gross_salary()
	{
	    hra=(basic*(hra/100));
		da=(basic*(da/100));
		gross_sal=basic+hra+da-tax;
	}
	void display()
	{
		System.out.println("Basic Salary: "+basic);
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("TAX: "+tax);
		System.out.println("Gross Salary: "+gross_sal);
		
	}
}
public class EmployeeConstructor
{
	public static void main(String args[])
	{
		Employee ob=new Employee(15000,5,8,8);
		ob.gross_salary();
		ob.display();
	}
}