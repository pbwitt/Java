package app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 *
 * @author pbw5003
 */
public class Group {
    
    String groupName = "Tigers";  
    
  student st1;
  student st2;
  student st3;
  student st4;
    // Try this -- In Group
ArrayList students = new ArrayList( );



    public Group(String nm, ArrayList e){
        
        groupName = nm;
        e = students; 
    }
    public Group(String nm, student stu1, student stu2, student stu3, student stu4)
    {
        st1 = stu1; 
        st2 = stu2; 
        st3 = stu3; 
        st4 = stu4; 
        
    }
            
            
            
            
            

    String getInfo(){
        return groupName + "\nStudent One = " + st1.getName() + "\nStudent Two = " + st2.getName() + "\nStudent Three = " + st3.getName() + "\nStudent Four = " + st4.getName() ;
    }
    Group(){
        
    }
    
     public String whatsUp()
       {
             
     
          String[] tasks = { "reading a book", "writing code", "giving a speech"}; 

            
      int retTask = new Random().nextInt(tasks.length );

      String random = (tasks[retTask ]);
      


      return random ; 
 
    
       }
  
}




