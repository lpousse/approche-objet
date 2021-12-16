package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 5, 19, 23, 59, 30);
		Date date1 = cal.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format1.format(date1));
		
		Date date2 = new Date(121, 11, 16, 15, 0);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(format2.format(date2));
		
		SimpleDateFormat format3 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
		System.out.println(format3.format(date2));
		SimpleDateFormat format4 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", new Locale("ru"));
		System.out.println(format4.format(date2));
		SimpleDateFormat format5 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINA);
		System.out.println(format5.format(date2));
		SimpleDateFormat format6 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.GERMANY);
		System.out.println(format6.format(date2));
	}
}
