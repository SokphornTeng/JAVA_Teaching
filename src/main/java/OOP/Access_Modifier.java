package OOP;

public class Access_Modifier {

	public String userName;
	private int age;
	protected String email;
	String country;
	
	public void register(String userName, int age, String email, String country) {
		this.userName = userName;
		this.age = age;
		this.email = email;
		this.country = country;
	}
	
	public void getInfo() {
		System.out.print(userName + "\n");
		System.out.print(age + "\n");
		System.out.print(email + "\n");
		System.out.print(country + "\n");
	}
	
	public static void main(String[] args) {
		
		//Access Modifiers
		// + public -> use all class and package
		// + private -> use only in class
		// + default -> use only in package can't into other package
		// + protected -> uses in class and package and for sub class as inheritance

		Access_Modifier info = new Access_Modifier();
		info.register("Sokphorn", 25, "sokphorn.teng@gmail.com", "Cambodai");
		info.getInfo();
		
	}

}
