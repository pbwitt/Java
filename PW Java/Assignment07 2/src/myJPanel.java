import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanel extends JPanel implements ActionListener
{

    JButton b1, b2, b3, b4,b; 
    student st1; 
    myJPanel2 mjp2; 
	public myJPanel()
	{
               
            super();
               
                
		setBackground(Color.gray);
		setLayout(new BorderLayout());
		myJPanel1 p1 = new myJPanel1();

//              b4 = mjp2.b2; 
		myJPanel2 p2 = new myJPanel2();
                b4 = p2.b2;
                b3 = p1.b1;
                
                b3.addActionListener(this);
                

		add(p1,"North");
		add(p2,"Center");
     
	}
	
        public void actionPerformed(ActionEvent event) 
    {
       	 Object obj = event.getSource();
        
         student st1 = new student("Paul", "Witt", 21);
//=====================================
     	 if (obj == b3){
             b3.setText(st1.firstName); 
             b4.setText(st1.whatsUp());
        
         }

    }
        
        
        
}