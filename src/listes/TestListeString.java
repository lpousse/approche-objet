package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");
		
		String longer = list.get(0);
		for (String string : list)
			if (string.length() > longer.length())
				longer = string;
		System.out.println(longer);
		
		for (int i = 0; i < list.size(); i++)
			list.set(i, list.get(i).toUpperCase());
		System.out.println(list);
		
		for (Iterator it = list.iterator(); it.hasNext();)
		{
			String string = (String) it.next();
			if (string.charAt(0) == 'N')
				it.remove();
		}
		System.out.println(list);
	}
}
