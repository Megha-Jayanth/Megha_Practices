package megha_practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EntireDateOfJanuary {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.of(2024, 1, 1);
		  
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
		
		for(int i=0;i<31;i++) {
			System.out.println(date.format(formatter));
			date=date.plusDays(1);
		}

	}

}
