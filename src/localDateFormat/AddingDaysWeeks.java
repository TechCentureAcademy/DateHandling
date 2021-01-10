package localDateFormat;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class AddingDaysWeeks {

	public static void main(String[] args) throws ParseException {
	
		LocalDate date = LocalDate.now();

		System.out.println("Current Date  : " + date);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
		
		String date1 = dateFormat.format(date);

		System.out.println("Date  : " + date1);
		
		LocalDate nextDate;
		
		nextDate = date.plusDays(1);
		
		System.out.println("Current Date  : " + dateFormat.format(nextDate));
		
		LocalDate nextMonth = date.plusMonths(1);
		
		System.out.println("Current Date  : " + dateFormat.format(nextMonth));
		
		LocalDate nextYear = date.plusYears(1);
		
		System.out.println("Current Date  : " + dateFormat.format(nextYear));
		
		DateTimeFormatter monthFormat = DateTimeFormatter.ofPattern("EEE");
		
		System.out.println("Month Only  : " + monthFormat.format(nextMonth));
		
		int monthNumber = 10;
		
		String month = Month.of(monthNumber).name();
		
		System.out.println("Month Only  : " + month);
		
	}
}
