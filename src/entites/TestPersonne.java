package entites;

import entites2.Personne;

public class TestPersonne
{
	public static void main(String[] args)
	{
		Personne	pers1 = new Personne();
		pers1.firstName = "Jean-Charles";
		pers1.lastName = "du Poitou";
		pers1.postalAddress = new AdressePostale();
		pers1.postalAddress.streetNb = 12;
		pers1.postalAddress.streetName = "allée des coquelicots";
		pers1.postalAddress.postalCode = 86544;
		pers1.postalAddress.cityName = "Saint-Sauveur de Givre en Mai";
		
		Personne	pers2 = new Personne();
		pers2.firstName = "Jean-Eude";
		pers2.lastName = "Mortimer";
		pers2.postalAddress = new AdressePostale();
		pers2.postalAddress.streetNb = 4;
		pers2.postalAddress.streetName = "impasse de la Faune";
		pers2.postalAddress.postalCode = 48992;
		pers2.postalAddress.cityName = "Poil";
	}
}
