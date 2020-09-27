import java.util.*;
public class q9 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        
        for(int i=1;i<=n;i++) {
            for(int sp=i;sp<=n-1;sp++){
                System.out.print("  ");
            }
            
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
        for(int i=n-1;i>=1;i--) {
            for(int sp=i;sp<=n-1;sp++){
                System.out.print("  ");
            }
            
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
     
        
    }
}
