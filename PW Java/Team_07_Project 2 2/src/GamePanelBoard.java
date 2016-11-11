
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinhertzog
 */
public class GamePanelBoard extends JPanel implements ActionListener
{
    //Create Global Vaiables JButton Array, Letters, battleship locations, an
        JButton[] buttons = new JButton[100];
        String[] letters = { "A", "B", "C", "D","E", "F", "G", "H", "I", "J"};
        String[] numbers = { "1", "2", "3", "4","5", "6", "7", "8", "9", "10"};
        //int battle1Location,  battle2Location, battle3Location, battle4Location; 
        int [] twoButtonShip, threeButtonShip;
        //Integer [] B1;
        JButton [] jbLetters = new JButton[10];
        JButton [] jbNumbers = new JButton[10];
        
	public GamePanelBoard()
	{

        //Create new battleships and set locations
           BattleShip jb2ButtonShip = new BattleShip();
           twoButtonShip = jb2ButtonShip.TwoButtonShip();
           System.out.println(twoButtonShip[0] + " " + twoButtonShip[1]);
           BattleShip jb3ButtonShip = new BattleShip();
           threeButtonShip = jb3ButtonShip.ThreeButtonShip();
           System.out.println(threeButtonShip[0] + " " + threeButtonShip[1]+ " " + threeButtonShip[2]);
           //battle1Location[] = B1.randButton(); 
          // BattleShip B2 = new BattleShip(); 
          // battle2Location = B2.randButton(); 
          // BattleShip B3 = new BattleShip(); 
           //battle3Location = B3.randButton(); 
           //BattleShip B4 = new BattleShip(); 
           //battle4Location =B4.randButton(); 
           
       //Set Layout to get the buttons 10 by 10
          //setLayout(new GridLayout(0,11));
          
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
          for(int i = 0; i < jbNumbers.length; i++)
          {
              Integer x = 70, y = 5;
              
              jbNumbers[i] = new JButton();
              jbNumbers[i].setText(numbers[i]);
              jbNumbers[i].setBounds(x+ (i*65) ,5, 60, 60);
              add(jbNumbers[i]);       
          } 
          // set all letter buttons on border
          for(int i = 0; i < jbLetters.length; i++)
          {
              Integer x = 5, y = 70;
              
              jbLetters[i] = new JButton();
              jbLetters[i].setText(letters[i]);
              jbLetters[i].setBounds(x, y+ (i*65), 60, 60);
              add(jbLetters[i]);       
          } 
          
        // set all active buttons
         for(int j = 0; j < 10; j++) 
         {    
         for(int i = 0; i < 10; i++)
         {
             Integer x = 70, y = 70;
              buttons[i +(j*10)]  = new JButton();
              buttons[i+(j*10)].addActionListener(this);// assign action listener 
              add(buttons[i+(j*10)]);

              buttons[i+(j*10)].setBounds(x + (i*65), y + (j * 65), 60, 60);
         }  
         }
        }
      /*   
      //For Loop that creates the buttons on the panel
        for(int i = 0; i < buttons.length; i++)
             {
        // make new button name 
        buttons[i]  = new JButton();
        buttons[i].addActionListener(this);// assign action listener 
        // add button to panel
        add(buttons[i]);
        //Sets the panel at 0,0 to Dark Blue  - it is not needed in the game
        //As of now, user will need to press a button to assign the ships.  Once assigned, the ships stay there until the program is closed. 
          buttons[0].setBackground(Color.blue);
          buttons[0].setText("Press to Assign Ships" );
          buttons[0].setForeground(Color.white);

            }    
        //For Loop to assign the column and row headings
       for(int i = 0; i < 10; i++)
          {
        // make new button name 
           buttons[i+1].setText(Integer.toString(i+1));
           String[] letters = { "A", "B", "C", "D","E", "F", "G", "H", "I", "J"};
           buttons[(i+1)*11].setText(letters[i]); 
          }

         }
              */
        public void Sound() throws UnsupportedAudioFileException, LineUnavailableException
        {
            File bombFile = new File("music/bomb.wav");
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(bombFile);
                AudioFormat format = audioStream.getFormat();
                DataLine.Info info = new DataLine.Info(Clip.class, format);
                Clip audioClip = (Clip)AudioSystem.getLine(info);
                
                audioClip.open(audioStream);
                audioClip.start();
                
            } catch (IOException ex) {
                Logger.getLogger(GamePanelBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

          
//ActionListener Method that 
        public void actionPerformed(ActionEvent e) 
        {
    // press the button
        System.out.println(e.getActionCommand()); 
        JButton btn=(JButton)e.getSource();
        System.out.println(btn.getName());  // use name or action command in if statment
        for (int a = 0; a < 2 ; a++)
        {
        if (btn == buttons [twoButtonShip[a]])
        {
            buttons[twoButtonShip[a]].setText(" HIT B1!");
            
            try 
            {   
                this.Sound();
            } 
            catch (UnsupportedAudioFileException ex) 
            { 
                System.out.println("the specified Audio file is not supported!");
                ex.printStackTrace();
            } 
            catch (LineUnavailableException ex) 
            { 
                System.out.println("audio line for playback is not available!");
                ex.printStackTrace();
            }
        }
        }
        
            for (int a = 0; a < 3 ; a++)
        {
        if (btn == buttons [threeButtonShip[a]])
        {
            buttons[threeButtonShip[a]].setText(" HIT B1!");
            
            try 
            {   
                this.Sound();
            } 
            catch (UnsupportedAudioFileException ex) 
            { 
                System.out.println("the specified Audio file is not supported!");
                ex.printStackTrace();
            } 
            catch (LineUnavailableException ex) 
            { 
                System.out.println("audio line for playback is not available!");
                ex.printStackTrace();
            }
        }
        }
        /*
         if (btn == buttons [twoButtonShip[1]])
        {
            buttons[twoButtonShip[1]].setText(" HIT B1!");
            try {   
            this.Sound();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GamePanelBoard.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GamePanelBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
         */
         /* NOTES FOR ARRAY OF SHIPS
         GET THE NUMBER OF SHIPS, THEN YOU CAN RUN LOOP WHICH WOULD CHECK EACH SHIP
         POSSIBLY CHANGE THE BATTLESHIP TO DO ALL THE SHIP WORK AND PASS BACK
         2 BUTTON SHIP, 3 BUTTON SHIP, 4 BUTTON SHIP, 5 BUTTON SHIP
         */
    //Logic for htting BattleShips
      /* if(btn == buttons[battle1Location])
         buttons[battle1Location].setText(" HIT B1!");
       if(btn == buttons[battle2Location])
         buttons[battle2Location].setText(" HIT B2!");
       if(btn == buttons[battle3Location])
         buttons[battle3Location].setText(" HIT B3!");
       if(btn == buttons[battle4Location])
        buttons[battle4Location].setText(" HIT B4!");
      
      
      //Shows the Battleship Locations. 
         System.out.println(battle1Location);
         System.out.println(battle2Location);
         System.out.println(battle3Location);
         System.out.println(battle4Location);*/
        } 
          
    
    
}
