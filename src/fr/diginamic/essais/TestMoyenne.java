package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne
{
	public static void main(String[] args)
	{
		CalculMoyenne a = new CalculMoyenne();
		
		a.ajout(5);
		a.ajout(15);
		a.ajout(6);
		a.ajout(9);
		a.ajout(10);
		a.ajout(18);
		a.ajout(17);
		a.ajout(14);
		System.out.println(a.calcul());
		
		a.ajout(90);
		a.ajout(120);
		a.ajout(80);
		a.ajout(94);
		a.ajout(255);
		a.ajout(115);
		a.ajout(75);
		a.ajout(60);
		a.ajout(143);
		System.out.println(a.calcul());
	}
}
