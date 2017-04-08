/* Normal Block Comment
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**  JavaDoc Comment
 *
 * @author Nannette
 * @version 1.01 9/1/15
 * Filename: Student.java
 * Short Description: Class to store student data
 * 
 */
public class Student 
{
    // Declaring attributes
    String firstName;
    String lastName;
    int age;
    
    // Constructor
    Student()
    {
        firstName = "<unknown>";
        lastName = "<unknown>";
        age = 0;
    }
    
    Student(String a, String b, int x)
    {
        firstName = a;
        lastName = b;
        age = x;
    }
    
    // Setters or Mutator Methods
    void setFirstName(String fName)
    {
        firstName = fName;
    }
    void setLastName(String lName)
    {
        lastName = lName;
    }   
    
    void setAge(int ageIn)
    {
        age = ageIn;
    }
    
    // Getters or Accessor Methods
    String getFirstName()
    {
        return firstName;
    }
    String getLastName()
    {
        return lastName;
    }
    int getAge()
    {
        return age;
    }
    
    // Methods
    String getInfo()
    {
        return "NAME = " + firstName + " " + lastName 
                + "       Age = " + age;
    }
    
}
