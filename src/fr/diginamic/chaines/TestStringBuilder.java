package fr.diginamic.chaines;

public class TestStringBuilder
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		StringBuilder strb = new StringBuilder();
		
		for (int i = 1; i <= 100000; i++)
		{
			strb.append(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Elapsed time in ms: " + (end - start));
		
		start = System.currentTimeMillis();
		String str = "";
		
		for (int i = 1; i <= 100000; i++)
		{
			str += i;
		}
		end = System.currentTimeMillis();
		
		System.out.println("Elapsed time in ms: " + (end - start));
		
		
	}
}
