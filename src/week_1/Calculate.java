/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_1;

import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Calculate {
    private double a;
    private double b;
    private double c;
    
    private final Scanner sc = new Scanner(System.in);
    public Calculate(String a, String b) {
        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
    }

    public Calculate(String a, String b, String c) {
        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
        this.c = Double.parseDouble(c);
        
    }

    public Calculate() {
    }
    
    
    
    void menu(){
        System.out.println("=====Equation Program=====");
        System.out.println("1. Calculate Superlative Equation.");
        System.out.println("2. Calculate Quadratic Equation.");
        System.out.println("3. Exit.");
        System.out.println("Please choice one option: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1: 
                a = checkDouble("Enter the number a: ");
                b= checkDouble("Enter the number b: ");
                calculateEquation();
                
                break;
            case 3: break;
        }
    }
    
    void calculateEquation(){
        double x = -b / a;
        System.out.println("Solution: x = "+ x);
        
        System.out.print("Number is odd: ");
        if(a % 2 == 1) System.out.print(a+ " ");
        if(b%2==1) System.out.print(b+" ");
        System.out.printf("\nNumber is even: ");
        if(a%2==0) System.out.print(a +" ");
        if(b%2==0) System.out.print(b+" ");
        System.out.printf("\nNumber is Perfect Square: ");
        if(a >=0 && Math.sqrt(a)==(int)(Math.sqrt(a))) System.out.print(a+" ");
        if(b >=0 && Math.sqrt(b)==(int)(Math.sqrt(b))) System.out.println(b+" ");
       
         
    }
    
    double checkDouble(String string){
        Scanner sc = new Scanner(System.in);
        double number = 0;
        while(true){
            number = Double.parseDouble(getValue(string));
            return number;
        }
    }
    String getValue(String string) {
        System.out.print(string);
        return sc.nextLine().trim();
    }
    
}
