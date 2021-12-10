package fr.diginamic.banque.entites;

public abstract class Operation
{
	private String date;
	private int amount;
	
	Operation(String _date, int _amount)
	{
		date = _date;
		setAmount(_amount);
	}
	
	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	
	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public abstract String getType();
	
	public String toString()
	{
		return "type: " + getType() + "; date: " + date + "; amount: " + getAmount();
	}
}
