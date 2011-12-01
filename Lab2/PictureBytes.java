
/**
 * Course: CS 2301
 * Section: 01
 * Professor: Shaw
 * Name: Andres Castro
 * Assignment #: 2 
 */
public class PictureBytes
{
    public static void main()
    {
       int bytes, bits, kilo, mega;
       bits = 1200 * 1600 * 32;
       System.out.println("The number of bits is: " + bits);
       bytes = bits / 8;
       System.out.println("The number of bytes is: " + bytes);
       kilo = bytes / 1024;
       System.out.println("the number of Kilobytes is: " + kilo);
       mega = kilo / 1024;
       System.out.println("The n umber of Megabytes is: " + mega);
       System.out.println("The cost for question 5 is: $" + mega / 256.0 * 10);
       System.out.println("The cost for question 6 is: $" + kilo / 16 * 300);
    }


}
