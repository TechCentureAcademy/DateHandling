package localDateFormat;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OtherFormatConversionTest2 {

	public static void main(String[] args) throws ParseException {
	
		LocalDate date = LocalDate.now();

		System.out.println("Current Date : " + date);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM yyyy");

		LocalDate nextDate;
		
		nextDate = date.plusDays(60);
		
		String finalDate = dateFormat.format(nextDate);
		
		System.out.println("Future Date  : " + finalDate.trim());
		
		DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("MMM d, yyyy");
		
		String finalDay = dayFormat.format(nextDate);
		
		System.out.println("Future Date  : " + finalDay.trim());
		
	}
}
