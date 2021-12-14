package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble
{
	public static void main(String[] args)
	{
		Set<Double>set = new HashSet<>();
		
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		for (Double double1 : set)
		{
			System.out.println(double1);
		}		
		Double max = 1.5;
		for (Double d: set)
			max = max < d ? d : max;
		System.out.println("Le plus grand element de set est: " + max);
		
		Double min = 1.5;
		for (Double d: set)
			min = min > d ? d : min;
		System.out.println("Le plus petit element de set est: " + min);
		set.remove(min);
		System.out.println(set);
	}
}
