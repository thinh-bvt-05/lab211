/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class OfflineCourse extends Course {

    private String begin, end, campus;

    public OfflineCourse() {
        super();
        this.begin = "";
        this.end = "";
        this.campus = "";
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
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

    public void inputAll(Scanner sc, List<Course> course) {
        super.inputAll(sc, course);
        do {
            begin = Utils.checkDate("Begin: ");
        } while (begin == null);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateBegin = LocalDate.parse(begin, format);
        do {
            end = Utils.checkDate("End: ");
            if (end != null) {
                LocalDate endDate = LocalDate.parse(end, format);
                if (endDate.isAfter(dateBegin)) {
                    break;
                } else {
                    System.out.println("Data input is invalid, end must be after begin");
                }
            }

        } while (true);
        campus = Utils.checkEmpty("Campus: ");
    }

    @Override
    public String toString() {
        return super.toString() + " - " + begin + " - " + end + " - " + campus;
    }

}
