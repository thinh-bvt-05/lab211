/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_6;

import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Utils {
    private static Scanner sc = new Scanner(System.in);
    public static String checkPhone(String phone){
        if (phone != null && phone.matches("123456789[1-4]{4}")){
            return phone;
        }
        return null;
    }
}

