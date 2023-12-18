package JAVA_Teaching.Demo_Java_Teaching.OOP;

public class Constructor {

	public String name;
	private int age;
	private String email;
	
	// constructor use to set value of property with creating object
	public Constructor(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public void listInfo() {
		System.out.print(name + "\n");
		System.out.print(age + "\n");
		System.out.print(email + "\n");
	}
	
	public static void main(String[] args) {
		Constructor info = new Constructor("Sokphorn Teng", 25, "Sokphorn.teng@gmail.com");
		info.listInfo();
	}
	
}
