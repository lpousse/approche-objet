package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque
{
	public static void main(String[] args)
	{
		
		Compte[] accountingArray = {new Compte (205, 3600), new CompteTaux(406, 1200, 1.5f)};
		
		for (int i = 0; i < accountingArray.length; i++)
			System.out.println(accountingArray[i]);
	}
}
