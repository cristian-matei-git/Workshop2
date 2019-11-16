package Exercise3;
import java.util.Scanner;

public class Main {
	
	 public static int fibonacci(int n) {
		   
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-2) + fibonacci(n-1);
	    	
	 }
	    
	 public static int contains3(int n) {
		 
		 int copyN = n;
		 int digit = copyN % 10;
		 
		 while(copyN != 0) {
			 
			 digit = copyN % 10;
			 copyN /= 10; 
			 
			 if(digit == 3) {
				 return n;
			 }
		 } 
		 return 0;
	 }
	 public static int fibonacci3(int n) {
		 return contains3(fibonacci(n));
	 }
	  public static void main(String[] args) {
			  
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		System.out.print(n + " -> ");
		
	    for (int i = 1; i <= n; i++) {
	    	
	      if(fibonacci3(i) != 0) {
	    	  System.out.print(fibonacci3(i) + " ");
	      }
	      
	      }
	    }
		
  }



