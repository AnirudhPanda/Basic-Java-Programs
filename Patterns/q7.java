import java.util.*;
public class q7 {
    public static void main(String args[]) {
        int n;
        int count=1;
        int currentRow=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(i%2==0){
                for(int j=1;j<=i;j++) {
                
                System.out.print(count +" ");
                count++;
            }
            }
            
            else{
                int temp=currentRow+count-1;
                for(int j=0;j<i;j++) {
                    System.out.print(temp--  +" ");
                    count++;
                }
            }
            System.out.println();
            currentRow++;
        }
    }
}