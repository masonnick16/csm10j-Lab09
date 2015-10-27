/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Nick
 */
public class ConvertibleA extends Vehicle{
    public boolean topUp=true;
    
    public void PutTopUp(){
        if(topUp==false){
            topUp=true;
            System.out.println("Putting top up");
        }
        else if(topUp=true){
            System.out.println("Top is already up");
        }
        
        }
    public void PutTopDown(){
        if(topUp==false){
            System.out.println("Top is already down");
        }    
        if(topUp==true){
            topUp=false;
            System.out.println("Putting top down");
            
        }
        
        }
}

