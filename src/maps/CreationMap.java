package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap
{
	public static void main(String[] args)
	{
		Map<String, Double> map = new HashMap<>();
		
		map.put("Paul", 1750.0);
		map.put("Hicham", 1825.0);
		map.put("Yu", 2250.0);
		map.put("Ingrid", 2015.0);
		map.put("Chantal", 2418.0);
		
		System.out.println(map.size());
	}
}
