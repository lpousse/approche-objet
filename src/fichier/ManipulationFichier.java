package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManipulationFichier
{
	public static void main(String[] args) throws IOException
	{
		Path path = Paths.get("E:/dev/Diginamic/approche-objet/recensement.csv");
		Path path_edited = Paths.get("E:/dev/Diginamic/approche-objet/recensement_edited.csv");
		
		if (Files.isRegularFile(path) && Files.isReadable(path))
		{
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			for (int i = 0; i < lines.size(); i++)
			{
				String[] values = lines.get(i).split(";");
				lines.set(i, values[6] + ";" + values[2] + ";" + values[9] + ";");
			}
			
			Files.write(path_edited, lines, StandardCharsets.UTF_8);
		}
	}
}
