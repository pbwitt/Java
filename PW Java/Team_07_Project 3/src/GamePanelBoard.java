
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;


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
        JButton[] buttons = new JButton[121];
        String[] letters = { "A", "B", "C", "D","E", "F", "G", "H", "I", "J"};
        int battle1Location,  battle2Location, battle3Location, battle4Location; 
      
	public GamePanelBoard()
	{

        //Create new battleships and set locations
           BattleShip B1 = new BattleShip();
           battle1Location = B1.randButton(); 
           BattleShip B2 = new BattleShip(); 
           battle2Location = B2.randButton(); 
           BattleShip B3 = new BattleShip(); 
           battle3Location = B3.randButton(); 
           BattleShip B4 = new BattleShip(); 
           battle4Location =B4.randButton(); 
           
       //Set Layout to get the buttons 10 by 10
          setLayout(new GridLayout(0,11));
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
//ActionListener Method that 
        public void actionPerformed(ActionEvent e) {
    // press the button
        System.out.println(e.getActionCommand()); 
        JButton btn=(JButton)e.getSource();
        System.out.println(btn.getName());  // use name or action command in if statment
     
    //Logic for htting BattleShips
       if(btn == buttons[battle1Location])
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
         System.out.println(battle4Location);
        } 

    
    
}
