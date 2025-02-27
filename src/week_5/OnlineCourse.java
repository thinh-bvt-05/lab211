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
public class OnlineCourse extends Course{
    private String platform;
    private String instructors;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructors = "";
        this.note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    @Override
    public void inputAll(Scanner sc, List<Course> online){
        super.inputAll(sc, online);
        platform=Utils.checkEmpty("Platform: ");
        instructors=Utils.input("Instructos: ");
        note=Utils.checkEmpty("Note: ");
        
    }

    @Override
    public String toString() {
        return super.toString() + " - " + platform + " - " + instructors + " - " + note;
    }
    
    
}
