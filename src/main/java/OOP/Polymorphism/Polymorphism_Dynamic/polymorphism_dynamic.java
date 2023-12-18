package OOP.Polymorphism.Polymorphism_Dynamic;

public class polymorphism_dynamic {

//  Dynamic Polymorphism (Override method)

  //it work when run time
    //it focus on Override method (interitance) it need to have class child
  //it use with annotation of @Override that get from parent class
  //it use as concept of inheritance
  //it mean parent can be child for create object (take method from child to replace in own parent's method)
  //as Animal dog1 = new Dog(), dog1.getInfor() so Animal take method from Dog for replace it's own method
  
  // dynamic -> Polymorphism -> focus on Override Method

   public String name;
   public int age;
	
  
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
  
//  public static void main(String[] args) {
//    
//    Polymorphism list = new Polymorphism();
//        list.show_1();
//        list.show_1("Sokphorn");
//        list.show_1("Vuthe", 19);
//        list.show_1(25);
//  }
	
}
