//********************************************************************
//  LeftRight.java       Authors: Lewis/Loftus
//
//  Demonstrates the use of one listener for multiple buttons.
//********************************************************************

import javax.swing.JFrame;

public class FlashCard
{
   //-----------------------------------------------------------------
   //  Creates the main program frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("UGA Flash Card");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new FlashCardPanel());

      frame.pack();
      frame.setVisible(true);
   }
}
