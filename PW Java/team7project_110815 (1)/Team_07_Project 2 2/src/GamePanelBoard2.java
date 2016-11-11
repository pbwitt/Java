
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.applet.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.AudioStream;
import static sun.net.www.http.HttpClient.New;


public class GamePanelBoard2 extends JPanel implements ActionListener
{
    JButton[] playerButtons = new JButton[100];
    JButton [] jbPlayerLetters = new JButton[10];
    JButton [] jbPlayerNumbers = new JButton[10];
    String[] playerLetters = { "A", "B", "C", "D","E", "F", "G", "H", "I", "J"};
    String[] playerNumbers = { "1", "2", "3", "4","5", "6", "7", "8", "9", "10"};
    int playerShips = 0;
    Boolean start = false;
    
    int [][] playerTwoButtonShip = new int [2][2]; //playerThreeButtonShip, playerFourButtonShip, playerFiveButtonShip;
    
    public GamePanelBoard2()
    {
        
          setLayout(null);
          
          // add blank button in corner - possibly to start play and use as counter
          JButton jbPlay = new JButton();
          add (jbPlay);
          jbPlay.setBounds(5, 5, 60, 60);
          jbPlay.setText("<html>Push <br>to Play</html>");
          jbPlay.setOpaque(true);
          jbPlay.setBackground(Color.BLUE);
          jbPlay.addActionListener(this);
          
          // set all number buttons on border
          for(int i = 0; i < jbPlayerNumbers.length; i++)
          {
              Integer x = 70, y = 5;
              
              jbPlayerNumbers[i] = new JButton();
              jbPlayerNumbers[i].setText(playerNumbers[i]);
              jbPlayerNumbers[i].setBounds(x+ (i*65) ,5, 60, 60);
              add(jbPlayerNumbers[i]);       
          } 
          // set all letter buttons on border
          for(int i = 0; i < jbPlayerLetters.length; i++)
          {
              Integer x = 5, y = 70;
              
              jbPlayerLetters[i] = new JButton();
              jbPlayerLetters[i].setText(playerLetters[i]);
              jbPlayerLetters[i].setBounds(x, y+ (i*65), 60, 60);
              add(jbPlayerLetters[i]);       
          } 
        
       ImageIcon imageLion = new ImageIcon("images/battleship.jpg");
       Image img = imageLion.getImage();
       Image newimg = img.getScaledInstance(35, 35,  java.awt.Image.SCALE_SMOOTH);
       imageLion = new ImageIcon(newimg);
       
         for(int j = 0; j < 10; j++) 
         {    
         for(int i = 0; i < 10; i++)
         {
             Integer x = 70, y = 70;
              playerButtons[i +(j*10)]  = new JButton();
              playerButtons[i+(j*10)].addActionListener(this);// assign action listener 
              add(playerButtons[i+(j*10)]);

              playerButtons[i+(j*10)].setBounds(x + (i*65), y + (j * 65), 60, 60);
              playerButtons[i+(j*10)].setIcon(imageLion);
         }  
         }
         
         //for (playerShips = 0; playerShips < 14;)
         {
               String infoMessage = "Please pick your ship placement:";
               String titleBar = "Player's Ships";
               JOptionPane.showMessageDialog(this, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
               
               
               
               
         }
    }
    

    
    public void actionPerformed(ActionEvent e) 
        {
         //JButton [][]playerTwoButtonShip = new JButton [2][2];
        //JButton btn=(JButton)e.getSource();
        Object ship = e.getSource();
        System.out.println(ship);
        
        if (start == true)
        {
            System.out.println("in the start = true");
            if (ship == playerButtons [playerTwoButtonShip[0][0]])
        {
            playerButtons [playerTwoButtonShip[0][0]].setText(" HIT B1!");
            playerButtons [playerTwoButtonShip[0][0]].setIcon(null);
            playerButtons [playerTwoButtonShip[0][0]].removeActionListener(this);
        } 
        }
        
        else
        {    
        for (int i = 0; i < 100; i++ )
        {
            if (ship == playerButtons[i])
            {
                
                //if(playerShips< 14)
                //{
                   playerTwoButtonShip[0][0] = i; 
                   System.out.println(playerTwoButtonShip[0][0] + " in the setting human ship");
                   start = true;
                //}
            }
            
        }
        }

        
    }
}
