package geometrie;

class Cercle implements ObjetGeometrique
{
	double radius;
	
	public Cercle()
	{
	}
	
	public Cercle(double _radius)
	{
		radius = _radius;
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
