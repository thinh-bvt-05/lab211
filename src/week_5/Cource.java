/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_5;

import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Cource {
    protected String courseID;
    protected String courseName;
    protected int credits;

    public Cource() {
        this.courseID = "";
        this.courseName = "";
        this.credits = 0;
    }
    
    public void inputAll(Scanner sc){
        while(true){
            System.out.print("Enter course ID: ");
            courseID = sc.nextLine();
            if(courseID.matches("[a-zA-Z]+")) break;
            else{
                System.out.println("Data input is invalid. Course ID must be unique");
            }
        }
        
        while(true){
            System.out.println("Enter course name: ");
            courseName = sc.nextLine();
            
        }
        
    }

    @Override
    public String toString() {
        return "Cource{" + "courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits + '}';
    }
    
    
}
