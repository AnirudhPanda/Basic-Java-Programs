import java.util.*;
public class q10 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for(int i=2;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}