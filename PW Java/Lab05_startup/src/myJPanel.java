import java.awt.*;
import javax.swing.*;
public class myJPanel extends JPanel
{
public myJPanel ()
{
super ();
GridLayout grid = new GridLayout(1,1);
setLayout(grid);
//try commenting the two lines above to run the lab without a layout
setBackground(Color.green);
PanelLeft left = new PanelLeft();
PanelRight right = new PanelRight();
add(left);
add(right);
}
}

