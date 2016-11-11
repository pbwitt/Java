/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
public class professor extends person


{
   String degree;
professor (String informedFirstName, String informedLastName, int informedAge, String informedDegree)
{
   super(informedFirstName, informedLastName, informedAge);
   degree = informedDegree; 

}


String getDegree()
{
    return degree; 
}




}