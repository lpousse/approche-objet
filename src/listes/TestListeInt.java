package listes;

import java.util.*;

public class TestListeInt
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		
		System.out.println("elements de list:");
		for (Integer i: list)
			System.out.println(i);
		
		System.out.println("La taille de list est: " + list.size());
		
		Integer max = list.get(0);
		for (Integer i: list)
			max = max < i ? i : max;
		System.out.println("Le plus grand element de list est: " + max);
		
		Integer min = list.get(0);
		for (Integer i: list)
			min = min > i ? i : min;
		System.out.println("Le plus petit element de list est: " + min);
		list.remove(min);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) < 0)
				list.set(i, -list.get(i));
		}
		System.out.println(list);
	}
}
