/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_8;

/**
 *
 * @author ThinhBui
 */
public class Square extends TwoDimensionalShape {
    private double a;

    public Square() {
    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    double getArea() {
        double result = a * a;
        result = Math.round(result * 100.0) / 100.0; 
        return result;
    }
}

