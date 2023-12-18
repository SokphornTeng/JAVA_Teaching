package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

public class Conditional_Statements {

	public static void main(String[] args) {
	     
	    //Conditional statements

	    //if statement
	    //if(){
	    // comparison ==, !=, >, <, >=, <=
	    //  }
	    int a = 18;
	    if(a > 8) {
	    System.out.print("a bigger than 18");// -> it will show it   condition true and it not show something if not true
	    }
	    //if ...else
	    if(a < 8) {
	    System.out.print("a is not smaller then 8");
	    } else {
	    System.out.print("a is bigger then 8");
	    }
	  //  if ... else if X 2 or 3 ... else -> more then 2
	    if(a == 1) {
	    System.out.print("a is not == 1");
	    } else if(a > 18){
	    System.out.print("a is not > 1");
	    } else {
	    System.out.print("a is == 18");
	    }

	  //  Nested if (if in if)
	    int a1 = 18;
	    if(a1 >= 0){
	      if( a1 % 2 == 0 ) {
	      System.out.print("a is even number");
	      } else {
	      System.out.print("a is odd number");
	      }
	      System.out.print("a is positive");
	    } else {
	    System.out.print("your condition is not correct it negative");
	    }

	    //switch Case statement -> it use for select one true
	    //we use switch case instead of  if … else if as screen shot
	    int a11 = 3;
	    switch(a11) {
	    case 1: System.out.print("Monday");
	    break;
	    case 2: System.out.print("Tuesday");
	    break;
	    case 3: System.out.print("Wednesday");
	    break;
	    case 4: System.out.print("Thursday");
	    break;
	    case 5: System.out.print("Friday");
	    break;
	    case 6: System.out.print("Saturday");
	    break;
	    case 7: System.out.print("Sunday");
	    break;
	    default: System.out.print("invalid!");
	    break;
	    }

	  }
	
}
