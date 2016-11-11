import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class myJPanelstd extends JPanel implements  ActionListener,ChangeListener
{
	JButton b1,b2, b3, b4, b5, b6;
        myJPanelTimer mjp;
        int i, i2, i3= 0;
        student st1; 
        Timer tim;
        JSlider js1; 
       
        JTextArea message = new JTextArea("Time intervals will be shown here");
	JButton start, stop, faster, slower;
	int limit = 0;
	int delay = 0;
        
	static final int FPS_MIN = 2000;
        static final int FPS_MAX = 0; 
        static final int FPS_INIT = 10; 

        
	public myJPanelstd()
	{
           mjp = new myJPanelTimer();
           student st1 = new student("Paul", "Witt", 33);
           ImageIcon p1 = new ImageIcon("images/st3.jpg");
     
    	
    	   b3 = new JButton("Score Here");
    	   b4 = new JButton("here I  am");
    	   b5 = new JButton("bye");
           b6 = new JButton(); 
        
          start = new JButton("Launch Student");
          stop = new JButton("stop");
          faster = new JButton("faster");
          slower = new JButton("slower");
          add(message);

//------------------------------------------------------
// Choose a Layout for JPanel and 
// add components to Jpanel according to layout    	
//----------------------------------------------------------------
    	setLayout(null); // you need a null layout for the panel
    	                 // in order to place the components
    	                 // anywhere you want
//----------------------------------------------------------------

//                b2.addActionListener(this);
		add(b3);
                add(st1);
                add(b6); 
                st1.setIcon(p1); 
                st1.addActionListener(this);
     
            js1 = new JSlider(JSlider.HORIZONTAL, FPS_MAX,FPS_MIN, FPS_INIT);
                js1.setBorder(BorderFactory.createTitledBorder("Student Speed:  Fast to Slow"));
//                js1.setMajorTickSpacing(250);
//                js1.setMinorTickSpacing(10);
                js1.setPaintTicks(true);
                js1.setPaintLabels(true);       
                js1.addChangeListener(this); 

                start.addActionListener(this); 	  
                add(start);
                stop.addActionListener(this); 	
                add(stop);
                faster.addActionListener(this); 	
                add(faster);
                slower.addActionListener(this); 	
                add(slower);
                add(js1); 

//------------Placing------------------------------------
                    // x,y, length, height)
	
		b3.setBounds(new Rectangle(0,100 ,200,50)); 
                faster.setBounds(new Rectangle(100,0,100,50));
                slower.setBounds(new Rectangle(200,0,100,50));
                stop.setBounds(new Rectangle(300,0,100,50));
                js1.setBounds(500,0,1000,50);

                start.setBounds(new Rectangle(100,200,300,50));
                message.setBounds(new Rectangle(500,50,100,100));
		b5.setBounds(new Rectangle(1700,500,100,75)); 
                
                b6 = st1; 
	
////------TIMER -------------------------------------------
  		delay = 0; //milliseconds
  		tim = new Timer(delay, this);
       
        }
    
        public void actionPerformed(ActionEvent event) 
    {
       	 Object obj = event.getSource();
        
//=====================================
     	 if (obj == b6){         
          i3 = i3+1;       
       
         b3.setText("Total Score "+i3); 
         
         }

         if (obj == stop ){tim.stop(); 
    
         }
		if (obj == start){tim.start();}
		if (obj == faster)
		{
			int delayfast = tim.getDelay();
			delayfast = (int) ( (float)delayfast *(.9f) );
			tim.setDelay(delayfast);
		}
		if (obj == slower)
		{
			int delayfast = tim.getDelay();
			delayfast = (int) ( (float)delayfast *(1.1f) );
			tim.setDelay(delayfast);
		}
//============================================================		
// every tick of the timer clock will call
		if (obj == tim)                                      
		{  
                  double r = Math.random();
	          i = (int) (r*1800f);
                  i2 = (int)(r*900); 
		  message.setText(""+i);                  
                  b6.setBounds(i,i2,200,200);
                                  
		}       

     }

        
       public void stateChanged(ChangeEvent e){
        Object obj = e.getSource();  
       if (obj == js1)
		{
//			int delayfast = tim.getDelay();
			int delayfast = js1.getValue(); 
			tim.setDelay(delayfast);
		}

       }
}



       

                
                
                
      
        
        
     
        
        
        
     
        
        

