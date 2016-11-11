

/**
 *
 * @author pbw5003
 */

import java.awt.*;
import javax.swing.*;

public class pauls_firstPanel extends JPanel

{
    
    public pauls_firstPanel ()
{
super ();    
BorderLayout border = new BorderLayout();
setLayout(border);
//GridLayout grid = new GridLayout(1,3,4,1);
//setLayout(grid);
setBackground(Color.pink);
JButton jb1 = new JButton("PBW5003 Lab 04 Graphics." );
jb1.setBackground(Color.WHITE);
JButton jb2 = new JButton("I am in the middle");
jb2.setBackground(Color.yellow);
JButton jb3 = new JButton("I am on the South)");
jb3.setBackground(Color.CYAN);
JButton jb4 = new JButton("This is Paul Witt's first JPanel.   I chose green as a background. "); 
jb4.setBackground(Color.green);

add(jb1, "North"  );
add(jb2);
add(jb4); 
//add(jb3,"South");
}
}