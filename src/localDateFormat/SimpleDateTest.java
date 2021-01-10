package localDateFormat;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SimpleDateTest {

	public static void main(String[] args) throws ParseException {
		
		String input = "01/14/2021";   // String Input
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");   // Input String Date Pattern / Format
		
		LocalDate dateTime = LocalDate.parse(input, formatter);   // Conversion To Date Format from String
		
		System.out.println(dateTime.format(formatter)); // Converted To Date Format

		System.out.println("String Conversion : " + dateTime.format(formatter).toString());  // Converted To String
		
	}

}
