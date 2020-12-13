/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab6.B;

/**
 *
 * @author TING WEI JING
 */
public class A {
    // access modifier
    public static void main(String[] args) {
        System.out.println("This is A class");
        B.main(args);
        B.main2(args);
        
        // call non static method
        B b = new B();
        b.main1(args);
    }

}
