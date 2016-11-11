import java.awt.*;
import javax.swing.*;
public class ControlJPanel extends JPanel
{
public ControlJPanel ()
{

    super ();
    BorderLayout border = new BorderLayout();
    setLayout(border); 
//       JButton j1;
//    JButton j2;
//  
//    JButton j4;
//       j1 = new JButton();
//        add(j1);
//
//        j2 = new JButton("Display here whatsUp from the student in UPPER Panel");
//        add(j2);
//
//        JButton j3 = new JButton("===>>>>You CANNOT create a student here <======");
//        add(j3);
//
//        j4 = new JButton("It has to be the student from the UPPER Panel");
//        add(j4);

//    
//    GridLayout grid = new GridLayout(2,1);
//    setLayout(grid);
    //try commenting the two lines above to run the lab without a layout
    setBackground(Color.yellow);
    student st1 = new student("Paul", "Witt", 33);   
    CenterPanel centerP = new CenterPanel(st1);
    TopPanel topP = new TopPanel(st1);
    add(topP, "North");
    add(centerP, "South");
    
    
}
}

