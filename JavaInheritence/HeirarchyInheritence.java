//Animal and Dog class created in SingleInheritence.java
class Cat extends Animal {
	void meow() {
		System.out.println("Meowing....");
	}
}
public class HeirarchyInheritence {
	public static void main(String... args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.meow();
		d.bark();
		c.eat();
	}
}
