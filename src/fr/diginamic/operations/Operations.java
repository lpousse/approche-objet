package fr.diginamic.operations;

public class Operations
{
	public static double calcul(double a, double b, char operator)
	{
		switch (operator)
		{
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				return a / b;
		}
		return a;
	}
}
