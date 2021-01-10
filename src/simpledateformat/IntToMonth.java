package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class IntToMonth {

	public static void main(String[] args) throws ParseException {
		
		String sDate="31/12/1998";  
	    
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate); 
	    
	    SimpleDateFormat dateFormat = new SimpleDateFormat( "LLLL", Locale.getDefault());
	    
	    System.out.println(dateFormat.format(date1));
		
	}
}
