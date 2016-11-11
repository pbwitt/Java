/*
 * Paul Witt  Lab O6 
IST240
Septerber 27, 2015
 */

/**
 *
 * @author pbw5003
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet; 

public class myJPanel1 extends JPanel  implements ActionListener
{
	myJButton jl1;
        student st1;   
        JButton jb1; 

  
	public myJPanel1()
	{
             GridLayout grid = new GridLayout(1,1,3,4);
             setLayout(grid);
             setBackground(Color.orange);
             
                st1 = new student("Fred","Fonseca",44);		
		jl1 = new myJButton(st1.getInfo());
                jl1.addActionListener(this);
		add(jl1, "North");                  
                setLayout(grid);            
                jb1 = new JButton (); 
                jb1.addActionListener(this);               
                add(jb1);  

	}
//=====================================
    public void actionPerformed(ActionEvent event) 
    {
       	
        Object obj = event.getSource();
 
//=====================================
     	 if (obj == jl1){
             
             ImageIcon owlReading = new ImageIcon("L6Images/reading.jpg");
             ImageIcon searching = new ImageIcon("L6Images/searching.jpg");
             ImageIcon listening = new ImageIcon("L6Images/listening.jpg");
    
            String activity = st1.whatsUp();
           
         if( activity.equals("doing Java")){
                jb1.setText(activity);
                jb1.setIcon(owlReading); 

         }
 
         else  if(activity.equals("searching the web")){
                jb1.setText(activity);
                jb1.setIcon(searching); 
               }    
         else  if(activity.equals("Listening to endless lecture")){
                jb1.setText(activity);
                jb1.setIcon(listening); 
                        }    
         }

    }
 

}

