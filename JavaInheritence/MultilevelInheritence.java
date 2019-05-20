//Animal and Dog class created in SingleInheritence.java
class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping....");
	}
}
public class MultilevelInheritence {
	public static void main(String... args) {
		BabyDog bd = new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
	}
}
