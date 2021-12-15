package menu;

import java.io.IOException;
import java.util.Scanner;

public class MenuRecensement
{
	public static void main(String[] args) throws IOException
	{
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);
		FileExtractor fe = new FileExtractor("E:/dev/Diginamic/approche-objet/recensement.csv");
		
		System.out.println("Bienvenue dans le programme d'exploration du recensement de la population.");
		while (!exit)
		{
			System.out.println("Quelle données voulez-vous consulter ?");
			System.out.println("1. Population d'un ville; 2. Population d'un département; 3. Population d'une région;");
			System.out.println("4. Les 10 régions les plus peuplées; 5. Les 10 département les plus peuplés; 6. Les 10 villes les plus peuplées d'un département;");
			System.out.println("7. Les 10 villes les plus peuplées d'une région; 8. Les 10 villes les plus peuplées de France; 9. Quitter le programme;");
			int nb = scanner.nextInt();
			scanner.nextLine();
			switch (nb)
			{
				case 1:
				{
					System.out.println("De quelle ville voulez-vous connaitre la population ?");
					String city = scanner.nextLine();
					int pop = fe.getCityPopulation(city);
					if (pop < 0)
						System.out.println("Nous n'avons pas trouvé de ville correspondante à votre demande.");
					else
						System.out.println("La population totale de " + city + " est de " + pop + " habitants.");
					break;
				}
				case 2:
					System.out.println("Veuillez entrez le code du département dont vous voulez connaitre la population.");
					String departmentCode = scanner.nextLine();
					int pop = fe.getDepartmentPopulation(departmentCode);
					if (pop < 0)
						System.out.println("Nous n'avons pas trouvé de département correspondant à votre demande.");
					else
						System.out.println("La population totale de ce département est de " + pop + " habitants.");
					break;
				case 9:
				{
					exit = true;
					break;
				}
				default:
					System.err.println("Commande non reconnue. Veuillez réessayer.");
			}
		}
		System.out.println("Merci d'avoir utilisé notre programme. A bientôt.");
	}
}
