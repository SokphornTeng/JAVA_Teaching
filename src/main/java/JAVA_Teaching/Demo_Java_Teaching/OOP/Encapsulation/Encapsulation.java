package JAVA_Teaching.Demo_Java_Teaching.OOP.Encapsulation;

public class Encapsulation {

	//Encapsulation -> set & get use with private
	  // -> method setter and getter it use for data hiding access motifier of method is public
	  // and for allow other to take and use private for access motifier attribute
	  // -> set void with param and get return type of datatype and no param
	  // -> it easy to control attribute in class and method and increased security of data

	  private String name;
	  
	  public String getName() {
	    return name;
	  }


	  public void setName(String name) {
	    this.name = name;
	  }

	  public static void main(String[] args) {

	    Encapsulation new_1 = new Encapsulation();
	    new_1.setName("Sokphorn");
	    System.out.print(new_1.getName());
	    
	  }

	
}
