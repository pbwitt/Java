import java.awt.*;
import javax.swing.*;
public class PanelRight extends JPanel
{
public PanelRight ()
{
super ();
GridLayout grid = new GridLayout(3,1);
setLayout(grid);
//try commenting the two lines above to run the lab without a layout
setBackground(Color.red);
JButton jb1 = new JButton("I belong to panel right");
JButton jb2 = new JButton("Hi");
jb2.setBackground(Color.red);
JButton jb3 = new JButton("I am a JButton)");
add(jb1);
add(jb2);
add(jb3);

}
}

