package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatConversionDateTest {

	public static void main(String[] args) throws ParseException {

		String input = "04/4/2021";
		
		SimpleDateFormat existingFormat = new SimpleDateFormat("M/d/yyyy");
		
		SimpleDateFormat newFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		String newFormatString = newFormat.format(existingFormat.parse(input));
		
		System.out.println("New Format     : " + newFormatString);

	}

}
