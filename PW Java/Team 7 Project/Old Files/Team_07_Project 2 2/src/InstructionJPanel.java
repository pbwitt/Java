import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;


public class InstructionJPanel extends JPanel
{
    
    JTextPane instructions;
    
    InstructionJPanel()
    {
      
        
        
       super();
       setBackground(new Color(224, 224, 224));
       setLayout(null);
       
       
       Border thickBorder = new LineBorder(Color.BLACK, 3);
        
       //JButton j12 = new JButton(); 
       //j12.setText("panel under construction");
       //add(j12);
       //j12.setBorder(thickBorder);
       //j12.setBounds(0,250,640,30);
       //j12.setVisible(true);
       //j12.setFont(new Font("Arial", Font.PLAIN, 20));
       
       instructions = new JTextPane();
       add (instructions);
       instructions.setBounds(10, 10, 640, 400);
       instructions.setFont(new Font("Arial", Font.PLAIN, 14));
       
       StyledDocument doc = instructions.getStyledDocument();
       
       Style def = StyleContext.getDefaultStyleContext().getStyle( StyleContext.DEFAULT_STYLE );
       Style regular = doc.addStyle("regular", def);
       
       Style bold = doc.addStyle( "bold", regular );
       StyleConstants.setBold( bold, true );
       
        try {
            doc.insertString(0, "Remember the old time battleship, where you sat across from your friend or\nsibling"+
                    "and placed your ships and then guessed...\nand just when you knew you were about to lose..."+
                    "you closed the game panel, and real snarky you\n would say, I suppose we will never know who won", regular);
            doc.insertString(doc.getLength(), "Difficutly:\n", bold);
        } catch (BadLocationException ex) {
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
}