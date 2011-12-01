
/**
 * Course: 2301
 * Section: 01
 * Professor: Dr. Shaw
 * Name: Andres Castro
 * Assignment #: HW 6
 */
public class Leapyear
{
    public static void main(){
        Scanner s = new Scanner(System.in);
        int year;
        System.out.println("Type in a year after the year 1581: "); // Ask you to type in a date
        year = s.nextInt(); // store and displays a number you enter 
        if(year < 1582) // If the year you enter is less that 1582 it prints out statement below
            System.out.println("The Gregorian calendar was not yet adopted before 1582");
        isLeapYear(year);
    }
    
    // Year has remainder 0 when devied by 4 and 100 or 400
    public static boolean isLeapYear(int year){
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
		  System.out.print("This is a leap year"); // If the conditions come true then this is printed out
		return true;
        }
		  else {
		      System.out.println("This is not a leap year"); // if the conditions are false then this is printed out
		return false;
          }
	}
}
