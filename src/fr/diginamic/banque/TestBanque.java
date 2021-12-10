package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque
{
	public static void main(String[] args)
	{
		Compte account = new Compte (205, 3600);
		
		System.out.println(account);
		System.out.println(account.getAccountNb());
		System.out.println(account.getAccountBalance());
	}
}
