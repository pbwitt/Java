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
public class App {

    
    public static void main(String[] args) {
              
        {           
            student st1 = new student("Zack","Mills", 22);
            student st2 = new student("John","Smith", 20);   
            student st3 = new student("Fred","Fonz", 44);
            student st4 = new student(); 

            Professor pr1 = new Professor("Paul", "Krugman", "Economics", 55); 
            Professor pr2 = new Professor("John", "Doe", "Science", 45); 
            Professor pr3 = new Professor("Steve", "Stevemson", "Art", 35); 
      
 //Create Array with Student Ages. 
            int[] stArray = {st1.getAge(),st2.getAge(),st3.getAge()}; 
            int[] prArray = {pr1.getAge(),pr2.getAge(),pr3.getAge()};
            String[] tasks = { "reading a book", "wring code", "giving a speech", "talking with his friends", "doing math", "doing science", "sleeping", "getting ready to go home",
           "staring his day", "running late"}; 
            
          
          
            
            System.out.println(""  );
            System.out.println(""  );
            
         
            String oldestSt = returnOldest(stArray); 
            String youngestSt = returnYoungest(stArray);
            String oldestPr = returnOldest(prArray); 
            String youngestPr = returnYoungest(prArray); 
//            System.out.println(st1.isOlderThan(st2.getAge(),st1.getAge(),st3.getAge()));        
          
            System.out.println("Paul Witt: PBW5003 Lab #2"  );
           
            System.out.println("Return random activities from student class:"  );

    
           
            for (int j = 0; j < 20; j++)

{
 
    
    System.out.println(j +1 + " " + st1.getName() + " " + st1.whatsUp());
 
 
}
            System.out.println(""  );  
            System.out.println("Student One = "  + st1.getName()+" "+ "who is "+ st1.getAge1());
            System.out.println("Student Two = "  + st2.getName()+" "+ "who is "+ st2.getAge1());
            System.out.println("Student Three = "  + st3.getName()+" "+ "who is "+ st3.getAge1() );
           
                


          
  
  System.out.println(""  );
  System.out.println(""  );
//Boolean Logic to compare two students.             
            
            if(st1.olderThan(st2.getAge())){
                System.out.println(st1.getName() + " is older than " + st2.getName() +"." ); 
            }
 //Boolean Logic to compare two students.             
            
            if(st2.youngerThan(st3.getAge())){
                System.out.println(st2.getName() + " is older than " + st3.getName() +"." ); 
            }
  System.out.println(""  );
  System.out.println(""  );                      
            
//Yougest Student Return
            if(youngestSt.equals(st1.getAge1())){
                System.out.println("The youngest student is  " +st1.getInfo());}
            
            else if 
                (youngestSt.equals(st2.getAge1())) {
                System.out.println("The youngest student is " +st2.getInfo());}
                
             
            else if 
                (youngestSt.equals(st3.getAge1())) {
                System.out.println("The youngest student is " +st3.getInfo());}
 
   //Oldest Student Return         
            if(oldestSt.equals(st1.getAge1())){
                System.out.println("The oldest student is  " +st1.getInfo());}
            
            else if 
                (oldestSt.equals(st2.getAge1())) {
                System.out.println("The oldest student is " +st2.getInfo());}
                
             
            else if 
                (oldestSt.equals(st3.getAge1())) {
                System.out.println("The oldest student is " +st3.getInfo());}

  System.out.println(""  );
  System.out.println(""  );                      
                
   
  
  
            System.out.println("Professor One = " + pr1.getInfo()); 
            System.out.println("Professor Two = " + pr2.getInfo());
            System.out.println("Professor Three = " + pr3.getInfo()); 
  
 //Returns oldest Professor       
        
              if(oldestPr.equals(pr1.getAge2())){
                System.out.println("The oldest professor is  " +pr1.getInfo());}
            
            else if 
                (oldestPr.equals(pr2.getAge2())) {
                System.out.println("The oldest professor is " +pr2.getInfo());}
                
             
            else if 
                (oldestPr.equals(pr3.getAge2())) {
                System.out.println("The oldest professor is " +pr3.getInfo());}

      
  
        
        
         if(youngestPr.equals(pr1.getAge2())){
                System.out.println("The oldest professor is  " +pr1.getInfo());}
            
            else if 
                (youngestPr.equals(pr2.getAge2())) {
                System.out.println("The oldest professor is " +pr2.getInfo());}
                
             
            else if 
                (youngestPr.equals(pr3.getAge2())) {
                System.out.println("The oldest professor is " +pr3.getInfo());}
                

        }


        
    }
 

    //For loop that returns the largest integer in the array.  The output is converted from int to String. 
      public static String returnOldest(int[] anArray){  
      int oldestSt = anArray[0];  
      for(int i=1;i < anArray.length;i++){  
      if(anArray[i] > oldestSt){  
      oldestSt= anArray[i];  

         }  
     }  
             return Integer.toString(oldestSt);

              }  
    
//For loop that returns the smallest integer in the array.  The output is converted from int to String. 
     
      public static String returnYoungest(int[] anArray){  
      int youngestSt = anArray[0];  
      for(int i=1;i < anArray.length;i++){  
      if(anArray[i] < youngestSt){  
      youngestSt = anArray[i];  

         }  
     }  
             return Integer.toString(youngestSt);       
 
      }  
  

     
      
      
  }

    

    

 


    
        