package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import listes.Continent;
import listes.Ville;

public class TestContinentAvecEnum
{
	public static void main(String[] args)
	{
		List<Ville> list = new ArrayList<>();
		
		list.add(new Ville("Tokyo", 343000, Continent.ASIE));
		list.add(new Ville("Bagdad", 10710350, Continent.ASIE));
		list.add(new Ville("Marrakech", 966987, Continent.AFRIQUE));
		list.add(new Ville("Lyon", 484000, Continent.EUROPE));
		list.add(new Ville("New-York", 8336817, Continent.AMERIQUE));
		list.add(new Ville("Sydney", 5312163, Continent.OCEANIE));
		list.add(new Ville("Marseille", 850700, Continent.EUROPE));
		
		for (Ville ville : list)
		{
			System.out.println(ville);
		}
	}
}
