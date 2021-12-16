package fr.diginamic.testenumeration;

public enum Saison
{
	PRINTEMPS("Printemps", 1),
	ETE("Été", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	String libelle;
	int order;
	
	private Saison(String libelle, int order)
	{
		this.libelle = libelle;
	}

	public String getLibelle()
	{
		return libelle;
	}

	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}
	
	public static Saison getFromLibelle(String libelle)
	{
		for (Saison saison : values())
		{
			if (libelle.equals(saison.libelle))
				return saison;
		}
		return null;
	}
}
