package megha_practices;

import java.util.Calendar;
import java.util.Locale;

public class MonthOfYear {

	public static void main(String[] args) {
		
		int year=2024;
		
		Calendar calender=Calendar.getInstance();
		
		for(int i=0;i<12;i++) {
			
			calender.set(Calendar.YEAR, year);
			
			calender.set(Calendar.MONTH, i);
			
			System.out.println(calender.getDisplayName(Calendar.MONTH, Calendar.LONG,Locale.ENGLISH)+""+year);
		}

	}

}
