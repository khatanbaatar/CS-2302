
/**
 * Course: ....
 * Section: .....
 * Professor: ......
 * Name: .....
 * Assignment #: ...... 
 */
public class RightRotation
{
    public static void main(){
        Picture girl = new Picture("katie.jpg"); // Loads katie picture
        
        Picture blank = new Picture("7inX95in.jpg");
        copyImageRightRotation(girl,blank); // Calls the copyImageRightRotation method
        girl.show();// shoes the girl picture.
        blank.show(); // shows the blank picture
    }
    
    // Method rotates a picture right
    public static void copyImageRightRotation(Picture sourcePict, Picture targetPict){
        Pixel sourcePix, targetPix;
        int endPoint = sourcePict.getHeight() - 1 ;
        
        for (int x = 0; x < sourcePict.getWidth(); x++)
            {
                for (int y = 0; y < sourcePict.getHeight(); y++)
                    {
                        sourcePix = sourcePict.getPixel(x, y);
                        targetPix = targetPict.getPixel(sourcePict.getHeight() - y - 1, x);
                        targetPix.setColor(sourcePix.getColor());
                    }
            }        
    }
}
