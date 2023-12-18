package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

import java.util.Scanner;

public class Input_Scanner {

	public static void main(String[] args) {
	       
	    String name;
	    int age;
	    double number;
	    // Create Scanner Object
	    Scanner showScanner = new Scanner(System.in);
	    // Call method scanner next() for input
	    showScanner.next();
	    // input name with showing name of String
	      name = showScanner.next();
	      System.out.print("my name is"+ "\n " +name);
	      
	      age = showScanner.nextInt();
	      System.out.print("my age is"+ "\n " +age);
	      
	      number = showScanner.nextDouble();
	      System.out.print("my double number is"+ "\n " +number);
	  }
	
	
}