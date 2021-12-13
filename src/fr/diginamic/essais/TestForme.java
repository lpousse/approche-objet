package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;

public class TestForme
{
	public static void main(String[] args)
	{
		Cercle cercle = new Cercle(5);
		Rectangle rect = new Rectangle(6, 4);
		Carre carre = new Carre(3);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rect);
		AffichageForme.afficher(carre);
	}
}
