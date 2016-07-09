package chapter12Apis;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A4HowOld {
	public static void main(String[] args) throws ParseException {
		try (Scanner scanner = new Scanner(System.in);) {

			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

			System.out.println("Please write down you birthday (yyyy-mm-dd)");
			Date birth = dateFormat.parse(scanner.nextLine());

			Date current = new Date();

			long life = current.getTime() - birth.getTime();
			System.out.println("Your age is "
					+ (life / (365 * 24 * 60 * 60 * 1000L)));
			
			
		}

	}
}
