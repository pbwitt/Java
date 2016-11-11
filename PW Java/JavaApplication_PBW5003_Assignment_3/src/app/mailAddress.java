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
public class mailAddress {
    String streetAddress;
    String city; 
    String state; 
    int zipcode;
    public mailAddress(String inf_streetAddress, String inf_city, String inf_state, int inf_zipcode){
        streetAddress = inf_streetAddress; 
        city = inf_city;
        state = inf_state; 
        zipcode = inf_zipcode; 
        
    }
    public String getAddress(){
        return streetAddress+","+city+","+state+","+zipcode; 
    }
    
}
