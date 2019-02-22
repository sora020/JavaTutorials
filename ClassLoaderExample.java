//print classloader name
public class ClassLoaderExample
{
	public static void main(String[] args)
	{
		//print classloader of current class
		//Application classloader will loadthis class
		Class c = ClassLoaderExample.class;
		System.out.println(c.getClassLoader());
		//printing classloader name of string will print null
		//because it is an in-built class in rt.jar, so it is 
		//loaded by bootstrap classloader 
		System.out.println(String.class.getClassLoader());
	}
}
