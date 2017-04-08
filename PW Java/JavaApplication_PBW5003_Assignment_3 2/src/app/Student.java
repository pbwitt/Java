/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;

/**
 *
 * @author pbw5003
 */


/**
 * 
 * This is the Student class.  It contains four methods, one constructor, three variables, and two data types. 
 */
public class Student {
	String firstName;      
	String lastName;
	int age;
        mailAddress address;
  
        
        // Below is the contructor.  
	Student(String enter_firstName,  String enter_lastName, int enter_age, mailAddress d)
	{
		firstName = enter_firstName;               
		lastName = enter_lastName;
		age = enter_age; 
                address = d;
              

	}
        
         //Returns firtName, lastName, and age. 
        Student ()
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
       




              
              

   

        

           
           
           
       
      
            
    
        
        
        
       
      
        

