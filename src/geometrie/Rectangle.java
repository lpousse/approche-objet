package geometrie;

public class Rectangle implements ObjetGeometrique
{
	double length;
	double width;
	
	public Rectangle()
	{
	}
	
	public Rectangle(double _length, double _width)
	{
		length = _length;
		width = _width;
	}
	
	public double perimetre()
	{
		return 2 * length + 2 * width;
	}
	
	public double surface()
	{
		return length * width;
	}
}
