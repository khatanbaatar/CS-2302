
/**
 * Course: 2301
 * Section: 01
 * Professor: Shaw
 * Name: Andres Castro
 * Assignment #: 03 
 */
public class UsingStringMethods
{
    public static void main()
    {
        String sentence;
        sentence = "This is a Test Input for Assignment Number 6.";
        
        System.out.println("The 4 characters are : " + sentence.charAt(0) + sentence.charAt(11) + 
                           sentence.charAt(26) + sentence.charAt(34));
        System.out.println(sentence.substring(10,14) + " " + 
                           sentence.substring(36,42));
        System.out.println(sentence.substring(10,14).toUpperCase() + " " + 
                           sentence.substring(36,42).toUpperCase());
        String myString;
        myString = sentence.substring(10,14).toUpperCase() + " " + 
                           sentence.substring(36,42).toUpperCase();
                           
        System.out.println(myString);
        System.out.println(myString.length());
      
    }

}
