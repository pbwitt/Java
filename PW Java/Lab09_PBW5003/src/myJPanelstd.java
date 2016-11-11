import java.awt.*;
import javax.swing.*;
public class myJPanelstd extends JPanel 
{
     
    JButton jb2; 

	public myJPanelstd()
	{
            super();
            
         ImageIcon p1 = new ImageIcon("images/st1.jpg");
         ImageIcon p2 = new ImageIcon("images/st2.jpg");
     
         
            setBackground(Color.white);
          
             student st1 = new student("Paul", "Witt", 33);
             student st2 = new student("Jane", "Doe", 33); 
             
             
             
             add(st1);
             st1.setBackground(Color.blue); 
             st1.setForeground(Color.white);
             st1.setFont(new Font("Arial", Font.PLAIN, 20));
             st1.setText(st1.getMessage());
             st1.setIcon(p1); 
             
             
             add(st2); 
             st2.setBackground(Color.blue);
             st2.setText(st2.getInfo());
             st2.setIcon(p2);
             
   
            
                
                
                
	}
}
