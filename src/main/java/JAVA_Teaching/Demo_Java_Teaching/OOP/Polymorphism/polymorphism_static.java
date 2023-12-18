package JAVA_Teaching.Demo_Java_Teaching.OOP.Polymorphism;


public class polymorphism_static {

	 //-> Poly (many) + morphism (form) => many form
    //  -> sokphorn -> staff
               //   -> dougter
               //   -> student
                //  -> teacher
      //-> it have 2 type static and dynamic
      //static -> it focus on  overloading method (when compile)
    //  dynamic -> it focuse on override method of interitance (when run time)
  
  // static -> Polymorphism -> focus on Method Overloading
  //name method the same 

  //different param 
  //different arrange of param 
  //different datatype of param
  //it use for compile and it faster then run time
  
  public void show_1() {
    System.out.print("This is my showing 1");
  }
  public void show_1(String name) {
    System.out.print("\n"+"This is my showing 2" + name);
  }
  public void show_1(String name, int age) {
    System.out.print("\n"+"This is my showing 3" + name + age);
  }
  public void show_1(int age) {
    System.out.print("\n"+"This is my showing 4" + age);
  }
  
  public static void main(String[] args) {
    
	  polymorphism_static list = new polymorphism_static();
        list.show_1();
        list.show_1("Sokphorn");
        list.show_1("Vuthe", 19);
        list.show_1(25);
  }
	
}
