/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat2;

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String[] args) {
        Line line = new Line(40, 20, 15, 30);
        System.out.println(line.getLength());
        System.out.println(line.IsGreater(line, line));
        System.out.println(line.IsLess(line, line));
        System.out.println(line.IsEqual(line, line));
     
    }
}
