package listes;

public class Ville implements Comparable<Ville>
{
	public String name;
	public int nbHab;
	private Continent continent = null;
	
	public Ville(String name, int nbHab)
	{
		this.name = name;
		this.nbHab = nbHab;
	}
	
	public Ville(String name, int nbHab, Continent continent)
	{
		this.name = name;
		this.nbHab = nbHab;
		this.continent = continent;
	}
	
	@Override
	public String toString()
	{
		if (continent == null)
			return "{" + name + ", " + nbHab + "}";
		return "{" + name + ", " + nbHab + ", " + continent.libelle + "}";
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

	public Continent getContinent()
	{
		return continent;
	}

	public void setContinent(Continent continent)
	{
		this.continent = continent;
	}
}
