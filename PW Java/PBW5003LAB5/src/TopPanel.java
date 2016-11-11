import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TopPanel extends JPanel implements ActionListener 
{
    JButton jb1 = new JButton(); 

    
    
    public TopPanel (student st1)
   {
    super ();
    
    BorderLayout border = new BorderLayout(1,1);
    setBackground(Color.yellow);
//setLayout(border);
           JButton jb1 = new JButton(st1.getInfo()); 
           add(jb1,"Center"); 
            jb1.addActionListener(this); 
            

    }
    public void actionPerformed(ActionEvent Event) {
        Object obj = Event.getSource();
             

//        if (obj == jb1) 
//        {
//            jb2.setText("Test");
//        }
    }  

  
}