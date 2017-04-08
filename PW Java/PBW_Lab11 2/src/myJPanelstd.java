import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pbw5003
 */
public class myJPanelstd extends JPanel implements MouseMotionListener, ActionListener, ChangeListener
{
    JButton bx,by, bmessage;
    JPanel p1;
    Point[] ps = new Point[1000];
    Point[] pt, p;  
    Graphics gg; 
    int i = 0; 
    int s1 = 15; 
    int s2 = 15; 
    JSlider js1;
    	static final int FPS_MIN = 0;
        static final int FPS_MAX = 30; 
        static final int FPS_INIT = 15; 
        
      
 
    
	public myJPanelstd()
	{
		setBackground(Color.pink);
		setLayout(new BorderLayout());
		p1 = new JPanel();
		p1.setLayout(new GridLayout(3,3));
		JLabel labelx = new JLabel("X:");
		JLabel labely = new JLabel("Y:");
		bx = new JButton();
		by = new JButton();
		bmessage = new JButton();
//		p1.add(labelx);
		p1.add(bx);
//		p1.add(labely);
		p1.add(by);
		p1.add(bmessage);
              
		add(p1,"South");  
                
                
                 js1 = new JSlider(JSlider.HORIZONTAL, FPS_MIN,FPS_MAX, FPS_INIT);
                js1.setBorder(BorderFactory.createTitledBorder("Increase Line Thickness"));
//                js1.setMajorTickSpacing(250);
//                js1.setMinorTickSpacing(10);
                js1.setPaintTicks(true);
                js1.setPaintLabels(true);       
                js1.addChangeListener(this);  
                  p1.add(js1);
                
//----------------------------------------------------------------
        addMouseMotionListener(this);
        
        
        

	}

 public void paintComponent (Graphics g)
        {
            super.paintComponent(g); 
        
            for (int j=0; j<i; j++)
            {
               
                g.fillRect((int) ps[j].x,ps[j].y, 5, 5);
    
            }
        }
//-------------------------------------------------------------------
    public void mouseMoved(MouseEvent evt)
    {
   
    }
//    
    public void mouseDragged(MouseEvent evt)
    {
       Point pt = evt.getPoint();
       
       
       String sx = "x = " + pt.getX(); 
       bx.setText(sx);
       
       String sy = "y = " + pt.getY(); 
       by.setText(sy); 
       Graphics gg = getGraphics(); 
       gg.fillRect((int) pt.getX(), (int)pt.getY(), s1, s1); 
       ps[i++]=pt; 
//       bmessage.setText("Change To Red");

    }
    
      public void actionPerformed(ActionEvent event) 
    {       
        	 Object obj = event.getSource();
//=====================================
     	 if (obj == bmessage){    
             String clr = Integer.toString(s1);
             

         }    
         
         
     }
      
      
      public void stateChanged(ChangeEvent e){
        Object obj = e.getSource();  
       if (obj == js1)
		{
//			int delayfast = tim.getDelay();
			s1 = js1.getValue(); 
                       	
		}

       }
      
      
      
}
