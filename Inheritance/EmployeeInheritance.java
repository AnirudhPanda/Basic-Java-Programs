import java.util.*;
class Employee {
    private String empName;
    private int empId;
    
    Employee(){
        empName="Anirudh";
        empId=190610193;
    }
    
    Employee(String name, int id){
        empName=name;
        empId=id;
    }
    
    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        empName=sc.nextLine();
        System.out.println("Enter employee id: ");
        empId=sc.nextInt();
    }
    void displayData()
		{
			System.out.print(empName+"\t"+empId);
		}
}

class Manager extends Employee{
    private double basicSalary;
    private byte DA;
    private byte HRA;
    double gross;
    
    Manager(){
        super();
        basicSalary=50000;
        DA=80;
        HRA=50;
    }
    
    Manager(String name,int id,double basic, byte DA1, byte HRA1){
        super(name,id);
        basicSalary=basic;
        DA=DA1;
        HRA=HRA1;
    }
    
    void getInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the basic salary:");
        basicSalary=sc.nextDouble();
		System.out.println("Enter the DA(<128)");
		DA=sc.nextByte();
		System.out.println("Enter the HRA(<128)");
		HRA=sc.nextByte();
    }
    
    void calSal(){
        gross=basicSalary+DA+HRA;
    }
    
    void printInfo()
	{
		System.out.println("\t\t"+basicSalary+"\t"+DA+"\t"+HRA+"\t"+gross);
	}
}

public class EmployeeInheritance{
    public static void main(String args[]){
        // asks you everything
        Manager ob=new Manager();
        ob.inputData();
        ob.getInfo();
        ob.calSal();
        System.out.println("Details of Employee is: ");
        ob.displayData();
        ob.printInfo();
        
        // parameterised constructor
        Manager ob1=new Manager("Anirudhh",9,40000,(byte)10,(byte)15);
        ob1.calSal();
        System.out.println("DETAILS of EMPLOYEES: ");
        ob1.displayData();
        ob1.printInfo();
        
        // default constructor
        Manager ob2=new Manager();
        ob1.calSal();
        System.out.println("details of employees: ");
        ob2.displayData();
        ob2.printInfo();
    }
}