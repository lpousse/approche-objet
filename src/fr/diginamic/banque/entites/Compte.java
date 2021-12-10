package fr.diginamic.banque.entites;

public class Compte
{
	private int accountNb;
	private int accountBalance;
	
	public Compte(int _accountNb, int _accountBalance)
	{
		accountNb = _accountNb;
		accountBalance = _accountBalance;
	}
	
	public int getAccountNb()
	{
		return accountNb;
	}
	
	void setAccountNb(int _accountNb)
	{
		accountNb = _accountNb;
	}
	
	public int getAccountBalance()
	{
		return accountBalance;
	}
	
	void setAccountBalance(int _accountBalance)
	{
		accountBalance = _accountBalance;
	}
	
	public String toString()
	{
		return "Account number: " + accountNb + "; Account balance: " + accountBalance;
	}
}
