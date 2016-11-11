/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author pbw5003
 */


/**
 * 
 * This is the student class.  It contains four methods, one constructor, three variables, and two data types. 
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
        
         
     
          
            
           
       }
      
            
    
        
        
        
       
      
        

