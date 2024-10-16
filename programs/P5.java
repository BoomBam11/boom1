//leap year

/*	Why Do We Have Leap Years?
	Earth's Orbit:
	
	It takes the Earth a little more than 365 days to go all the way around the Sun. It actually takes about 365 days and 6 hours (or one-quarter of a day).
	Extra Hours:
	
	Those extra 6 hours add up each year. After 4 years, 6 hours + 6 hours + 6 hours + 6 hours = 24 hours. That's one whole extra day!
	The Basic Rule:
	Every 4 years: We add this extra day to the calendar. That's why February has 29 days every 4 years. 
*/


/*
 * Special Rules:
	Skip Some Leap Years:
	
	Every 100 years: We skip adding the extra day. So, years like 1900 were not leap years.
	Add Back a Leap Year:
	
	Every 400 years: We add the extra day back. So, years like 2000 were leap years.
	Easy Way to Remember:
	Normal Leap Year: Happens every 4 years.
	Skip Leap Year: Happens every 100 years.
	Don’t Skip Leap Year: Happens every 400 years.
 * 
 * 
 * 
 * 
 * 
 * 
*/



 

package programs;

public class P5 {

	static void yearLeap(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("leap year");
				} else {
					System.out.println("not leap year");
				}
			} else {
				System.out.println("leap year");
			}

		} else {

			System.out.println("not leap year");
		}

		
// A century year should be divisible by 4 and not by 100 both for this i write &&(and operator)
//  Logical or me ek condition true rhega to next condition execute nhi hoga
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			System.out.println("leap year");
//		} else {
//
//			System.out.println("not leap year");
//		}

	}

	public static void main(String[] args) {

		yearLeap(1800);
		yearLeap(100);
		yearLeap(1600);
		yearLeap(1900);
		yearLeap(2000);
		yearLeap(2002);
	}

}
