package menu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileExtractor
{
	Path path;
	List<String[]> entries = new ArrayList<>();
	
	public FileExtractor(String path) throws IOException
	{
		this.path = Paths.get(path);
		if (Files.isRegularFile(this.path) && Files.isReadable(this.path))
		{
			List<String> lines = Files.readAllLines(this.path, StandardCharsets.UTF_8);
			lines.remove(0);
			for (String string : lines)
				this.entries.add(string.split(";"));
		}
	}
	
	public int getCityPopulation(String city)
	{
		city = city.trim();
		for (String[] entry : entries)
		{
			if (city.equalsIgnoreCase(entry[6]))
				return Integer.parseInt(entry[9].replace(" ", ""));
		}
		return -1;
	}
	
	public int getDepartmentPopulation(String departmentCode)
	{
		departmentCode = departmentCode.trim();
		int total = 0;
		boolean foundDepartment = false;
		for (String[] entry : entries)
		{
			if (departmentCode.equalsIgnoreCase(entry[2]))
			{
				foundDepartment = true;
				total += Integer.parseInt(entry[9].replace(" ", ""));
			}
		}
		if (!foundDepartment)
			return -1;
		return total;
	}
}
