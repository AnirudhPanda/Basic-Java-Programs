
import java.util.*;

public class NumberToWord {
    public static void main(String[] args) 
    { 
    String str;    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    str = sc.nextLine();
    
    printWord(str); 
    
    } 
    
    static void printWord(String str) 
{ 
    int i, length = str.length(); 
  
    
    for (i = 0; i < length; i++) 
    { 
  
        
        printValue(str.charAt(i)); 
    } 
} 
    
    static void printValue(char digit) 
{ 
  
    
    switch (digit) 
    { 
  
    
    case '0': 
        System.out.print("Zero "); 
        break; 
  
    
    case '1': 
        System.out.print("One "); 
        break; 
  
    
    case '2': 
        System.out.print("Two "); 
        break; 
  
    
    case '3': 
        System.out.print("Three "); 
        break; 
  
    
    case '4': 
        System.out.print("Four "); 
        break; 
  
    
    case '5': 
        System.out.print("Five "); 
        break; 
  
    
    case '6': 
        System.out.print("Six "); 
        break; 
  
    
    case '7': 
        System.out.print("Seven "); 
        break; 
  
    
    case '8': 
        System.out.print("Eight "); 
        break; 
  
    
    case '9': 
        System.out.print("Nine "); 
        break; 
    } 
} 
}
