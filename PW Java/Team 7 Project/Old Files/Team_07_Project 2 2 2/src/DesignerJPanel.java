import java.awt.*;
import javax.swing.*;



public class DesignerJPanel extends JPanel
{
        JTextArea textArea;
        
        DesignerJPanel()
        {
        super();
        setBackground(new Color(224, 224, 224));
        setLayout(null);    
   
       ImageIcon imageMatt = new ImageIcon("images/matt.jpg");
       Image img = imageMatt.getImage();
       Image newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
       imageMatt = new ImageIcon(newimg);
       
       ImageIcon imageKevin = new ImageIcon("images/kevin.jpg");
       Image img1 = imageKevin.getImage();
       Image newimg1 = img1.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
       imageKevin = new ImageIcon(newimg1);
       
       ImageIcon imagePaul = new ImageIcon("images/paul.jpg");
       Image img2 = imagePaul.getImage();
       Image newimg2 = img2.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
       imagePaul = new ImageIcon(newimg2);
       
       
       JButton jbK = new JButton(); 
       add(jbK);
       jbK.setBounds(25,50,100,100);
       jbK.setIcon(imageKevin);
       jbK.setBorderPainted(true);
       
       JLabel jlKevin = new JLabel("Kevin Hertzog");
       jlKevin.setBounds(25,160,100,25);
       add(jlKevin);
       
       JButton jbM = new JButton(); 
       add(jbM);
       jbM.setBounds(200,175,100,100);
       jbM.setIcon(imageMatt);
       jbM.setBorderPainted(true);
       
       JLabel jlMatt = new JLabel("Matt Pastor");
       jlMatt.setBounds(200,280,100,25);
       add(jlMatt);
       
       JButton jbP = new JButton(); 
       add(jbP);
       jbP.setBounds(400,275,100,100);
       jbP.setIcon(imagePaul);
       jbP.setBorderPainted(true);
       
       JLabel jlPaul = new JLabel("Paul Witt");
       jlPaul.setBounds(400,375,100,25);
       add(jlPaul);
       
       
       JLabel jlDesigners = new JLabel("Game's Designers");
       jlDesigners.setBounds(200, 100, 400, 50);
       jlDesigners.setFont(new Font("Papyrus", Font.BOLD, 44));
       jlDesigners.setBackground(Color.red);
       add(jlDesigners);
        
       }
}
