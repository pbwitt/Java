package app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
/**
 *
 * @author pbw5003
 */
public class Group {
    
    String groupName = "Tigers";  
    
  Student st1;
  Student st2;
  Student st3;
  Student st4;
  
    
  
  
    // Try this -- In Group  Didn't use this for the assignment, but I plan on revisiting it. 
ArrayList students = new ArrayList( );

  
               

    public Group(String nm, ArrayList e){
        
        groupName = nm;
        e = students; 
        
        
        
        
    }
    public Group(String nm, Student stu1, Student stu2, Student stu3, Student stu4)
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
     
     
   
               
  
      public void returnParticipation( )
     {
         
         
             // create new array
     
            int[] anArray = 
               {st1.participation(), st2.participation(),st3.participation(),st4.participation()};
               
         
                                   
                
           int counter1 = st1.participation();
           int counter2 = st2.participation();
           int counter3 = st3.participation();
           int counter4 = st4.participation();
                                
                            
                   
  int sum = 0; 
  
         System.out.println("Group Name: " + groupName);  
         for (int  i =0; i <anArray.length; i++)
         {

             if (i == 0) {
                  System.out.println( st1.getName() + " has a participation of " + counter1);
           }
         
              else if (i == 1){
                  System.out.println( st2.getName() + " has a participation of " + counter2 );
              }
              
              else if (i == 2){
                  System.out.println( st3.getName() + " has a participation of " + counter3 );
            }
              else if (i == 3){
                  System.out.println( st4.getName() + " has a participation of " + counter4 );
            } 
  
          
             
                  
         }
         
         sum = counter1 + counter2 + counter3 + counter4; 

System.out.println( "Group " + groupName + " Has a participation of " + (counter1 + counter2 + counter3 + counter4) + "\n The average participation for the group is " + sum/4  );
//

     }
  
}




