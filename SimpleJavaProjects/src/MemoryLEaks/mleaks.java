/*
 * Task3-MemoryLeaks
	1. What are memory leaks?
	memory leak in Java is a situation where some objects are not used 
	by the application any more, but GC fails to recognize them as unused.
	
	2. Demonstrate memory leaks problem with an example.
	
	3. Use atleast one tool to detect memory leaks.
 */


package MemoryLEaks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mleaks {
	private Map cache = new HashMap();
	   public int square(int i) {
	      int result = i * i;
	      cache.put(i, result);
	      return result;
	   }
	   public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int i = 0;
		   
		   mleaks calc = new mleaks();
	      for(int j = 0;j<6;i++) {
	    	  
	         System.out.println("Enter a number between 1 and 100");
	         
	     i = sc.nextInt();
	System.out.println(calc.square(i));
	   }
	      
	

}
}

