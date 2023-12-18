package JAVA_Teaching.Demo_Java_Teaching.OOP;

public class Class_Object {
    
	 String name_Obj;
	  int number_Obj;

	  public static void main(String[] args) {
//		 Object 1
	    Class_Object obj = new Class_Object();
	    obj.name_Obj = "list_1";
	    obj.number_Obj = 17;
	    
	    System.out.print(obj.name_Obj + " " + obj.number_Obj);
	    System.out.print("\n");
	    
	    
//		 Object 2
	    Class_Object obj1 = new Class_Object();
	    obj1.name_Obj = "list_2";
	    obj1.number_Obj = 13;
	    
	    System.out.print(obj1.name_Obj + " " + obj1.number_Obj);
	    System.out.print("\n");
	    
	    
//		 Object 3
	    Class_Object obj3 = new Class_Object();
	    obj3.name_Obj = "list_3";
	    obj3.number_Obj = 15;
	    
	    System.out.print(obj3.name_Obj + " " + obj3.number_Obj);
	    System.out.print("\n");
	    
	    
//		 Object 4
	    Class_Object obj4 = new Class_Object();
	    obj4.name_Obj = "list_4";
	    obj4.number_Obj = 156;
	    
	    System.out.print(obj4.name_Obj + " " + obj4.number_Obj);

	  }
	
}
