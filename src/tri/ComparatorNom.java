package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorNom implements Comparator<Ville>
{
	@Override
	public int compare(Ville o1, Ville o2)
	{
		return o1.name.compareTo(o2.name);
	}
}
