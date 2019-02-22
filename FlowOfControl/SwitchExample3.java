//Switch-Case String Statement 
public class SwitchExample3
{
	public static void main(String[] args)
	{
		int level = 0;
		String s = "Expert";
		switch(s)
		{
			case "Beginner": level = 1;
					 break;
			case "Intermediate": level = 2;
					     break;
			case "Expert": level = 3;
				       break;
			default: level = 0;
				 break;
		}
		System.out.println("Your Level is: " + level);
	}
};
