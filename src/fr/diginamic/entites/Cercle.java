package fr.diginamic.entites;

public class Cercle
{
	double radius;
	
	public Cercle(double radius)
	{
		this.radius = radius;
	}
	
	public double perimetre()
	{
		return Math.PI * radius * 2;
	}
	
	public double surface()
	{
		return Math.PI * radius * radius;
	}
}
