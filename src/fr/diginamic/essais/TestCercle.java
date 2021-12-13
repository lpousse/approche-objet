package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle
{
	public static void main(String[] args)
	{
		Cercle a = CercleFactory.createCercle(5.0);
		Cercle b = CercleFactory.createCercle(7.0);
		
		System.out.println("Cercle a; perimetre: " + a.perimetre() + "; surface: " + a.surface() +";");
		System.out.println("Cercle b; perimetre: " + b.perimetre() + "; surface: " + b.surface() +";");}
}
