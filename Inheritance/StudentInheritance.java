class Student {
    private String name;
    private int roll;
    Student(){
        
    }
    Student(String name1, int roll1){
        this.name=name1;
        this.roll=roll1;
    }
    
    void printStudent(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll: "+roll);
    }
}

class Test extends Student {
    private int mark1,mark2,mark3;
    
    Test(String name1,int roll1,int mark11,int mark22,int mark33){
        super(name1,roll1);
        this.mark1=mark11;
        this.mark2=mark22;
        this.mark3=mark33;
    }
    void printTest(){
        System.out.println("Student Marks : ");
		System.out.println(mark1+"\n"+mark2+"\n"+mark3+"\n");
    }
}

class Result extends Test{
    private int total;
    
    Result(String name1,int roll1,int mark11,int mark22,int mark33){
        super(name1,roll1,mark11,mark22,mark33);
        total=mark11+mark22+mark33;
    }
    void printResult(){
        System.out.println("Student Total: "+total);
    }
}

public class StudentInheritance{
    public static void main(String args[]){
        // object of final inherited class
        Result ob = new Result("Anirudh",21,60,70,80);
        ob.printStudent();
        ob.printTest();
        ob.printResult();
    }
}

