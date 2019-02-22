//Program to demonstrate use of Labeled for loop
public class ForExample2
{
	public static void main(String... args)
	{
		//using label
		i:
		for(int i = 1; i <= 5; i++)
		{
			j:
			for(int j = 1; j <= 5; j++)
			{
				k:
				for(int k = 1; k <= 5; k++)
				{
					if(i == 3 && j == 3 && k == 3)
						break i;
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
	}
}
