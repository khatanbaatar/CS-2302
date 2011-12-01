
/**
 * Course: ....
 * Section: .....
 * Professor: ......
 * Name: .....
 * Assignment #: ...... 
 */
import java.util.Scanner;

public class TempConvert
{
    public static void main(){
        Scanner s = new Scanner(System.in);
        
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;  

        double fahrenheitTemp;
        double celsiusTemp;   // value to convert

        // conversion formula
        System.out.println("Enter a Celsius Temperature: ");
        celsiusTemp = s.nextDouble();
        
        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
        //outputing the result
        
        System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);

        
    }


}
