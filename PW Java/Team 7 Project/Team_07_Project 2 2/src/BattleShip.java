
import java.util.Random;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
public class BattleShip extends JButton

{
    
public BattleShip(){
     
}          
             public int randButton()
         {
             JButton[] buttons = new JButton[121];
             int retButton= new Random().nextInt(buttons.length);
//             int randomPart = (buttons[retButton]);
             
             return retButton; 

         }       
             
}
