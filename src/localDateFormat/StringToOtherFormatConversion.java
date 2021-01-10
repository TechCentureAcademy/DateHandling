package localDateFormat;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToOtherFormatConversion {

	public static void main(String[] args) throws ParseException {
		
		String inputDate = "2021-01-03";
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate date = LocalDate.parse(inputDate, dateFormat);
		
		DateTimeFormatter newdateFormat = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		
		String newType = newdateFormat.format(date);

		System.out.println("Date  : " + newType);
		
		
	}
}
