
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
public class ta extends person

{
    
    
    ta(String informedFirstName, String informedLastName, int informedAge)
{
   super(informedFirstName, informedLastName, informedAge);
   
   
  
}



       public int communications()
         {
             int [] communication ={1,2,3,4,5,6,7,8,9,10};
             int retCom = new Random().nextInt(communication.length);
             
             
             int randomCom= (communication[retCom]);
             
             return randomCom; 

         }
    
    
    
}




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    