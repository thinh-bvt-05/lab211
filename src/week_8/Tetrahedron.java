/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_8;



/**
 *
 * @author ThinhBui
 */
public class Tetrahedron extends ThreeDimensionalShape {
    private double r;

    public Tetrahedron() {
    }

    public Tetrahedron(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        double result = Math.sqrt(3) * r * r;
        result = Math.round(result * 100.0) / 100.0; 
        return result;
    }

    @Override
    double getVolume() {
        double result = (r * r * r) / (6 * Math.sqrt(2));
        result = Math.round(result * 100.0) / 100.0; 
        return result;
    }
}