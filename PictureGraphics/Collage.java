
/**
 * Course: 2301
 * Section: 01
 * Professor: A. Shaw
 * Name: Andres Castro
 * Assignment #: Lab 11
 */
public class Collage
{
    public static void main(){
        Picture source1Picture = new Picture("flower1.jpg"); // Imports flower1 picture and names it Source1Picture
        Picture source2Picture = new Picture("flower2.jpg"); // Imports flower2 picture and names it Source2Picture
        Picture targetPicture = new Picture("640x480.jpg"); //Imports 640x480 picture and names it targetPicture
        copyImage(source1Picture,targetPicture,0,0,0,380); // Copys the source1Picture to the Target picture at the respected cords
        copyImage(source2Picture,targetPicture,0,0,100,380);// Copys the source2Picture to the Target picture at the respected cords
        negate(source1Picture); // Inverts the color of source1Pictre
        copyImage(source1Picture,targetPicture,0,0,200,380); // Copys the negated source1Pictre to the Target picture at the respected cords
        removeBlue(source2Picture);// Removes blue from the picture
        copyImage(source2Picture,targetPicture,0,0,300,380); // Copys the noneblue source2Picture to the Target picture at the respected cords
        copyImage(source1Picture,targetPicture,0,0,400,380); // Copys the negated source1Pictre to the Target picture at the respected cords
        targetPicture.show(); // Shows the targetPicture
    }
    
    // Method Copys a picture to a another picture at cordinates of your choosing
    public static void copyImage(Picture sourcePict, Picture targetPict,
	      int sStartX, int sStartY, int tStartX, int tStartY)
    {
          Pixel sourcePix, targetPix;
        
          for (int sourceX = sStartX, targetX = tStartX; sourceX < sourcePict.getWidth(); 
					 		                              sourceX++, targetX++)
          {
                for (int sourceY = sStartY, targetY = tStartY; sourceY < sourcePict.getHeight(); 
			 		                              sourceY++, targetY++)
                {
                      sourcePix = sourcePict.getPixel(sourceX, sourceY);
                      targetPix = targetPict.getPixel(targetX, targetY);
                      targetPix.setColor(sourcePix.getColor());
                }
          }
    }

    // Method Removes blue from what ever picture you choose
    public static void removeBlue(Picture pict)
    {
          Pixel[] pixelArray = pict.getPixels();

          for  (int count = 0; count < pixelArray.length; ++count)
              pixelArray[count].setBlue(0);
     }

     // Method negates the color of picture
    public static void negate(Picture pict)
    {
          Pixel[] pixelArray = pict.getPixels();
          int colorval = 0;

          for  (int count = 0; count < pixelArray.length; ++count)
          {
              colorval = pixelArray[count].getRed();  
              pixelArray[count].setRed(255-colorval);
              colorval = pixelArray[count].getGreen();  
              pixelArray[count].setGreen(255-colorval);
              colorval = pixelArray[count].getBlue();  
              pixelArray[count].setBlue(255-colorval);
          }
    }
}
