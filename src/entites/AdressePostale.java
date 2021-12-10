package entites;

public class AdressePostale
{
	int		streetNb;
	String	streetName;
	int		postalCode;
	String	cityName;
	
	AdressePostale(int _streetNb, String _streetName, int _postalCode, String _cityName)
	{
		streetNb = _streetNb;
		streetName = _streetName;
		postalCode = _postalCode;
		cityName = _cityName;
	}
}
