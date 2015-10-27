/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Nick
 */
public class ConvertibleB implements Drivable{
    public boolean isOn=false;
    public boolean topUp=true;
    @Override
    public void Drive(){
        if(isOn==true){
            System.out.println("Driving vehicle");
        }
        else{
            System.out.println("Start the vehicle first");
        }
    }
    @Override
    public void Start(){
        System.out.println("Starting vehicle");
        isOn=true;
    }
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
