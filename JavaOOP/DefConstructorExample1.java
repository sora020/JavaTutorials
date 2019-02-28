// default contructor printing default values
public class DefConstructorExample1 {
	private int id;
	private String name;

	DefConstructorExample1() {
		System.out.println(id + " " + name);
	}

	public static void main(String... args) {
		DefConstructorExample1 d = new DefConstructorExample1();
	}
}
