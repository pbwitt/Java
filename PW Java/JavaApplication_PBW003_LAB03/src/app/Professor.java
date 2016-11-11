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
public class Professor {
    
    String firstName; 
    String lastName; 
    String degree; 
    int age; 
    
    
    Professor(){
        
    }; 
    Professor(String fn, String ln, String dg, int ag){
        
        firstName = fn; 
        lastName= ln; 
        degree = dg; 
        age = ag ; 
    }
    
           
    String getInfo( ){
        
        return firstName + " " + lastName + " professor of " + degree + " is " + age ; 
        
    }
        
        
     int getAge()
        {
            return age; 
        }
              
    
     String getAge2()
        {
            return Integer.toString(age); 
        }
    
    
}
