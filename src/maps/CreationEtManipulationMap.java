package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		for (Iterator it = mapVilles.keySet().iterator(); it.hasNext();)
		{
			Integer postalCode = (Integer) it.next();
			System.out.println(postalCode);
		}
		
		for (Iterator it = mapVilles.values().iterator(); it.hasNext();)
		{
			String city = (String) it.next();
			System.out.println(city);
		}
		System.out.println(mapVilles.size());
	}
}
