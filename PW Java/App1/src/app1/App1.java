/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author pbw5003
 */
public class App1 {

  //Main Method -- the entry point for the application. 
 public static void main(String[] args) {
              
     
     
        {           
            student st1 = new student("Zack","Mills", 22);
            student st2 = new student("John","Smith", 20);   
            student st3  = new student("Fred","Fonz", 44);    
            
 //Create Array with Student Ages. 
            int[] stArray = {st1.getAge(),st2.getAge(),st3.getAge()}; 
            
            String oldest = returnOldestStudent(stArray); 
            String youngest = returnYoungestStudent(stArray); 
//            System.out.println(st1.isOlderThan(st2.getAge(),st1.getAge(),st3.getAge()));        
            System.out.println("Student One = "  + st1.getName()+" "+ "who is "+ st1.getAge1());
            System.out.println("Student Two = "  + st2.getName()+" "+ "who is "+ st2.getAge1());
            System.out.println("Student Three = "  + st1.getName()+" "+ "who is "+ st3.getAge1() );
            System.out.println(""  );
            System.out.println("Analysis:"  );
            
        
          
    
 
         if(st1.olderThan(st2.getAge())){
                System.out.println(st1.getName() + " is older than " + st2.getName() +"." ); 
            }
 //Boolean Logic to compare two students.             
            
            if(st2.youngerThan(st3.getAge())){
                System.out.println(st2.getName() + " is older than " + st3.getName() +"." ); 
            }
                       
            
//Yougest Student Return
            if(youngest.equals(st1.getAge1())){
                System.out.println("The youngest student is  " +st1.getInfo());}
            
            else if 
              (youngest.equals(st2.getAge1())) {
                System.out.println("The youngest student is " +st2.getInfo());}
                
             
            else if 
              (youngest.equals(st3.getAge1())) {
                System.out.println("The youngest student is " +st3.getInfo());}
   
                  
            
            
   //Oldest Student Return         
            if(oldest.equals(st1.getAge1())){
                System.out.println("The oldest student is  " +st1.getInfo());}
            
            else if 
               (oldest.equals(st2.getAge1())) {
                System.out.println("The oldest student is " +st2.getInfo());}
                
             
            else if 
               (oldest.equals(st3.getAge1())) {
                System.out.println("The oldest student is " +st3.getInfo());}
            
}

        
        
 }
        
   

    //For loop that returns the largest integer in the array.  The output is converted from int to String. 
      public static String returnOldestStudent(int[] anArray){  
      int oldestStudent = anArray[0];  
      for(int i=1;i < anArray.length;i++){  
      if(anArray[i] > oldestStudent){  
      oldestStudent= anArray[i];  

         }  
     }  
             return Integer.toString(oldestStudent);

              }  
    
//For loop that returns the smallest integer in the array.  The output is converted from int to String. 
     
      public static String returnYoungestStudent(int[] anArray){  
      int youngestStudent = anArray[0];  
      for(int i=1;i < anArray.length;i++){  
      if(anArray[i] < youngestStudent){  
      youngestStudent = anArray[i];  

         }  
     }  
             return Integer.toString(youngestStudent);       
 
      }  
      
      
   }

      
  
