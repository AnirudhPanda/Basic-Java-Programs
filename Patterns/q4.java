import java.util.*;
public class q4 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            
            for(int k=n-1;k>=i;k--) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}