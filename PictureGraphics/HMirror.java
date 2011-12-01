
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres Castro 
 * Assignment #: Lab 10
 */
public class HMirror
{   // Loads picture, shows it, executes the method, applies changes
    public static void main(){
    Picture cat = new Picture("caterpillar.jpg");
    cat.show();
    mirror(cat);
    cat.repaint();
    }
    // Makes the bottom part of the picture mirror the top
    public static void mirror(Picture pict){
        int mirrorPoint = pict.getHeight() / 2;    // calculating the midpoint
        Pixel topPixel = null;                   // the left pixel to copy from
        Pixel bottomPixel = null;                  // the right pixel to copy to

        // loop through the rows
        for (int x = 0; x < pict.getWidth(); x++)
            {
                // loop from 0 to just before the mirror point
                for (int y = 0; y < mirrorPoint; y++)
                    {
                        // Getting the left and right pixels
                        topPixel = pict.getPixel(x, y);      
                        bottomPixel = pict.getPixel(x,pict.getHeight() - 1 - y);

                        // Setting the right pixel to the left pixel's color
                        bottomPixel.setColor(topPixel.getColor());
                    }
                }
          }

}
