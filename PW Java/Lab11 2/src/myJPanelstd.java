import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class myJPanelstd extends JPanel implements MouseMotionListener
{
    JButton bx,by, bmessage;
    JPanel p1;
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
		p1.add(labelx);
		p1.add(bx);
		p1.add(labely);
		p1.add(by);
		p1.add(bmessage);
		add(p1,"South");
//----------------------------------------------------------------
        addMouseMotionListener(this);
	}
//-------------------------------------------------------------------
    public void mouseMoved(MouseEvent evt)
    {
    	Point pt = evt.getPoint();
    	String sx = "x = " + pt.getX();
        bx.setText(sx);
    	String sy = "y = " + pt.getY();
        by.setText(sy);
        bmessage.setText("you are doing fine");
    }
    public void mouseDragged(MouseEvent evt)
    {
    	bmessage.setText("would you stop dragging the mouse, please");
    }

}
