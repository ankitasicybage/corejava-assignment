package CybageAssignment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.TimeZone;
import java.util.Locale;

public class DateTimeInGMT {

	public static void main(String[] args) {

		Date localTime = new Date();

		DateFormat s = new SimpleDateFormat("dd/MM/yyyy" + " " + " HH:mm:ss");

		s.setTimeZone(TimeZone.getTimeZone("GMT"));

		System.out.println("local Time:" + localTime);

		System.out.println("Time IN Gmt : " + s.format(localTime));
		
		
	      SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	      
	      String DateToStr = format.format(localTime);
	      System.out.println(DateToStr);
	      
	      format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	      DateToStr = format.format(localTime);
	      System.out.println(DateToStr);
	      
	      format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
	      DateToStr = format.format(localTime);
	      System.out.println(DateToStr);
	      
	      format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
	      DateToStr = format.format(localTime);
	      System.out.println(DateToStr);
	      
	      try {
	         Date strToDate = format.parse(DateToStr);
	         System.out.println(strToDate);
	      } catch (ParseException e) {
	         e.printStackTrace();
	      } 
	   } 
	
}
