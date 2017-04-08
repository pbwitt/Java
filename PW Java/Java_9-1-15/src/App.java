/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nannette
 */
public class App {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        
        System.out.println(s1.getInfo());
        
        s1.setFirstName("Mary");
        s1.setLastName("Smith");
        s1.setAge(25);
        System.out.println(s1.getInfo());
        
        System.out.println(s1.getFirstName() + "\t" + s1.getLastName()
             + "\t" + s1.getAge());
        
        // Demonstrate array of students
        Student[] stds;  // declares reference to the actual array
        stds = new Student[3];  // Creates an array of 3 references
        // Actually create and assign the instantiated objects to the array indices
        stds[0] = new Student("Mary", "Smith", 25);
        stds[1] = new Student("John", "Doe", 30);
        stds[2] = new Student("Harry", "Jones", 20);
        
        for (int i = 0; i < stds.length; i++)
        {
            System.out.println(stds[i].getInfo());
        }
        
        for (int i = 0; i < stds.length; i++)
        {
            System.out.println(stds[i].getAge());
        }
        
        String[] tasks =  { " is sleeping", " is reading", " is gaming" };
        
        
        
        
        
    }
    
}
