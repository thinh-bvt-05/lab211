/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_6_bai2;

/**
 *
 * @author ThinhBui
 */
public class Salary {
    private double salary;
    private String status;
    private String date;

    public Salary(double salary, String status, String date) {
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Salary{" + "salary=" + salary + ", status=" + status + ", date=" + date + '}';
    }
    
    
    
}
