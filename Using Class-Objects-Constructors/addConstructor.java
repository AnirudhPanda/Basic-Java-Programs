
class calc
{
    int no1, no2;
 
calc(int a, int b)

{
    no1 = a;  // 30
    no2 = b;  // 10
}
 
    void sum()
{
    System.out.println("Sum of "+no1+" and "+no2+" is "+(no1+no2));
}
}
 
public class addConstructor
{
    public static void main(String args[])
{
calc c = new calc(30, 10);
c.sum();
}
}