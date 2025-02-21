/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_3;

import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Ultils {
    static Scanner sc = new Scanner(System.in);
    public static int checkNum(){
        while(true){
           // System.out.println("Enter a number: ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                if(input < 2)continue;
                //throw new IllegalArgumentException();
                return input;
            } catch (Exception e) {
            }
        }
    }

}
