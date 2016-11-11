import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import javax.swing.JButton;

public class student extends JButton
{
		String firstName;
		String lastName;               
		int age;
                JButton jb1; 
  
		public student(String a, String b, int x )
		{	
			super();
			firstName = a;
			lastName = b;
			age = x;                     
		}
                
                public student(String a)
                        
                {
                   
                }
       
		String getInfo()
		{
			return "NAME = "+firstName+ "  "+lastName+"  "+"Age = "+age;
		}
		
                String getMessage()
                        
                {
                    return ("Hi!  My name is " + firstName + ". I am st1 and I am now alive!"); 
                            
                }
                
                	int whatsUp()
		{
			double r = Math.random();
			int myNumber = (int) (r * 1000f); //comment: a random number between 0 and 2
			
			
			return myNumber;
		}

                
                

}
