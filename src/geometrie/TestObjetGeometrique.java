package geometrie;

public class TestObjetGeometrique
{

	public static void main(String[] args)
	{
		ObjetGeometrique[] array = {new Cercle(5.0), new Rectangle(4.0, 3.0)};
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("perimetre: " + array[i].perimetre() + "; surface: " + array[i].surface());
		}
	}

}
