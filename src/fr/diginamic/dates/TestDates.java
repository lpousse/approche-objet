package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Date date1 = new Date(121, 11, 16);
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format1.format(date1));
		
		Date date2 = new Date(116, 4, 19, 11, 59, 30);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(format2.format(date2));
		
		Date date3 = new Date();
		System.out.println(format2.format(date3));
	}
}
