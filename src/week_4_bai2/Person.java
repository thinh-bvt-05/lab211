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
public class Person {
    protected String id;
    protected String name;
    protected String phone;
    protected int yearOfBirth;
    protected String major;

    public Person() {
        this.id = "";
        this.name = "";
        this.phone = "";
        this.yearOfBirth = 0;
        this.major = "";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getMajor() {
        return major;
    }
    
    

    
    public void inputAll(Scanner sc){
        id = Utils.checkId("Enter ID: ");
        
        name = Utils.checkName("Enter name: ");
        
        phone = Utils.checkPhone("Enter phone: ");
        
        yearOfBirth = Utils.checkYear("Enter year of birth: ");
        
        major = Utils.checkMajor("Enter major: ");
        
    }

    @Override
    public String toString() {
        return String.format("- %-5s - %-10s - %-12s - %-4d - %-15s -" ,id,name,phone,yearOfBirth,major);
    }

   
    
    
}
