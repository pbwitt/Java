import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class InstructionJPanel extends JPanel
{
    
    InstructionJPanel()
    {
      
        
        
       super();
       setBackground(new Color(224, 224, 224));
       setLayout(null);
       
       
       Border thickBorder = new LineBorder(Color.BLACK, 3);
        
       JButton j12 = new JButton(); 
       j12.setText("panel under construction");
       add(j12);
       j12.setBorder(thickBorder);
       j12.setBounds(0,250,640,30);
       //j12.setVisible(true);
       j12.setFont(new Font("Arial", Font.PLAIN, 20));
       

       
    }
}