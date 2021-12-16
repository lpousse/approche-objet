package fr.diginamic.testenumeration;

public class TestEnumeration
{
	public static void main(String[] args)
	{
		for (Saison saison : Saison.values())
		{
			System.out.println(saison);
		}
		
		String nom = "ETE";
		for (Saison saison : Saison.values())
		{
			if (saison.name().equals(nom))
			{
				System.out.println(saison.libelle);
			}
		}
		
		String libelle = "Hiver";
		System.out.println(Saison.getFromLibelle(libelle));
	}
}
