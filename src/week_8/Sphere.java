/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_8;



/**
 *
 * @author ThinhBui
 */
public class Sphere extends ThreeDimensionalShape {
    private double r;

    public Sphere() {
    }

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        double result = 4 * r * r * Math.PI;
        result = Math.round(result * 100.0) / 100.0; 
        return result;
    }

    @Override
    double getVolume() {
        double result = 4 * r * r * r * Math.PI / 3;
        result = Math.round(result * 100.0) / 100.0; 
        return result;
    }
}

