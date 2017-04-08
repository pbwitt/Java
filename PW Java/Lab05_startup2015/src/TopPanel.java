import java.awt.*;
import javax.swing.*;
public class TopPanel extends JPanel
{
public TopPanel ()
   {
    super ();
    GridLayout grid = new GridLayout(3,1);
    setLayout(grid);
    //try commenting the two lines above to run the lab without a layout
    setBackground(Color.blue);
    JButton jb1 = new JButton("I belong to top panel");
    JButton jb2 = new JButton("We are");
    jb2.setBackground(Color.red);
    JButton jb3 = new JButton();
    ImageIcon psu = new ImageIcon("images/psu.jpg");
    jb3.setIcon(psu);
    add(jb1);
    add(jb2);
    add(jb3);
   }
}

