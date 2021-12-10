package entites2;

import entites.AdressePostale;

public class Personne
{
	public String			lastName;
	public String			firstName;
	public AdressePostale	postalAddress;
	
	public Personne(String _lastName, String _firstName)
	{
		lastName = _lastName;
		firstName = _firstName;
	}
	
	public Personne(String _lastName, String _firstName, AdressePostale _postalAddress)
	{
		this(_lastName, _firstName);
		postalAddress = _postalAddress;
	}
}
