import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class myJPanel1 extends JPanel implements ChangeListener, ActionListener
{
	
        JButton b2,jb2,b1,jb3,jb4, b5;
        JTextField tft1, tft2, tft3,tft4,tft5;
        JSlider js1; 
        myJPanel2 mjp2;
        student st2;
        String title = "Simple Name App"; 
          
        static final int FPS_MIN = 0;
        static final int FPS_MAX = 100;
        static final int FPS_INIT = 25; 

	public myJPanel1(myJPanel2 panel)
	{
            super();
            
            setLayout(new GridLayout(15,30));
           
                mjp2 = panel; 
		setBackground(Color.blue);
                tft1 = new JTextField(10);
                tft1.setBorder(BorderFactory.createTitledBorder("Enter First Name Below"));
                tft1.addActionListener(this); 		 
                
                tft2 = new JTextField(10);
                tft2.setBorder(BorderFactory.createTitledBorder("Enter Last Name Below"));
                tft2.addActionListener(this); 		 

                jb2 = mjp2.b2;               
                st2 = mjp2.st1; 
                jb3 = mjp2.b3; 
              

                js1 = new JSlider(JSlider.HORIZONTAL, FPS_MIN,FPS_MAX,FPS_INIT);
                js1.setBorder(BorderFactory.createTitledBorder("Add Age By Sliding"));
                js1.setMajorTickSpacing(25);
                js1.setMinorTickSpacing(1);
                js1.setPaintTicks(true);
                js1.setPaintLabels(true);       
                js1.addChangeListener(this);    
                
                
                tft3 = new JTextField(10); 
                tft3.setBorder(BorderFactory.createTitledBorder("Age Displays Below"));
                tft4 = new JTextField("Simple Name Application \n"  ); 
                
                tft4.setBackground(Color.yellow);
                tft5 = new JTextField("Paul Witt  IST 240" ); 
                tft5.setBackground(Color.yellow);

                b1 = new JButton("Click Here To See Name and Age to the Right");
                b1.addActionListener(this); 
                
                
                b5 = new JButton("Pictures availible for last names 'Trump', 'Clinton', and 'Sanders'");
                
                add(tft4);
                add(tft5); 
                add(tft1);
                add(tft2);
                add(js1);       
                add(tft3);          
                add(b1);
                add(b5);
                
//
		}
   
    public void actionPerformed(ActionEvent event) 
    {
       	 Object obj = event.getSource();       
//=====================================
         
         ImageIcon p1 = new ImageIcon("images/Trump.jpg");
         ImageIcon p2 = new ImageIcon("images/Clinton_1.jpg");
         ImageIcon p3 = new ImageIcon("images/Sanders.jpg");
         
     	 if (obj == b1){
              st2.firstName = tft1.getText();
              st2.lastName = tft2.getText(); 
              jb2.setText(st2.firstName+ " "+ st2.lastName + " " + js1.getValue() );   
           
              }
              if (tft2.getText().equals("Trump")){
                  jb3.setIcon(p1);}               
              if (tft2.getText().equals("Clinton")){
                 jb3.setIcon(p2); }    
              if (tft2.getText().equals("Sanders")){
                 jb3.setIcon(p3);}  

              else{
                  remove(jb3); 
              }  
    }
 
    public void stateChanged(ChangeEvent e){
        Object obj = e.getSource();  
        if (obj==js1){
            int count = js1.getValue(); 
            tft3.setText(Integer.toString(count)); }
   
   }
}