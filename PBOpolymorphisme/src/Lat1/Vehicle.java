/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat1;

/**
 *
 * @author USER
 */
public abstract class Vehicle {
    public void Function(){
        System.out.println("Transportation tools");
    }
    public void walk(){
        System.out.println("Walks");
    }
    public abstract void fuel();
    
}
