import java.awt.*;
import javax.swing.*;
public class ControlJPanel extends JPanel
{
public ControlJPanel ()
{
    super ();
    GridLayout grid = new GridLayout(2,1,10,10);
//    GridLayout grid = new GridLayout(2,1);
    setLayout(grid);
    //try commenting the two lines above to run the lab without a layout
    setBackground(Color.green);
    CenterPanel centerP = new CenterPanel();
    TopPanel topP = new TopPanel();
    add(topP);
    add(centerP);
}
}

