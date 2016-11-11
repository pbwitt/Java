import java.awt.*;
import javax.swing.*;
public class CenterPanel extends JPanel
{

public CenterPanel (student st1)
   {
    super ();
            setBackground(Color.pink);
            JButton jb1 = new JButton(st1.whatsUp()); 
            JButton jb2 = new JButton(st1.whatsUp()); 
            JButton jb3 = new JButton(st1.whatsUp()); 
            JButton jb4 = new JButton(st1.whatsUp());
            JButton jb5 = new JButton(st1.whatsUp()); 
            JButton jb6 = new JButton(st1.whatsUp());
            JButton jb7 = new JButton(st1.whatsUp()); 
            JButton jb8 = new JButton(st1.whatsUp());
            JButton jb9 = new JButton(st1.whatsUp()); 
            JButton jb10 = new JButton(st1.whatsUp());
            JButton jb11 = new JButton(st1.whatsUp()); 
            JButton jb12 = new JButton(st1.whatsUp()); 
            JButton jb13 = new JButton(st1.whatsUp()); 
            JButton jb14 = new JButton(st1.whatsUp());
            JButton jb15 = new JButton(st1.whatsUp()); 
            JButton jb16 = new JButton(st1.whatsUp());
            JButton jb17 = new JButton(st1.whatsUp()); 
            JButton jb18 = new JButton(st1.whatsUp());
            JButton jb19 = new JButton(st1.whatsUp()); 
            JButton jb20 = new JButton(st1.whatsUp());
            
            
            
            add(jb1); 
            add(jb2); 
            add(jb3); 
            add(jb4); 
            add(jb5); 
            add(jb6); 
            add(jb7); 
            add(jb8); 
            add(jb9); 
            add(jb10); 
            add(jb11); 
            add(jb12); 
            add(jb13); 
            add(jb14); 
            add(jb15); 
            add(jb16);
            add(jb17); 
            add(jb18); 
            add(jb19); 
            add(jb20);
     
            
             
            
        setLayout(new GridLayout(37,1));
        
    }
    public void setText(String text) {
//        j2.setText(text);
    }
}

