/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_2;

/**
 *
 * @author ThinhBui
 */
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void printResult() {
        System.out.println("----- Circle -----");
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+getArea());
        System.out.println("Parameter: "+getParameter());
    }

    @Override
    public double getParameter() {
        return (radius*2) * Math.PI;
    }

    @Override
    public double getArea() {
        return (radius*radius) * Math.PI;
    }
    
    
}
