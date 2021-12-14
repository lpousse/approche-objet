package listes;

public class Ville
{
	String name;
	int nbHab;
	
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
}
