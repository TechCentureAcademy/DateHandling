package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatConversionToDay {

	public static void main(String[] args) throws ParseException {

		String input = "4/14/2021";
		
		SimpleDateFormat existingFormat = new SimpleDateFormat("M/d/yyyy");
		
		SimpleDateFormat newFormat = new SimpleDateFormat("EEEE, MMM dd, yyyy");
		
		String newFormatString = newFormat.format(existingFormat.parse(input));
		
		System.out.println("New Format     : " + newFormatString);

	}

}
