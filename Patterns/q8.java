import java.util.*;
public class q8 {
    public static void main(String args[]) {
        int n;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(i%2!=0){
                for(int j=1;j<=5;j++) {
                count=count+1;
                System.out.print(count + " ");
            }
            }
            
            else{
                int temp=count+1;
                for(int j=count+5;j>=temp;j--) {
                    count=count+1;
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}