import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanelTimer extends JPanel implements ActionListener
{
	JTextArea message = new JTextArea("Time intervals will be shown here");
	JButton start, stop, faster, slower;
	Timer tim;
	int limit = 0;
	int delay = 0;
	int i = 0;

	public myJPanelTimer ()
	{
		super ();
//------------------------------------------------------
// Create components: Jpanel, JButton
//------------------------------------------------------
		setLayout(new GridLayout(5,1));
		start = new JButton("start");
		stop = new JButton("stop");
		faster = new JButton("faster");
		slower = new JButton("slower");

    	start.addActionListener(this); 	
    	add(start);
    	stop.addActionListener(this); 	
    	add(stop);
    	faster.addActionListener(this); 	
    	add(faster);
    	slower.addActionListener(this); 	
    	add(slower);
    	
    	add(message);
//------TIMER -------------------------------------------
  		delay = 1000; //milliseconds
  		tim = new Timer(delay, this);// the word 'this' here means that the action listener
  									 // that the timer needs is this very same class 'myJPanelTimer
  									 // This way the action performed method is called every time the timer ticks. 		
//------TIMER -------------------------------------------
  }
	
//-------------------------------------------------------------------
// actionPerformed
    public void actionPerformed(ActionEvent event) 
    {

       	Object obj = event.getSource();
       	String choice = event.getActionCommand();
		if (obj == stop){tim.stop();}
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
			i = i+1;
			message.setText("counting ... "+i);
		}

	}	







}
