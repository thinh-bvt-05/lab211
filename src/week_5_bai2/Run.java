/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_5_bai2;

import java.math.BigInteger;

/**
 *
 * @author ThinhBui
 */
public class Run {
    public static void main(String[] args) {
        Number n1 = new Number("65");
        Number n2 = new Number("65");
        
        Number s = n1.addTwoNum(n2);
        System.out.println(s.getValue());
        
        BigInteger num1 = new BigInteger("65");
        BigInteger num2 = new BigInteger("65");
        
        BigInteger num = num1.add(num2);
        System.out.println(num.toString());
    }
}
