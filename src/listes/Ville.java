package listes;

public class Ville implements Comparable<Ville>
{
	public String name;
	public int nbHab;
	
	public Ville(String name, int nbHab)
	{
		this.name = name;
		this.nbHab = nbHab;
	}
	
	@Override
	public String toString()
	{
		return "{" + name + ", " + nbHab + "}";
	}

	@Override
	public int compareTo(Ville o)
	{
		//return name.compareTo(o.name);
		if (nbHab > o.nbHab)
			return 1;
		else if (nbHab < o.nbHab)
			return -1;
		return 0;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Ville))
			return false;
		Ville other = (Ville) obj;
		return (name.equals(other.name) && nbHab == other.nbHab);
	}
}
