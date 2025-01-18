/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_2;

/**
 *
 * @author ThinhBui
 */
public class Calculator {

    public Calculator() {
    }

    double calculator(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;

            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;

            case "/":
                return num1 / num2;
            case "^":
                return Math.pow(num1, num2);
            default:
                throw new AssertionError();
        }

    }
    
    void bmiCalculate(double weight, double height){
        
        double bmi = weight / (height*height);
        System.out.printf("BMI number: %.2f%n",bmi);
        if(bmi < 19){
            System.out.println("BMI Status: UNDER-STANDARD");
            return;
        }
        if(bmi >= 19 && bmi < 25){
            System.out.println("BMI Status: STANDARD");
            return;
        }
        if(bmi >= 25 && bmi < 30){
            System.out.println("BMI Status: OVERWEIGHT");
            return;
        }
        if(bmi >= 30 && bmi< 40){
            System.out.println("BMI Status: FAT-SHOULD LOSE WEIGHT");
            
        }
        else{
            System.err.println("BMI-Status: VERY FAT - SHOULD LOSE WEIGHT IMMEDIATETLY");
        }
        
    }
}
