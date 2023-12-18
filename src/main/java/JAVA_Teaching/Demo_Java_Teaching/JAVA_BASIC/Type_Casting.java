package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

public class Type_Casting {

	public static void main(String[] args) {
	
	//Type Casting -> it focus to change primitive do datatype 

	//Widening Casting -> auto
	//byte -> short -> char -> int -> long -> float -> double
	byte c = 127;
	int a = c; // -> 127
	int a1 = 100;
	double b = a1;
	System.out.print(a); // -> 100
	System.out.print("\t" + "+" + "\t");
	System.out.print(b); // -> 100.0

	System.out.print("\n");
	//Narrowing Casting -> manaul (បញ្ខាស់មកវិញពី auto)
	//double -> float -> long -> int -> char -> short -> byte
	double d = 3.14;
	int g = (int)d;
	long l = (long)d;
	System.out.print(g); // -> 3
	System.out.print("\t" + "+" + "\t");
	System.out.print(l); // -> 3

	System.out.print("\n");
	//String -> int, double, long, byte...
	String a11 = "3.14";
	double b1 = Double.valueOf(a11);
	double c1 = b1 + 3.1;
	System.out.print(b); // -> 3.14
	System.out.print(c); // -> 6.24

	System.out.print("\n");
	String aa = "127";
	byte bb = Byte.valueOf(aa);
	System.out.print(bb); // -> 127

	 
	System.out.print("\n");
	//int, double, long, byte... -> String
	long a111 = 3;
	String b11 = String.valueOf(a111);
	System.out.print(a111); // -> "3"
	
	}
	
}
