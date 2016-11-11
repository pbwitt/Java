import java.awt.*;
import javax.swing.*;
public class myJPanelstd extends JPanel 
{
	public myJPanelstd()
	{
		setBackground(Color.pink);
                setLayout(new GridLayout(3,1));
	    JButton jb1, jb2, jb3,jb4;
    	    ImageIcon imageFred = new ImageIcon("images/fred.jpg");
	    jb1 = new JButton(imageFred); //JButton with image only
            jb1.setText("Fred");// adds a text to an existing button

            jb2 = new JButton("is a fan of .....");

            ImageIcon imageRon = new ImageIcon("images/r10.jpg");//creates the image to be used in a JButton
	    jb3 = new JButton("Ronaldinho");
	    jb3.setIcon(imageRon); // adds an image to an existing button
//-------------------------------------------------------	    
// add buttons to JPanel		
//-------------------------------------------------------	    
		add(jb1);
		add(jb2);
		add(jb3);
	}
}
