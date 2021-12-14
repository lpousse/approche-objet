package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import listes.Ville;

public class MapVilles
{
	public static void main(String[] args)
	{
		Map<String, Ville> map = new HashMap<>();
		map.put("Nice", new Ville("Nice", 343000));
		map.put("Carcassonne", new Ville("Carcassonne", 47800));
		map.put("Narbonne", new Ville("Narbonne", 53400));
		map.put("Lyon", new Ville("Lyon", 484000));
		map.put("Foix", new Ville("Foix", 9700));
		map.put("Pau", new Ville("Pau", 77200));
		map.put("Marseille", new Ville("Marseille", 850700));
		map.put("Tarbes", new Ville("Tarbes", 40600));
		
		
		String minHab = null;
		Integer nbHabMin = null;
		for (Iterator it = map.keySet().iterator(); it.hasNext();)
		{
			String key = (String) it.next();
			
			if (minHab == null || map.get(key).nbHab < nbHabMin)
			{
				minHab = key;
				nbHabMin = map.get(key).nbHab;
			}
		}
		map.remove(minHab);
		System.out.println(map);
	}
}
