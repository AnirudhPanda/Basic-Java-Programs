import java.util.*;

public class AddTwoNumsClass {
    int no1,no2,result;
    
    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of nums: ");
        no1=sc.nextInt();
        no2=sc.nextInt();
    }
    
    void add() {
        result = no1+no2;
    }
    
    void show() {
        System.out.println("The sum is" + result);
    }
    
    public static void main(String[] args) {
        AddTwoNumsClass ob = new AddTwoNumsClass();
        ob.get();
        ob.add();
        ob.show();
    }
}