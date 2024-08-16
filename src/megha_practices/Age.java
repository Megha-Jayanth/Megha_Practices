package megha_practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		try(Scanner scanner=new Scanner(System.in)){
			
			System.out.println("Enter Date Of Birth(dd-MM-yyyy):\t");
			
			String stringDob=scanner.next();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			try {
			
			LocalDate dob = LocalDate.parse(stringDob, formatter);
			
			LocalDate currentYear=LocalDate.now();
			
			int age = currentYear.getYear() - dob.getYear();
			
			System.out.println("Your age in 2024 is:\t"+age);
			
			}
			catch(DateTimeParseException e) {
				
				System.out.println("Enter Correct Format(dd-MM-yyyy)");
			}
		}

	}

}
