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
public class AeroPlan extends Vehicle {
    public void fuel(){
        System.out.println("The Aeroplan is Flying...");
    }
    public static void main(String[] args) {
        AeroPlan Garuda = new AeroPlan();
        Garuda.Function();
        Garuda.fuel();
        Garuda.walk();
    }
}
