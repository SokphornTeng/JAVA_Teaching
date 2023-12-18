package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

public class Method_Function {

	 public static void main(String[] args) {
	     
		    //Method (function)

		    //it use resolve the problem if we want it a block of code reuse code and call to use with many place

		    //Predefine Method / Build-in Method -> it already have in java just call it to use as .valueOf(), .nextInt(), ....

		    //User-defined Method -> it from developer do by they own idea for call to use in other class

		    //in order to create method it need access modifier, return type or void, name of method, list of param or not have param, body with return and method need to write in class
		    //  public static(method in class) int add(int a, int b){
		    //int sum;
		    //sum = a + b;
		    //return sum;
		    //}
		  
		    int callMethod = showMethod(3, 7);
		    System.out.print(callMethod);
		    
		  }
		  
		  public static int showMethod(int a, int b) {
		    int total;
		    total = a + b;
		    return total;
		  }

	
}
