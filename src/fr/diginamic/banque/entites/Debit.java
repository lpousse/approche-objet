package fr.diginamic.banque.entites;

public class Debit extends Operation
{
	public Debit(String _date, int _amount)
	{
		super(_date, _amount);
	}
	
	public String getType()
	{
		return "DEBIT";
	}
}
