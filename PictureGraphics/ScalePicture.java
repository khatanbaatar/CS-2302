
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 12 
 */

public class ScalePicture
{
    // Scales a picture to a size of your choice
    public static void main(){
        Picture sourcePicture = new Picture("rose.jpg "); // Loads rose picture
        Picture targetPicture1; // Declares picture value
        Picture targetPicture2; // Declares picture value
        targetPicture1 = copyToScale(sourcePicture,3); // sets targetPicture1 to the method CopyToScale
        targetPicture2 = copyToScale(sourcePicture,.5);// sets targetPicture2 to the method CopyToScale
        targetPicture1.show(); // Shows targetPicture1
        targetPicture2.show(); // Shows targetPicture2
    }
    
    // Method scales a picture
    public static Picture copyToScale(Picture sourcePict, double scale){
        Pixel sourcePix, targetPix;
        Picture targetPict = new Picture((int)(sourcePict.getWidth() * scale) + 1, (int)(sourcePict.getHeight() * scale) + 1);
        // Loops though the x-axis pixles
        for (double sourceX = 0, targetX = 0; sourceX < sourcePict.getWidth(); 
					 	          sourceX += 1/(scale), targetX++)
		    // Loops though the y-axis pixles
            for (double sourceY = 0, targetY = 0; sourceY < sourcePict.getHeight(); 
					 	          sourceY += 1/(scale), targetY++)
            {
                  sourcePix = sourcePict.getPixel((int)(sourceX), (int)(sourceY));
                  targetPix = targetPict.getPixel((int)(targetX), (int)(targetY));
                  targetPix.setColor(sourcePix.getColor()); // Paints the pixels of sourcePicture into targetPictures
            }
        return targetPict; // returns back to the method
     }
}
