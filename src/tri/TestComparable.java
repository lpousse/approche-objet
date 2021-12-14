package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import listes.Ville;

public class TestComparable
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
		
		Collections.sort(list);
		System.out.println(list);
	}
}
