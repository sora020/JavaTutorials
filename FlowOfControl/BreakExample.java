//break statement demonstration
public class BreakExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				//it breaks the loop here
				break;
			}
			System.out.println(i);
		}
	}
}

