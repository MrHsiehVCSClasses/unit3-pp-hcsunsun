package u3pp;


import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * takes a string that user imput, check of it's (Stop), if not, check if it is a leap year using isLeapYear(), print out the outcome and ask agian untol the user say "stop"
 * @author YOUR NAME HERE
 */

class Main {

	public static void main(String[] args) {

		//YOUR CODE HERE
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();

		
		while (!input.toUpperCase().equals("STOP")) {

			
			int year = Integer.parseInt(input);

			if (LeapYear.isLeapYear(year))
			{
				System.out.println(year + " is a leap year");
			}
			else{
				System.out.println(year + " is not a leap year");
			}
			System.out.print("Enter a year (or enter STOP to end): ");
			input = sc.nextLine();
			
		}
		//YOUR CODE HERE
		sc.close();
	}
}