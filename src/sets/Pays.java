package sets;

public class Pays
{
	String name;
	int nbHab;
	double pibHab;
	
	public Pays(String name, int nbHab, double pibHab)
	{
		this.name = name;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}
	
	@Override
	public String toString()
	{
		return "{" + name + ", " + nbHab + ", " + (pibHab * nbHab) + "}";
	}
}
