//adding two variables of similar datatypes other than int
public class Variable3
{
	public static void main(String[] args)
	{
		byte a = 100;
		byte b = 10;
		/*compile time error
		 * byte b = a + b;
		 */
		byte c = (byte)(a + b);
		System.out.println(c);
	}
}
