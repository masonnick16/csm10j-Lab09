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
public class CarB implements Drivable{
    public boolean isOn=false;
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
}
