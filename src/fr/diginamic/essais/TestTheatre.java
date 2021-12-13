package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre
{
	public static void main(String[] args)
	{
		Theatre machin = new Theatre("Machin", 25);
		
		machin.inscrire(5, 10.0);
		machin.inscrire(2, 7.5);
		machin.inscrire(4, 15.0);
		machin.inscrire(2, 10.0);
		machin.inscrire(5, 10.0);
		machin.inscrire(2, 15.0);
		machin.inscrire(1, 7.5);
		machin.inscrire(7, 10.0);
		
		System.out.println("Clients inscrits : " + machin.getRegisteredCustomers() + "; Recette totale : " + machin.getTotalRevenues());
	}
}
