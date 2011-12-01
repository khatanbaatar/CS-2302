
/**
 * Course: ....
 * Section: .....
 * Professor: ......
 * Name: .....
 * Assignment #: ...... 
 */
import java.util.Scanner;

public class GPA
{   
    public static void main(){
        
    double cumulativeGPA;
    double attemptedHours;
    double creditHours;
    String anticipated;
    
    final int a = 4;
    final int b = 3;
    final int c = 2;
    final int d = 1;
    final int f = 0;
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Your Current Cumulative GPA: ");
    cumulativeGPA = s.nextDouble();
    System.out.println("Enter Your Total Number of Attempted Credit Hours Completed to Date: ");
    attemptedHours = s.nextDouble();
    System.out.println("How will the grades that I anticipate receiving in the courses I am now taking affect my overall GPA?");
    System.out.println("Enter the credit hours and expected grade for (up to six) courses that you are presently taking.");
    System.out.println("Course 1 Credit Hours: ");
    creditHours = s.nextDouble();
    System.out.println("Course 1 Anticipated grade: ");
    anticipated = s.next();
    
    public static void gpaConversion();
    
    double qualityPoints = ((a x 3) + (b x 4) + (c x 2) + (d x 4) + (f x 2));
    double gpa = qualityPoints/attemptedHours;
    
    System.out.println("Your GPA is: ") + gpa;
 
    }
}
