
import java.util.ArrayList;
import java.util.List;
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
    int twoButton[][] = null;
    int threeButton[][] = null;
    int fourButton[][] = null;
    int fiveButton[][] = null;
    List shipList = new ArrayList();
    
    public BattleShip()
    {
    
    }          
    public int [][] TwoButtonShip()
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
                        myRandomNumber1 = myRandomNumber + 10; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber - 10; 
                    }
                break;
                
                case 1:
                    if (myRandomNumber/10 == 9)
                    {
                        myRandomNumber1 = myRandomNumber - 10; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 10; 
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

            
            //int twoButton[]= {myRandomNumber,myRandomNumber1};
            //int [][]twoButton= new int {{myRandomNumber,0}, {myRandomNumber1,0}};
            int [][] twoButton = new int [2][2];
            twoButton[0][0] = myRandomNumber;
            twoButton[0][1] = 0;
            twoButton[1][0] = myRandomNumber1;
            twoButton[1][1] = 0;

            System.out.println(direction);
            System.out.println(twoButton[0]);
            System.out.println(twoButton[1]);
            Boolean returnSend = false;
            for (int z = 0; z < 2; z++)
            returnSend=this.OverLap (twoButton[z][0], "two");
            
            if (returnSend = true)
            {
            return twoButton; 
            }
            else
            {
            twoButton = null;
            return twoButton;
            }
           
    }    
    
        public int [][] ThreeButtonShip()
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
                        myRandomNumber1 = myRandomNumber + 10;
                        myRandomNumber2 = myRandomNumber1 + 10;
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber - 10;
                        myRandomNumber2 = myRandomNumber1 - 10; 
                    }
                break;
                
                case 1:
                    if (myRandomNumber/10 >= 8)
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

            
            //int threeButton[]= {myRandomNumber,myRandomNumber1,myRandomNumber2};
            
            int [][] threeButton = new int [3][2];
            threeButton[0][0] = myRandomNumber;
            threeButton[0][1] = 0;
            threeButton[1][0] = myRandomNumber1;
            threeButton[1][1] = 0;
            threeButton[2][0] = myRandomNumber2;
            threeButton[2][1] = 0;
            //retButton [i]= new Random().nextInt(buttons.length);
