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
	
	public void displayNameUppercase()
	{
		System.out.println(lastName.toUpperCase() + " " + firstName.toUpperCase());
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String _lastName)
	{
		lastName = _lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String _firstName)
	{
		firstName = _firstName;
	}
	
	public AdressePostale getPostalAddress()
	{
		return postalAddress;
	}
	
	public void setPostalAddress(AdressePostale _postalAddress)
	{
		postalAddress = _postalAddress;
	}
}
