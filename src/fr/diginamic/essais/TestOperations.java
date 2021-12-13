package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations
{
	public static void main(String[] args)
	{
		System.out.println("5 + 2 = " + Operations.calcul(5.0, 2.0, '+'));
		System.out.println("9 - 52 = " + Operations.calcul(9.0, 52.0, '-'));
		System.out.println("6 * 1.5 = " + Operations.calcul(6.0, 1.5, '*'));
		System.out.println("80 / 3 = " + Operations.calcul(80.0, 3.0, '/'));
	}
}
