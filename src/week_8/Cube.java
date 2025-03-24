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
public class Cube extends ThreeDimensionalShape {
    private double a;

    public Cube() {
    }

    public Cube(double a) {
        this.a = a;
    }

    @Override
    double getArea() {
        double result = 6 * a * a;
        result = Math.round(result * 100.0) / 100.0; 
        return result;
    }

    @Override
    double getVolume() {
        double result = a * a * a;
        result = Math.round(result * 100.0) / 100.0; 
        return result;
    }
}
