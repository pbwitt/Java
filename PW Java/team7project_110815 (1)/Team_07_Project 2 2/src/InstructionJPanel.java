import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;


public class InstructionJPanel extends JPanel
{
    
        JTextPane instructions;
    
    public InstructionJPanel()
    {   
       super();
       setBackground(new Color(224, 224, 224));
       setLayout(null);
       
       Border thickBorder = new LineBorder(Color.BLACK, 3);
               
       instructions = new JTextPane();
       add (instructions);
       instructions.setBounds(10, 10, 640, 550);
       instructions.setFont(new Font("Arial", Font.PLAIN, 14));
       
       StyledDocument doc = instructions.getStyledDocument();
       
       Style def = StyleContext.getDefaultStyleContext().getStyle( StyleContext.DEFAULT_STYLE );
       Style regular = doc.addStyle("regular", def);
       
       //Bold Font Size 25 and Underlined
       Style boldTwentyFive = doc.addStyle( "bold25", regular );
       StyleConstants.setBold(boldTwentyFive, true );
       StyleConstants.setFontSize(boldTwentyFive, 25);
       StyleConstants.setUnderline(boldTwentyFive, true);
       
       //Bold Font Size 20 and Underlined
       Style boldTwenty = doc.addStyle( "bold", regular );
       StyleConstants.setBold(boldTwenty, true );
       StyleConstants.setFontSize(boldTwenty, 20);
       StyleConstants.setUnderline(boldTwenty, true);
       
       //Bold Font Size 15
       Style boldFifteen = doc.addStyle( "bold15", regular );
       StyleConstants.setBold(boldFifteen, true );
       StyleConstants.setFontSize(boldFifteen, 15);
       
       
       //Bold and Italic
       Style boldItalic = doc.addStyle("Bold Italic", regular);
       StyleConstants.setBold( boldItalic, true );
       StyleConstants.setItalic(boldItalic, true);
       
        try 
        {
            doc.insertString(0, "Introduction\n", boldTwentyFive);
            doc.insertString(doc.getLength(), "Remember the old time battleship, where you sat across from your friend or\nsibling"+
                    "and placed your ships and then guessed...\nand just when you knew you were about to lose..."+
                    "you closed the game panel, and real snarky you\nwould say, I suppose we will never know who won...\n\n", regular);
            //How To Play
            doc.insertString(doc.getLength(), "How To Play\n", boldTwenty);
             doc.insertString(doc.getLength(), "You must select all options before beginning the game.\n", boldFifteen);
            doc.insertString(doc.getLength(),  "Choose your desired number of ships.\n"+
                    "Next choose your difficulty level. " +
                    "If playing against the computer, select the computer's intelligence.\n" +
                    "Finally, click play to begin, and most importantly, have fun! \n\n", regular);
            // Number of ships
            doc.insertString(doc.getLength(), "Number of Ships\n", boldTwenty);
            doc.insertString(doc.getLength(), "Choose the number of ships you and your opponent will use.\n\n", regular);
            //Difficulty Section
            doc.insertString(doc.getLength(), "Difficutly\n", boldTwenty);
            //Easy
            doc.insertString(doc.getLength(), "Easy: ", boldItalic);
            doc.insertString(doc.getLength(), "The game will give the player a ship size of 4 or 5\n\n", regular);
            //Medium
            doc.insertString(doc.getLength(), "Medium: ", boldItalic);
            doc.insertString(doc.getLength(), "The game will give the player the same size ships from the game of your youth.\n\n", regular);
            //Hard
            doc.insertString(doc.getLength(), "Hard: ", boldItalic);
            doc.insertString(doc.getLength(), "The game will give the player a ship size of 2 or 3.\n\n", regular);
            
            // Computer Intelligence
            doc.insertString(doc.getLength(), "Computer Intelligence\n", boldTwenty);
            //Easy
            doc.insertString(doc.getLength(), "Easy: ", boldItalic);
            doc.insertString(doc.getLength(), "The computer will select all pieces with a random nature." +
                    " As well as attacking the blocks with in random fashion.\n\n", regular);
            //Normal
            doc.insertString(doc.getLength(), "Normal: ", boldItalic);
            doc.insertString(doc.getLength(), "The computer will select all pieces with a random nature." +
                    " BUT once a ship is found the comptuer will attack in a more intelligent manner.\n\n", regular);
        } catch (BadLocationException ex) 
        {
            Logger.getLogger(InstructionJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
       instructions.append("\n");
       instructions.append("Well this is the 2015 version, no more closing lid.");
       instructions.append("You can now choose the number of ships, how difficult the game is and how smart\n the computer is.");
       instructions.append("You must select all options before advancing to the game panel");
       instructions.append("\n");
       instructions.append("\n");
       instructions.append("<html><bold>Ships:\n</bold></html>");
       instructions.append("Select the number of ships you want to sink.  Combine this with the difficulty level and the game");
       instructions.append("can become very difficult");
       instructions.append("\n");
       instructions.append("\n");
       instructions.append("Difficutly:\n");
       instructions.append("This will change the ship size that you are playing with.  Easy will give you all 4 or 5 size ships.");
       instructions.append("Medium will give you the same ships that we remember playing from our youth and");
       instructions.append(" difficult will give you all 2 or 3 size ships.");
       instructions.append("\n");
       instructions.append("\n");
       instructions.append("Computer Intelligence:\n");
       instructions.append("On easy mode the compuer will select all pieces with a random nature, while normal mode");
       instructions.append("will have the computer select in a random nature till it hits, then will select in an intelligent manner.");
       
         */      
       

       
    }
   /* 
    InstructionJPanel()
    {
      
        
        
       super();
       setBackground(new Color(224, 224, 224));
       setLayout(null);
       
       
       Border thickBorder = new LineBorder(Color.BLACK, 3);
        
       JButton j12 = new JButton(); 
       j12.setText("panel under construction");
       add(j12);
       j12.setBorder(thickBorder);
       j12.setBounds(0,250,640,30);
       //j12.setVisible(true);
       j12.setFont(new Font("Arial", Font.PLAIN, 20));
       

       
    }
    */
}