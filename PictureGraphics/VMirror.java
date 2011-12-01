
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 10
 */
public class VMirror
{   // Loads picture, shows it, executes the method, applies changes
    public static void main(){
        Picture cat = new Picture("caterpillar.jpg");
        cat.show();
        mirror(cat);
        cat.repaint();
    }
    // Makes the right half of the picture mirror the left
    public static void mirror(Picture pict){
        int mirrorPoint = pict.getWidth() / 2;    // calculating the midpoint
        Pixel leftPixel = null;                   // the left pixel to copy from
        Pixel rightPixel = null;                  // the right pixel to copy to

        // loop through the rows
        for (int y = 0; y < pict.getHeight(); y++)
            {
                // loop from 0 to just before the mirror point
                for (int x = 0; x < mirrorPoint; x++)
                    {
                        // Getting the left and right pixels
                        leftPixel = pict.getPixel(x, y);      
                        rightPixel = pict.getPixel(pict.getWidth() - 1 - x, y);

                        // Setting the right pixel to the left pixel's color
                        rightPixel.setColor(leftPixel.getColor());
                    }
             }
    }


}
