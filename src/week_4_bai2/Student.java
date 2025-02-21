/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_4_bai2;

import java.util.Scanner;



/**
 *
 * @author ThinhBui
 */
public class Student extends Person{
    private int yearOfAdmission;
    private double entranceEngScore;

    public Student() {
        super();
        this.yearOfAdmission = 0;
        this.entranceEngScore = 0;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }
    

    @Override
    public void inputAll(Scanner sc){
        super.inputAll(sc);
        
        while(true){
            yearOfAdmission = Utils.checkInt("Enter year of admission: ");
            if(yearOfAdmission > yearOfBirth && yearOfAdmission <= 2025) break;
            else{
                System.out.println("Data input is invalid.");
            }
        }
        while(true){
            entranceEngScore = Utils.checkDouble("Enter entrance english score: ");
            if(entranceEngScore >= 0 && entranceEngScore <= 100) break;
            else{
                System.out.println("Data input is invalid.");
            }
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(" - %-2d - %-3s", yearOfAdmission, entranceEngScore);
    }
    
    
    
    
}
