package utils;

public class ConversionNombre
{

	public static void main(String[] args)
	{
		String chain = "12";
		int nb = Integer.parseInt(chain);
		int a = 654;
		int b = 5496;
		
		int result = Integer.compare(a, b);
		System.out.println(result);
		if (result == 0)
			System.out.println("a and b are equal");
		else if (result > 0)
			System.out.println("a is greater than b");
		else
			System.out.println("b is greater than a");
	}

}
