/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_8;



/**
 *
 * @author ThinhBui
 */
public class Circle extends TwoDimensionalShape {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        double result = r * r * Math.PI;
        result = Math.round(result * 100.0) / 100.0;    
        return result;
    }
}

