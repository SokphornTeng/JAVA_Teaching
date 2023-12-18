package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

public class Ternary_Operator {
    
	public static void main(String[] args) {
	     
	    //Ternary Operator
	    //condition ? expressionTrue : expressionFalse
	    int a = 0;
	    if(a >=0) {
	      System.out.print("a is positive number");
	    } else {
	      System.out.print("a is negative number");
	    }
	    //-> if we only two condition as above we can use ternary operator
	    String b = (a>=0) ? "a is positive number" : "a is negative number";
	     System.out.print(b);

	  }
	
}

