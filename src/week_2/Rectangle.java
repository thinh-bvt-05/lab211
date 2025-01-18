/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_2;

/**
 *
 * @author ThinhBui
 */
public class Rectangle extends Shape {
    private double sideWidth;
    private double sideLength;

    public Rectangle(double sideWidth, double sideLength) {
        this.sideWidth = sideWidth;
        this.sideLength = sideLength;
    }

    public double getSideWidth() {
        return sideWidth;
    }

    public void setSideWidth(double sideWidth) {
        this.sideWidth = sideWidth;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void printResult() {
        System.out.println("----- Rectangle -----");
        System.out.println("Width: "+ sideWidth);
        System.out.println("Length: "+ sideLength);
        System.out.println("Area: "+ getArea());
        System.out.println("Perimeter: "+ getParameter());
    }

    @Override
    public double getParameter() {
        return 2*(sideWidth+sideLength);
    }

    @Override
    public double getArea() {
        return  sideWidth*sideLength;
    }
    
    

}
