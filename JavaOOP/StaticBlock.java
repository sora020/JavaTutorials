// Java Program to demonstrate the use of static block

public class StaticBlock {
	static {
		System.out.println("we are really in static before main...wooaah");
	}
	public static void main(String... args) {
		System.out.println("Aye Aye we are in main");
	}
}
