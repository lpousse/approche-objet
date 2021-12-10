package fr.diginamic.banque.entites;

public class CompteTaux extends Compte
{
	private float interestRate;
	
	public CompteTaux(int _accountNb, int _accountBalance, float _interestRate)
	{
		super(_accountNb, _accountBalance);
		interestRate = _interestRate;
	}
	
	public String toString()
	{
		return super.toString() + "; Interest rate: " + interestRate;
	}
}
