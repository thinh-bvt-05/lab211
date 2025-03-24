/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_8;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author ThinhBui
 */
public class Triangle extends TwoDimensionalShape {
    private double a;
    private double b;
    private double c;
    
    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double p = (a + b + c) / 2;
        double result;
        if (a + b <= c || a + c <= b || b + c <= a) {
            result = 0; 
        } else {
            result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            result = Math.round(result * 100.0) / 100.0; 
        }
        return result;
    }
}

