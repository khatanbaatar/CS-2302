
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 11
 */
public class CopyImage
{
    public static void main(){
        Picture sourcePicture = new Picture("KatieFancy.jpg");  //Loads KatieFancy picture
        Picture targetPicture = new Picture("7inX95in.jpg");  // Loads Blank picture
        copyImage(sourcePicture, targetPicture); // Copys Katie Fancy into targetPicture
        sourcePicture.show(); //Shows original picture
        targetPicture.show(); //Shows modified target picture
    }
    
    // Copys an Image ontop of Another Image
    public static void copyImage(Picture sourcePict, Picture targetPict){
        
        Pixel sourcePix, targetPix;
        
        for(int x = 0; x < sourcePict.getWidth(); x++)
        {
            for(int y = 0; y < sourcePict.getHeight();y++)
            {
                sourcePix = sourcePict.getPixel(x,y);
                targetPix = targetPict.getPixel(x,y);
                targetPix.setColor(sourcePix.getColor());
            }
        }
    }
}
