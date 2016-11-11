/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
public class App1 
{

 public static void main(String[] args)
 {
   student st1 = new student("Zack","Mills",21, "Science");
   professor pr1 = new professor("Paul", "Witt", 33, "Phd"); 
   ta ta1 = new ta("Donald", "Trunp", 44); 
  
   System.out.println("Student One: " + st1.getName() + ", who is " + st1.getAge() + " years old, has a status of " + "'"+ st1.getStatus()+"'" + " and is majoring in " + st1.getMajor()+".");
  
   System.out.println("Professor: " + pr1.getName() + ", who is " + pr1.getAge() + " years old, earned a " + pr1.getDegree() + " degree." );
   
   System.out.println("Teaching Assistant: " + ta1.getName() + ", who is " + ta1.getAge() + " years old, has a communications score of " + ta1.communications()+"."); 
   
   
   
 }
} 