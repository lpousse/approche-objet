package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme
{
	public static void afficher(Forme forme)
	{
		System.out.println("perimetre: " + forme.calculerPerimetre() + "; surface: " + forme.calculerSurface() + ";");
	}
}
