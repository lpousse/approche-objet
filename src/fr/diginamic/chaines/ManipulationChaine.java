package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine
{	
	public static void main(String[] args)
	{
		String chaine = "Durand;Marcel;2 523.5";
		
		System.out.println("Premier caractère: " + chaine.charAt(0));
		System.out.println("Longueur: " + chaine.length());
		
		int firstSemicolon = chaine.indexOf(';');
		System.out.println("Premier ';': " + firstSemicolon);
		
		String FirstName = chaine.substring(firstSemicolon + 1, chaine.indexOf(';', firstSemicolon + 1));
		String familyName = chaine.substring(0, firstSemicolon);
		System.out.println("Nom de famille: " + familyName);
		System.out.println("Nom de famille en majuscules: " + familyName.toUpperCase());
		System.out.println("Nom de famille en minuscules: " + familyName.toLowerCase());
		
		String[] array = chaine.split(";");
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		Salarie marcel = new Salarie(array[0], array[1], Double.parseDouble(array[2].replace(" ", ""))); 
		System.out.println(marcel.getNom() + " " + marcel.getPrenom() + " " + marcel.getSalaire());
	}
}
