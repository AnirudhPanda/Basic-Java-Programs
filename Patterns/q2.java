import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int alpha = 65;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n = sc.nextInt();
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print((char) alpha + " ");
            }
            alpha++;
            System.out.println();
        }
    }
}