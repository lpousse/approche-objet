package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville>
{
	@Override
	public int compare(Ville o1, Ville o2)
	{
		if (o1.nbHab > o2.nbHab)
			return 1;
		else if (o1.nbHab < o2.nbHab)
			return -1;
		return 0;
	}
}
