package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetObjet
{
	public static void main(String[] args)
	{
		Set<Pays> set = new HashSet<>();
		
		set.add(new Pays("USA", 331449281, 55805.204));
		set.add(new Pays("France", 68014000, 42878.0));
		set.add(new Pays("Allemagne", 83149300, 45466.116));
		set.add(new Pays("UK", 67886004, 39228.516));
		set.add(new Pays("Italie", 60359546, 30657.296));
		set.add(new Pays("Japon", 125507472, 39058.5));
		set.add(new Pays("Chine", 1411780000, 10582.102));
		set.add(new Pays("Russie", 146780700, 11099.20));
		set.add(new Pays("Inde", 1326093247, 1626.982));
		
		Iterator it = set.iterator();
		Pays bestPibHab = (Pays) it.next();
		while (it.hasNext())
		{
			Pays pays = (Pays) it.next();
			if (bestPibHab.pibHab < pays.pibHab)
				bestPibHab = pays;
		}
		System.out.println("Le pays avec le meileur PIB/hab est " + bestPibHab.name + " avec " + bestPibHab.pibHab + "$/hab");
		
		it = set.iterator();
		Pays bestPib = (Pays) it.next();
		Pays worstPib = (Pays) bestPib;
		while (it.hasNext())
		{
			Pays pays = (Pays) it.next();
			if (bestPib.pibHab * bestPib.nbHab < pays.pibHab * pays.nbHab)
				bestPib = pays;
			if (worstPib.pibHab * worstPib.nbHab > pays.pibHab * pays.nbHab)
				worstPib = pays;
		}
		System.out.println("Le pays avec le meileur PIB total est " + bestPib.name + " avec " + (bestPib.pibHab * bestPib.nbHab) + "$");
		worstPib.name = worstPib.name.toUpperCase();
		System.out.println(set);
		set.remove(worstPib);
		System.out.println(set);
	}
}
