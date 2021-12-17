package fr.diginamic.testexceptions;

import listes.Continent;
import listes.Ville;

public class TestReflectionUtils
{
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException
	{
		Ville ville = new Ville("Tokyo", 343000, Continent.ASIE);
		
		try
		{
			ReflectionUtils.afficherAttributs(ville);
			ReflectionUtils.afficherAttributs(null);
		}
		catch (ReflectionException e)
		{
			System.err.println("A null parameter has been used with ReflectionUtils.afficherAttributs()");
		}
	}
}
