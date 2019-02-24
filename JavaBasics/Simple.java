/*Normal Hello World Program in java
	Valid main method signature
	1. public static void main(String[] args)  
	2. public static void main(String []args)  
	3. public static void main(String args[])  
	4. public static void main(String... args)  
	5. static public void main(String[] args)  
	6. public static final void main(String[] args)  
	7. final public static void main(String[] args)  
	8. final strictfp public static void main(String[] args)

	Invalid main method signature
	1. public void main(String[] args)  
	2. static void main(String[] args)  
	3. public void static main(String[] args)  
	4. abstract public static void main(String[] args)  
*/
public class Simple {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