//             int randomPart = (buttons[retButton]);
            System.out.println(direction);
            System.out.println(threeButton[0][0]);
            System.out.println(threeButton[1][0]);
            System.out.println(threeButton[2][0]);
            Boolean returnSend = false;
            for (int z = 0; z < 3; z++)
            returnSend=this.OverLap (threeButton[z][0], "three");
            
            if (returnSend = true)
            {
            return threeButton; 
            }
            else
            {
            threeButton = null;
            return threeButton;
            }
            
    } 
        
        
         public int [][] FourButtonShip()
    {
            
            int direction = this.Direction();
            
            JButton[] buttons = new JButton[100];
            int myRandomNumber1 = 0, myRandomNumber2 = 0, myRandomNumber3 = 0;
            //for(int i = 0; i < 2; i++)
            //{
            double r = Math.random();
            int myRandomNumber =(int)(r*100.0);
            
            switch(direction)
            {
                case 0:
                    if (myRandomNumber/10 <= 2)
                    {
                        myRandomNumber1 = myRandomNumber + 10;
                        myRandomNumber2 = myRandomNumber1 + 10;
                        myRandomNumber3 = myRandomNumber2 + 10;
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber - 10;
                        myRandomNumber2 = myRandomNumber1 - 10;
                        myRandomNumber3 = myRandomNumber2 - 10;
                    }
                break;
                
                case 1:
                    if (myRandomNumber/10 >= 7)
                    {
                        myRandomNumber1 = myRandomNumber - 10;
                        myRandomNumber2 = myRandomNumber1 - 10; 
                        myRandomNumber3 = myRandomNumber2 - 10; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 10;
                        myRandomNumber2 = myRandomNumber1 + 10;
                        myRandomNumber3 = myRandomNumber2 + 10;
                    }
                break;
                    
                case 2:
                    if (myRandomNumber%10 >= 7)
                    {
                        myRandomNumber1 = myRandomNumber - 1;
                        myRandomNumber2 = myRandomNumber1 - 1; 
                        myRandomNumber3 = myRandomNumber2 - 1; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 1;
                        myRandomNumber2 = myRandomNumber1 + 1; 
                        myRandomNumber3 = myRandomNumber2 + 1; 
                    }
                break;    
                    
            }

            
            //int fourButton[]= {myRandomNumber,myRandomNumber1,myRandomNumber2, myRandomNumber3};
            int [][] fourButton = new int [4][2];
            fourButton[0][0] = myRandomNumber;
            fourButton[0][1] = 0;
            fourButton[1][0] = myRandomNumber1;
            fourButton[1][1] = 0;
            fourButton[2][0] = myRandomNumber2;
            fourButton[2][1] = 0;
            fourButton[3][0] = myRandomNumber3;
            fourButton[3][1] = 0;           
            //retButton [i]= new Random().nextInt(buttons.length);
//             int randomPart = (buttons[retButton]);
            System.out.println(direction);
            System.out.println(fourButton[0][0]);
            System.out.println(fourButton[1][0]);
            System.out.println(fourButton[2][0]);
            System.out.println(fourButton[3][0]);
            Boolean returnSend = false;
            for (int z = 0; z < 4; z++)
            returnSend=this.OverLap (fourButton[z][0], "four");
            
            if (returnSend = true)
            {
            return fourButton; 
            }
            else
            {
            fourButton = null;
            return fourButton;
            }
            
    }
    
         
    public int [][] FiveButtonShip()
    {
            
            int direction = this.Direction();
            
            JButton[] buttons = new JButton[100];
            int myRandomNumber1 = 0, myRandomNumber2 = 0, myRandomNumber3 = 0, myRandomNumber4 = 0;
            //for(int i = 0; i < 2; i++)
            //{
            double r = Math.random();
            int myRandomNumber =(int)(r*100.0);
            
            switch(direction)
            {
                case 0:
                    if (myRandomNumber/10 <= 3)
                    {
                        myRandomNumber1 = myRandomNumber + 10;
                        myRandomNumber2 = myRandomNumber1 + 10;
                        myRandomNumber3 = myRandomNumber2 + 10;
                        myRandomNumber4 = myRandomNumber3 + 10;
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber - 10;
                        myRandomNumber2 = myRandomNumber1 - 10;
                        myRandomNumber3 = myRandomNumber2 - 10;
                        myRandomNumber4 = myRandomNumber3 - 10;
                    }
                break;
                
                case 1:
                    if (myRandomNumber/10 >= 6)
                    {
                        myRandomNumber1 = myRandomNumber - 10;
                        myRandomNumber2 = myRandomNumber1 - 10; 
                        myRandomNumber3 = myRandomNumber2 - 10;
                        myRandomNumber4 = myRandomNumber3 - 10;
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 10;
                        myRandomNumber2 = myRandomNumber1 + 10;
                        myRandomNumber3 = myRandomNumber2 + 10;
                        myRandomNumber4 = myRandomNumber3 + 10;
                    }
                break;
                    
                case 2:
                    if (myRandomNumber%10 >= 6)
                    {
                        myRandomNumber1 = myRandomNumber - 1;
                        myRandomNumber2 = myRandomNumber1 - 1; 
                        myRandomNumber3 = myRandomNumber2 - 1; 
                        myRandomNumber4 = myRandomNumber3 - 1; 
                    }
                    else
                    {
                        myRandomNumber1 = myRandomNumber + 1;
                        myRandomNumber2 = myRandomNumber1 + 1; 
                        myRandomNumber3 = myRandomNumber2 + 1;
                        myRandomNumber4 = myRandomNumber3 + 1;
                    }
                break;    
                    
            }

            
            //int fiveButton[]= {myRandomNumber,myRandomNumber1,myRandomNumber2, myRandomNumber3, myRandomNumber4};
            int [][] fiveButton = new int [5][2];
            fiveButton[0][0] = myRandomNumber;
            fiveButton[0][1] = 0;
            fiveButton[1][0] = myRandomNumber1;
            fiveButton[1][1] = 0;
            fiveButton[2][0] = myRandomNumber2;
            fiveButton[2][1] = 0;
            fiveButton[3][0] = myRandomNumber3;
            fiveButton[3][1] = 0; 
            fiveButton[4][0] = myRandomNumber4;
            fiveButton[4][1] = 0;             
            //retButton [i]= new Random().nextInt(buttons.length);
//             int randomPart = (buttons[retButton]);
            System.out.println(direction);
            System.out.println(fiveButton[0][0]);
            System.out.println(fiveButton[1][0]);
            System.out.println(fiveButton[2][0]);
            System.out.println(fiveButton[3][0]);
            System.out.println(fiveButton[4][0]);
            Boolean returnSend = false;
            for (int z = 0; z < 4; z++)
            returnSend=this.OverLap (fiveButton[z][0], "five");
            
            if (returnSend = true)
            {
            return fiveButton; 
            }
            else
            {
            fiveButton = null;
            return fiveButton;
            }
            
    }     
         
         
         
         
         
         
    // deciding the direciton of the ship
    // 0 = up; 1 = down; 2 = right
    public int Direction()
    {
        double r = Math.random();
        int direction = (int) ((r*3.0));
                
        return direction;
    }
    
    public Boolean OverLap(int n, String ship)
    {
        Boolean send = false;
        String incomingShip = ship;
        int nn = n;
        System.out.println(nn + "overlap");
        
        if (shipList.contains(nn))
        {
            switch(incomingShip)
                {
                case "two":
                {
                    this.TwoButtonShip();
                    send = false;
                }
                break; 
                    
                case "three":
                {
                    this.ThreeButtonShip();
                }
                break; 
                    
                case "four":
                {
                    this.FourButtonShip();
                }
                break; 
                    
                case "five":
                {
                    //this.FiveButtonShip();
                }
                break;    
                }
        }
        else 
        {
        shipList.add(nn);
        send = true;
        }
        
        return send;
        
       
    }

    
    
}
             

