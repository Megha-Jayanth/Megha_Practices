package megha_practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateOfFebruary {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.of(2024, 2, 1);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE,MMMM dd,yyyy");
		
		for(int i=0;i<28;i++) {
			
			System.out.println(date.format(formatter));
			
			date=date.plusDays(1);
		}
	}

}
