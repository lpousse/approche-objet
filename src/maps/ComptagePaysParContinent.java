package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent
{
	public static void main(String[] args)
	{
		List<Pays> list = new ArrayList<>();
		
		list.add(new Pays("France", 65000000, "Europe"));
		list.add(new Pays("Allemagne", 80000000, "Europe"));
		list.add(new Pays("Belgique", 10000000, "Europe"));
		list.add(new Pays("Russie", 150000000, "Asie"));
		list.add(new Pays("Chine", 1400000000, "Asie"));
		list.add(new Pays("Indonésie", 220000000, "Océanie"));
		list.add(new Pays("Australie", 20000000, "Océanie"));
		
		Map<String, Integer> map = new HashMap<>();
		
		for (Pays pays : list)
		{
			if (map.get(pays.continent) == null)
				map.put(pays.continent, 1);
			else
				map.replace(pays.continent, map.get(pays.continent) + 1);
		}
		System.out.println(map);
	}
}
