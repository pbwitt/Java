import java.awt.*;
import javax.swing.*;
public class PanelLeft extends JPanel
{
public PanelLeft ()
{
super ();
GridLayout grid = new GridLayout(1,1);
setLayout(grid);
//try commenting the two lines above to run the lab without a layout
setBackground(Color.pink);
JButton jb1 = new JButton("I belong to panel left");
add(jb1);
}
}

