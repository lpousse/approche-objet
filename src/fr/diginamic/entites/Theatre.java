package fr.diginamic.entites;

public class Theatre
{
	String name;
	int maxCapacity;
	int registeredCustomers;
	double totalRevenues;
	
	public Theatre()
	{
		
	}
	
	public Theatre(String name, int maxCapacity)
	{
		this.name = name;
		this.maxCapacity = maxCapacity;
	}
	
	public void inscrire(int nbCustomers, double entryPrice)
	{
		if (registeredCustomers + nbCustomers <= maxCapacity)
		{
			registeredCustomers += nbCustomers;
			totalRevenues += nbCustomers * entryPrice;
		}
		else
			System.err.println("The theatre is full !");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getMaxCapacity()
	{
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity)
	{
		this.maxCapacity = maxCapacity;
	}

	public int getRegisteredCustomers()
	{
		return registeredCustomers;
	}

	public void setRegisteredCustomers(int registeredCustomers)
	{
		this.registeredCustomers = registeredCustomers;
	}

	public double getTotalRevenues()
	{
		return totalRevenues;
	}

	public void setTotalRevenues(double totalRevenues)
	{
		this.totalRevenues = totalRevenues;
	}
}
