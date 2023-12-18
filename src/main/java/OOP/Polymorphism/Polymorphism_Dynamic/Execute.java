package OOP.Polymorphism.Polymorphism_Dynamic;


public class Execute {

	 public static void main(String[] args) {
		  
	      // static polymorphism method overloading
		  polymorphism_dynamic obj = new polymorphism_dynamic();
	      obj.show_1();
	      obj.show_1("lyly");
	      obj.show_1("vira", 43);
	      obj.show_1(26);
	      System.out.print("\n"+"====================" + "\n");
	      
	      // dynamic polymorphism override method;
	      polymorphism_dynamic obj_1 = new Test_1();
	      obj_1.show_1();
	      obj_1.show_1("lolo");
	      obj_1.show_1("lala", 33);
	      obj_1.show_1(23);
	      System.out.print("\n"+"====================" + "\n");
	      polymorphism_dynamic obj_2 = new Test_2();
	      obj_2.show_1();
	      obj_2.show_1("lolo");
	      obj_2.show_1("lala", 33);
	      obj_2.show_1(23);
	    }
	
}
