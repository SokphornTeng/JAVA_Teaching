package JAVA_Teaching.Demo_Java_Teaching.OOP.Polymorphism.Polymorphism_Dynamic;


public class Test_1 extends polymorphism_dynamic {

	@Override
	public void show_1() {
		super.show_1();
		System.out.print("This is my show 1");
	}

	@Override
	public void show_1(String name) {
		super.show_1(name);
		System.out.print("This is my show 2 with show_1");
	}

	@Override
	public void show_1(String name, int age) {
		super.show_1(name, age);
		System.out.print("This is my show 3 with show_1");
	}

	@Override
	public void show_1(int age) {
		super.show_1(age);
		System.out.print("This is my show 4 with show_1");
	}
}
