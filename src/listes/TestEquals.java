package listes;

public class TestEquals
{
	public static void main(String[] args)
	{
		Ville ville1 = new Ville("Angers", 48544);
		Ville ville2 = new Ville("Angers", 48544);
		
		System.out.println("Two objects with same parameters");
		System.out.println("equals: " + ville1.equals(ville2));
		System.out.println("==: " + (ville1 == ville2));
		
		ville2.nbHab = 45;
		System.out.println("Change nbHab");
		System.out.println("equals: " + ville1.equals(ville2));
		System.out.println("==: " + (ville1 == ville2));
		
		ville2.nbHab = 48544;
		ville2.name = "Poitiers";
		System.out.println("Change name");
		System.out.println("equals: " + ville1.equals(ville2));
		System.out.println("==: " + (ville1 == ville2));
		
		ville2.name = "Angers";
		System.out.println("Reset");
		System.out.println("equals: " + ville1.equals(ville2));
		System.out.println("==: " + (ville1 == ville2));
		
		ville2 = ville1;
		System.out.println("Setting ville1 and ville2 to the same object");
		System.out.println("equals: " + ville1.equals(ville2));
		System.out.println("==: " + (ville1 == ville2));
	}
}
