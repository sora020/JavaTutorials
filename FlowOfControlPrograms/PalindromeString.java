public class PalindromeString { 
	public static void main(String... args) {
		String original = "", reverse = "";
		for(int i = 0; i < args.length; i++) {
			original += args[i];
		}
		System.out.println("You Entered " + original);
		char[] array = original.toCharArray();
		for(int l = array.length - 1; l >= 0; l--) 
			reverse = reverse + array[l];
		System.out.println("Reversed: " + reverse);
		if(original.equals(reverse))
			System.out.println("It is Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
