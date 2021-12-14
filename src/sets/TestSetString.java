package sets;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		String longer = null;
		for (String string : set)
		{
			if (longer == null)
				longer = string;
			else if (string.length() > longer.length())
				longer = string;
		}
		set.remove(longer);
		System.out.println(set);
	}
}
