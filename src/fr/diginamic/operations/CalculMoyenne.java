package fr.diginamic.operations;

import java.util.Iterator;

public class CalculMoyenne
{
	double[] array = new double[0];
	
	public void ajout(double nb)
	{
		double[] newArray = new double[array.length + 1];
		
		for (int i = 0; i < array.length; i++)
			newArray[i] = array[i];
		
		newArray[array.length] = nb;
		array = newArray;
	}
	
	public double calcul()
	{
		double result = 0.0;
		
		for (int i = 0; i < array.length; i++)
		{
			result += array[i];
		}
		return result / array.length;
	}
}
