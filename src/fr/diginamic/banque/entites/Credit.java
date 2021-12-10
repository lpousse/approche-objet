package fr.diginamic.banque.entites;

public class Credit extends Operation
{
	public Credit(String _date, int _amount)
	{
		super(_date, _amount);
	}
	
	public String getType()
	{
		return "CREDIT";
	}
}
