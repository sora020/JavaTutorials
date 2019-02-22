public class PrintChar
{
	public static void main(String[] args)
	{
		for(int i = 0; i <= 65535; i++)
		{
			System.out.print((char)(i) + "  ");
			if(i % 40 == 0)
			{
				System.out.println();
			}
		}
	}
};
