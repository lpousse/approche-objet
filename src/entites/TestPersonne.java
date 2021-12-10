package entites;

import entites2.Personne;

public class TestPersonne
{
	public static void main(String[] args)
	{
		Personne	pers1 = new Personne("Jean-Charles", "du Poitou");
		pers1.postalAddress = new AdressePostale(12, "allée des coquelicots", 86544, "Saint-Sauveur de Givre en Mai");
		
		Personne	pers2 = new Personne("Jean-Eude", "Mortimer", new AdressePostale(4, "impasse de la Faune", 48992, "Poil"));
	}
}
