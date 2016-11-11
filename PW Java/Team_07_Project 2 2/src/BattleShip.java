
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
    int twoButton[] = null;
    int threeButton[] = null;
    int fourButton[] = null;
    int fiveButton[] = null;
    
    public BattleShip()
    {
    
    }          
    public int [] TwoButtonShip()
    {
            
            int direction = this.Direction();
            
            JButton[] buttons = new JButton[100];
            int myRandomNumber1 = 0;
            //for(int i = 0; i < 2; i++)
            //{
            double r = Math.random();
            int myRandomNumber =(int)(r*100.0);
            
            switch(direction)
            {
                case 0:
                    if (myRandomNumber/10 == 0)
                    {
                        myRandomNumber1 = myRandomNumber - 10; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 10; 
                    }
                break;
                
                case 1:
                    if (myRandomNumber/10 == 9)
                    {
                        myRandomNumber1 = myRandomNumber + 10; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber - 10; 
                    }
                break;
                    
                case 2:
                    if (myRandomNumber%10 == 9)
                    {
                        myRandomNumber1 = myRandomNumber - 1; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 1; 
                    }
                break;    
                    
            }

            
            int twoButton[]= {myRandomNumber,myRandomNumber1};
            //retButton [i]= new Random().nextInt(buttons.length);
//             int randomPart = (buttons[retButton]);
            System.out.println(direction);
            System.out.println(twoButton[0]);
            System.out.println(twoButton[1]);

            
            //}
            return twoButton; 
    }    
    
        public int [] ThreeButtonShip()
    {
            
            int direction = this.Direction();
            
            JButton[] buttons = new JButton[100];
            int myRandomNumber1 = 0, myRandomNumber2 = 0;
            //for(int i = 0; i < 2; i++)
            //{
            double r = Math.random();
            int myRandomNumber =(int)(r*100.0);
            
            switch(direction)
            {
                case 0:
                    if (myRandomNumber/10 <= 1)
                    {
                        myRandomNumber1 = myRandomNumber - 10;
                        myRandomNumber2 = myRandomNumber1 - 10;
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 10;
                        myRandomNumber2 = myRandomNumber1 + 10; 
                    }
                break;
                
                case 1:
                    if (myRandomNumber/10 >= 8)
                    {
                        myRandomNumber1 = myRandomNumber + 10;
                        myRandomNumber2 = myRandomNumber1 + 10;  
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber - 10;
                        myRandomNumber2 = myRandomNumber1 - 10;
                    }
                break;
                    
                case 2:
                    if (myRandomNumber%10 >= 8)
                    {
                        myRandomNumber1 = myRandomNumber - 1;
                        myRandomNumber2 = myRandomNumber1 - 1; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 1;
                        myRandomNumber2 = myRandomNumber1 + 1; 
                    }
                break;    
                    
            }

            
            int threeButton[]= {myRandomNumber,myRandomNumber1,myRandomNumber2};
            //retButton [i]= new Random().nextInt(buttons.length);
//             int randomPart = (buttons[retButton]);
            System.out.println(direction);
            System.out.println(threeButton[0]);
            System.out.println(threeButton[1]);
            System.out.println(threeButton[2]);

            
            //}
            return threeButton; 
    } 
    
    // deciding the direciton of the ship
    // 0 = up; 1 = down = 2 = right
    public int Direction()
    {
        double r = Math.random();
        int direction = (int) ((r*3.0));
                
        return direction;
    }
    
}
             

