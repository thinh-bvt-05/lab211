/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_2;

import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Test {

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Test temp = new Test();
        temp.menu();   
    }
    void menu(){
        while (true) {
            System.out.println();
            System.out.println("===== Menu Week 2 =====");
            System.out.println("1. J1.S.P0051");
            System.out.println("2. J1.S.P0061");
            System.out.println("3. J1.S.P0074");
            System.out.println("4. Exit");
            System.out.println("Please choice one lesson: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    calculator();
                    break;
                case 2:
                    perimeterAndArea();
                    break;
//                case 3:
//                    calculateMatrix;
//                    break;
                    
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Choice again!");
                    break;
            }
        }
    }

    void calculator() {
        while (true) {
            System.out.println("===== Calculator Program =====");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.println("Please choice one option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    doCalculator();
                    break;
                case 2:
                    bmiCalulator();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Choice again!");
                    break;
            }
        }

    }

    void doCalculator() {
        Calculator normal = new Calculator();
        //System.out.println("Input number: ");
        double number = checkDouble("Input number: ");
        double temp = number;
        while (true) {
            System.out.println("Input opertor: ");
            String operator = checkOperator();
            if (operator.equals("=")) {
                System.out.println("Result: "+temp);
                return;
            }
            //  System.out.println("Input number: ");
            double num = checkDouble("Input number: ");
            temp = normal.calculator(temp, operator, num);
            System.out.println("Memory: " + temp);
        }
    }

    void bmiCalulator() {
        double weight = checkDouble("Enter weight(kg): ");
        sc.nextLine();
        // System.out.print("Enter height(cm): ");
        double height = checkDouble("Enter height(cm): ");
        sc.nextLine();
        height = height * 0.01;
        Calculator calculator = new Calculator();
        calculator.bmiCalculate(weight, height);
    }

    double checkDouble(String string) {
        double num = 0;
        while (true){
            try {
                num = Double.parseDouble(getValue(string));
                return num;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    String getValue(String string) {
        System.out.println(string);
        return sc.nextLine().trim();
    }

    String checkOperator() {
        while (true) {

            String operator = sc.nextLine();

            if (operator.equals("+")) {
                return operator;
            }
            if (operator.equals("-")) {
                return operator;
            }
            if (operator.equals("*")) {
                return operator;
            }
            if (operator.equals("/")) {
                return operator;
            }
            if (operator.equals("^")) {
                return operator;
            }
            if(operator.equals("=")){
                return operator;
            }

            System.out.println("Invalid Operator. Operator valid is (+, -, *, /, ^)");
            System.out.println("Please enter again.");

        }
    }
    
    void perimeterAndArea(){
        System.out.println("=====Calculator Shape Program=====");
        Double width = checkDouble("Please input side width of Rectangle: ");
        Double length = checkDouble("Please input length of Rectangle: ");
        Double radius = checkDouble("Please input radius of Circle: ");
        Double sideA= checkDouble("Please input side A of Triangle: ");
        Double sideB= checkDouble("Please input side B of Triangle: ");
        Double sideC=checkDouble("Please input side C of Triangle: ");
        Rectangle rec = new Rectangle(width, length);
        Circle cir = new Circle(radius);
        Triangle tri = new Triangle(sideA, sideB, sideC);
        
        rec.printResult();
        cir.printResult();
        tri.printResult();
    }
}
