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


//Create Student Class. 
public class Professor {
    
    String firstName; 
    String lastName; 
    String degree; 
    int age; 
    
  //Create Constructors.   
    Professor(){
        
    }; 
    Professor(String fn, String ln, String dg, int ag){
        
        firstName = fn; 
        lastName= ln; 
        degree = dg; 
        age = ag ; 
    }
    
     //Get information method.       
    String getInfo( ){
        
        return firstName + " " + lastName + " professor of " + degree + " is " + age ; 
        
    }
        
     //Returns the professors age.    
     int getAge()
        {
            return age; 
        }
              
    //Converts the age integer to a string. 
     String getAge2()
        {
            return Integer.toString(age); 
        }
    
    
}
