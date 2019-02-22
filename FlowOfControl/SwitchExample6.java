/*java allows four wrapper classesin switch-case statement
 * 1. Byte
 * 2. Short
 * 3. Integer
 * 4. Long
 */
public class SwitchExample6
{
	public static void main(String... args)
	{
		Short age =18;
		switch(age)
		{
			case (16):	System.out.println("You are under 18.");
					break;
			case (18):	System.out.println("You are eligible to vote.");
					break;
			case (65):	System.out.println("You are Senior Citizen.");
					break;
			default:	System.out.println("Please give a valid age.");
		}
	}
};
