package maps;

public class Pays
{
	String name;
	int nbHab;
	String continent;
	
	public Pays(String name, int nbHab, String continent)
	{
		this.name = name;
		this.nbHab = nbHab;
		this.continent = continent;
	}
	
	@Override
	public String toString()
	{
		return "{" + name + ", " + nbHab + ", " + continent + "}";
	}
}
