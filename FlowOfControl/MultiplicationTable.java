//Multiplication Table program upto 10
public class MultiplicationTable
{
	public static void main(String... args)
	{
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i <= 10; i++)
		{
			if(i < 10)
				System.out.println(num + " * " + i + "  = " + num*i);
			else
				System.out.println(num + " * " + i + " = " + num*i);
		}
	}
}
