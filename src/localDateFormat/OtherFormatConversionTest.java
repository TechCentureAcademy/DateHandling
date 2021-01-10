package localDateFormat;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OtherFormatConversionTest {

	public static void main(String[] args) throws ParseException {
	
		LocalDate date = LocalDate.now();

		System.out.println("Current Date  : " + date);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
		
		String date1 = dateFormat.format(date);

		System.out.println("Date  : " + date1);
		
	}
}
