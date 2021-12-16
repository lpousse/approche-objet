package menu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import maps.Pays;

public class FileExtractor
{
	Path path;
	List<String[]> entries = new ArrayList<>();
	Map<String, Integer> departmentPopulation = null;
	Map<String, Integer> regionPopulation = null;
	
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
	
	private void computeDepartmentPopulation()
	{
		departmentPopulation = new HashMap<>();
		
		for (String[] entry : entries)
		{
			int pop = Integer.parseInt(entry[9].replace(" ", ""));
			if (departmentPopulation.get(entry[2]) == null)
				departmentPopulation.put(entry[2], pop);
			else
				departmentPopulation.replace(entry[2], departmentPopulation.get(entry[2]) + pop);
		}
	}
	
	public int getDepartmentPopulation(String departmentCode)
	{
		departmentCode = departmentCode.trim();
		if (departmentPopulation == null)
			computeDepartmentPopulation();
		if (departmentPopulation.get(departmentCode) == null)
			return -1;
		return departmentPopulation.get(departmentCode);
	}
	
	private void computeRegionPopulation()
	{
		regionPopulation = new HashMap<>();
		
		for (String[] entry : entries)
		{
			int pop = Integer.parseInt(entry[9].replace(" ", ""));
			if (regionPopulation.get(entry[1]) == null)
				regionPopulation.put(entry[1], pop);
			else
				regionPopulation.replace(entry[1], regionPopulation.get(entry[1]) + pop);
		}
	}
	
	public int getRegionPopulation(String region)
	{
		region = region.trim();
		if (regionPopulation == null)
			computeRegionPopulation();
		if (regionPopulation.get(region) == null)
			return -1;
		return regionPopulation.get(region);
	}
	
	public List<String> get10MostPolupatedRegion(String region)
	{
		return null;
	}
}
