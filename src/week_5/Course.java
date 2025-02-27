/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_5;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Course {
    protected String courseID;
    protected String courseName;
    protected int credits;

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.credits = 0;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
    
    public void inputAll(Scanner sc, List<Course> course){
        courseID = Utils.checkId("Course ID: ", course);
        courseName = Utils.checkName("Course name: ", course);
        credits=Utils.checkCredit("Credits: ");
        
    }

    @Override
    public String toString() {
        return courseID + " - " + courseName + " - " + credits ;
    }
    
    
}
