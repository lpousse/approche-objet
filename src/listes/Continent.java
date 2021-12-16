package listes;

public enum Continent
{
	EUROPE("Europe"),
	ASIE("Asie"),
	AFRIQUE("Afrique"),
	AMERIQUE("Amérique"),
	OCEANIE("Océanie");
	
	String libelle;
	
	private Continent(String libelle)
	{
		this.libelle = libelle;
	}
}
