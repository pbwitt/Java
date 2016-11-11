/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */

    
class student extends person
{
   String status;
   String major; 
   
student(String informedFirstName, String informedLastName, int informedAge, String informedMajor)
{
   super(informedFirstName, informedLastName, informedAge);
   
  major = informedMajor; 
   
   if (age <= 25) status = "Traditional";
   else status = "Non-Traditional";
}


String whatIsUp()
{
   int n = 0;
   String b = "..."; 
   n = (int) (Math.random()*2);
   if (n == 0) b = "reading";
   if (n == 1) b = "talking"; 
   return b;
}
String getStatus()
{
   return status ;
}

String getMajor()
{
    return major; 
}


}
