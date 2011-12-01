
/**
 * Course: ....
 * Section: .....
 * Professor: ......
 * Name: .....
 * Assignment #: ...... 
 */
import java.util.Scanner;

public class TimeConvert
{
    public static void main(){
        Scanner s = new Scanner(System.in);
        int hour;
        int minute;
        int second;
        int seconds;
        
        System.out.print("Type in a number of seconds : ");
        seconds = s.nextInt();
        hour = seconds / 3600;
        System.out.println("Hours: " + hour);
        minute = (seconds % 3600) / 60;
        System.out.println("Minute: " + minute);
        second = (seconds % 3600) % 60;
        System.out.println("Seconds: " + second);

        
    }


}
