package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation
{
	public static void main(String[] args)
	{
		Operation[] operationArray = {new Credit("06/12/2021", 200),
										new Debit("07/12/2021", 10),
										new Debit("09/12/2021", 75),
										new Credit("12/12/2021", 25),
										new Debit("24/12/2021", 130)};
		int total = 0;
		
		for (int i = 0; i < operationArray.length; i++)
		{
			System.out.println(operationArray[i].toString());
			if (operationArray[i].getType().equals("CREDIT"))
				total += operationArray[i].getAmount();
			else if (operationArray[i].getType().equals("DEBIT"))
				total -= operationArray[i].getAmount();
		}
		System.out.println("Total: " + total);
	}
}
