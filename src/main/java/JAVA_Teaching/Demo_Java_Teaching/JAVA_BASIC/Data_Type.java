package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

public class Data_Type {
	
	public static void main(String[] args) {
	    // Data Type
//	    String
//	    boolean
//	    char
//	    byte
//	    short
//	    int
//	    long
//	    float
//	    double

	    // Primitive Data Type (use with specific value and can't use with method in java)
	    byte showByte = 127;
	    int showInt = 128;
	    short showShort = 30000;
	    long showLong = 1000l;
	    
	    float showFloat = 1.123345F;
	    double showDouble = 1.23456;
	    
	    boolean showBoolean = false;
	    
	    char showChar = 99;
	  
	    System.out.print(showByte);
	    System.out.print(showInt);
	    System.out.print(showShort);
	    System.out.print(showLong);
	    System.out.print(showFloat);
	    System.out.print(showDouble);
	    System.out.print(showBoolean);
	    System.out.print(showChar);
	    
	    // Non-Primitive Data Type (use the java method as String and array or more)
	    String showString = "my name is Sokphorn";
	    
	    int[] showArray = new int[2];
	    showArray[0] = 25;
	    showArray[1] = 26;  
	    
	    for(int i = 0; i<showArray.length; i++) {
	      System.out.print("Hello this is my show" + showArray[i]);
	    }
	    
	    System.out.print(showString.toLowerCase());
	    System.out.print(showString.toUpperCase());
	  }
}

