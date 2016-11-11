
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
public class student {
 
   String firstName;      
	String lastName;
	int age;
     
  
        
        // Below is the contructor.  
	student(String enter_firstName,  String enter_lastName, int enter_age)
	{
		firstName = enter_firstName;               
		lastName = enter_lastName;
		age = enter_age; 
               
              

	}
        
         //Returns firtName, lastName, and age. 
        student ()
        {
            
        }

	String getInfo()
	{
		return firstName+ " "+lastName+" "+"at Age "+ age+"." ; 
	}
        
        String getName()
        {
            return firstName + " " + lastName; 
        }
        
        int getAge()
        {
            return age; 
        }
              
        
        String getAge1()
        {
            return Integer.toString(age); 
        }
        
        
        boolean olderThan(int student_age )
        {
            boolean r;
            if(age > student_age)
            {
                return true;
            }
            else return false;
                 
        }
        
         boolean youngerThan(int student_age )
        {
            boolean r;
            if(age < student_age)
            {
                return true;
            }
            else return false;
                 
        }
        
         public String whatsUp()
       {
             
      String[] tasks = { "reading a book", "writing code", "giving a speech"}; 
           
      int retTask = new Random().nextInt(tasks.length );
       
      String random = (tasks[retTask ]);

      return random ; 
        
   }     
       
       
         //Creates Random Participation Method. 
         public int participation()
         {
             int [] participation ={1,2,3,4,5,6,7,8,9,10};
             int retPart = new Random().nextInt(participation.length);
             int randomPart = (participation[retPart]);            
             return randomPart; 

         }
         
         
 
         
         
         
         
         
         
         
         
         
         
         
         
}
       




              
              

   

        

           
           
           
       
       
    