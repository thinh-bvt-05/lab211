/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week3;

import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Test {
    private final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Test test = new Test();
        test.menu();
        
    }
    
    void menu(){
        while (true) {
            System.out.println();
            System.out.println("===== Menu Week 3 =====");
            System.out.println("1. J1.S.P0001");
            System.out.println("2. J1.S.P0004");
            System.out.println("3. J1.S.P0006");
            System.out.println("4. J1.S.P0083");
            System.out.println("5. Exit");
            System.out.println("Please choice one lesson: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    bubbleSort();
                    break;
//                case 2:
//                    
//                    break;
                case 3:
                    binarySearch();
                    break;
                case 4:
                    myStack();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Choice again!");
                    break;
            }
        }
    }
    
    void bubbleSort(){
        System.out.print("Enter number of array: ");
        int number = sc.nextInt();
        BubbleSort bubble = new BubbleSort(number);
        bubble.bubbleSort();
    }
    void binarySearch(){
        System.out.print("Enter number of array: ");
        int number = sc.nextInt();
        System.out.print("Enter search value: ");
        int search = sc.nextInt();
        BinarySearch binary = new BinarySearch(number);
        binary.showArray();
        binary.search(search);
    }
    
    void myStack(){
        MyStack stack = new MyStack();
        stack.push(6);
        stack.push(8);
        stack.push(9);
        System.out.print("Stack pop: ");
        stack.pop();
        System.out.print("get at index: ");
        int get = sc.nextInt();
        System.out.print("Stack get at index "+get+" is: ");
        stack.getAt(get);
        
    }
}
