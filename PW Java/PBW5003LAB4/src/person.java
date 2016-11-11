/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
public class person 
    
{
   String firstName;
   String lastName;
   int age;

person(String informedFirstName, String informedLastName, int informedAge)
{
   firstName = informedFirstName;
   lastName = informedLastName;
   age = informedAge;
}

String whatIsUp()
{
   return "undetermined";
}

String getName()
{
   return firstName +" "+lastName;
}

String getAge()
{
   String str = String.valueOf(age);
   return str;
}

String getInfo()
{
   return (getName()  + " " + getAge());
}

}


