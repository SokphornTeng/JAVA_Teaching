package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

public class Loop {

	public static void main(String[] args) {
	     
	    //Loop in Java

	    //it use for execute again and again

	    //it have For Loop, While Loop, Do .. While
	     for(int i=1; i<=10; i++){
	    System.out.println(i);// it work when need condition false it will stop
	    }
	     int i=1;
	    while(i<=10){
	    System.out.println(i); //it work with check condition false it will stop
	    i++;
	    }
	     int i1=1;
	    do{
	    System.out.println(i1); //it work one time and then it will check condition if false it stop if not false it will work more
	    i1++;
	    } while(i1<=10);

	    //Ex:
	    for(int h = 0; h<10; h++) {
	      System.out.print(h);
	    }
	    int k =0;
	    while(k<5) {
	      System.out.print(k);
	      k +=2; // k++
	    }
	    int f = 10;
	    do {
	      System.out.print(f);
	      f -=2; // f--
	    } while(f>0);
	  }
	
}
