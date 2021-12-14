package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeObjet
{
	public static void main(String[] args)
	{
		List<Ville> list = new ArrayList<>();
		
		list.add(new Ville("Nice", 343000));
		list.add(new Ville("Carcassonne", 47800));
		list.add(new Ville("Narbonne", 53400));
		list.add(new Ville("Lyon", 484000));
		list.add(new Ville("Foix", 9700));
		list.add(new Ville("Pau", 77200));
		list.add(new Ville("Marseille", 850700));
		list.add(new Ville("Tarbes", 40600));
		
		
		Ville mostPopulated = list.get(0);
		for (Ville ville : list)
		{
			if (mostPopulated.nbHab < ville.nbHab)
				mostPopulated = ville;
		}
		System.out.println("The most populated city is " + mostPopulated.name + " with " + mostPopulated.nbHab + " inhabitants.");
		
		Ville leastPopulated = list.get(0);
		for (Ville ville : list)
		{
			if (leastPopulated.nbHab > ville.nbHab)
				leastPopulated = ville;
		}
		System.out.println("The least populated city is " + leastPopulated.name + " with " + leastPopulated.nbHab + " inhabitants.");
		list.remove(leastPopulated);
		System.out.println(list);
		
		for (Ville ville : list)
		{
			if (ville.nbHab > 100000)
				ville.name = ville.name.toUpperCase();
		}
		System.out.println(list);
	}
}
