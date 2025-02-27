/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class CourseManagement {

    private Scanner sc = new Scanner(System.in);
    List<Course> courseList = new ArrayList<>();

    public boolean addOnlineCourse(OnlineCourse onl) {
        onl.inputAll(sc, courseList);
        courseList.add(onl);
        return true;
    }

    public boolean addOfflineCourse(OfflineCourse off) {
        off.inputAll(sc, courseList);
        courseList.add(off);
        return true;
    }

    public void showCourse() {
        for (Course on : courseList) {
            System.out.println(on.toString());
            }
    }

    public void showOnline() {
        for (Course on : courseList) {
            if (on instanceof OnlineCourse) {
                System.out.println("Course ID - Course name - Credits - Platform - Instructors - Note");
                System.out.println(on.toString());
            }
        }
    }

    public void showOffline() {
        for (Course on : courseList) {
            if (on instanceof OfflineCourse) {
                System.out.println("Course ID - Course name - Credits - Begin - End - Campus");
                System.out.println(on.toString());
            }
        }
    }

    public boolean foundData(String courseId) {
        if (courseId != null) {
            for (Course on : courseList) {
                if (on.getCourseID().equalsIgnoreCase(courseId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void searchResult(String idUpdate) {
        for (Course on : courseList) {
            if (on.getCourseID().equalsIgnoreCase(idUpdate)) {
                System.out.println("*** Search Results ***");
                System.out.println("Course ID: " + on.getCourseID()
                        + "\nCourse Name: " + on.getCourseName()
                        + "\nCredits: " + on.getCredits());
                if (on instanceof OnlineCourse) {
                    System.out.println("Platform: " + ((OnlineCourse) on).getPlatform()
                            + "\nInstructor: " + ((OnlineCourse) on).getInstructors()
                            + "\nNote: " + ((OnlineCourse) on).getNote());
                }
                if (on instanceof OfflineCourse) {
                    System.out.println("Begin: " + ((OfflineCourse) on).getBegin()
                            + "\nEnd: " + ((OfflineCourse) on).getEnd()
                            + "\nCampus: " + ((OfflineCourse) on).getCampus());
                }
                break;
            }
        }
        

    }

    public boolean updating(String idUpdate) {
        System.out.println("*** Updating ***");
        for (Course on : courseList) {
            if (on.getCourseID().equalsIgnoreCase(idUpdate)) {
                String id = Utils.input("Course ID: ");
                if(!id.isEmpty()) on.setCourseID(id);
                String name=Utils.input("Course Name: ");
                if(!name.isEmpty()) on.setCourseName(name);
                int credit = Integer.parseInt(Utils.input("Credits: "));
                if(!String.valueOf(credit).isEmpty()) on.setCredits(credit);
                if (on instanceof OnlineCourse) {
                    String platform = Utils.input("Platform: ");
                    if(!platform.isEmpty()) ((OnlineCourse) on).setPlatform(platform);
                    String instructor =Utils.input("Instructor: ");
                    if(!instructor.isEmpty()) ((OnlineCourse) on).setInstructors(instructor);
                    String note = Utils.input("Note: ");
                    if(!note.isEmpty()) ((OnlineCourse) on).setNote(note);

                }
                if (on instanceof OfflineCourse) {
                    String begin =Utils.input("Begin: ");
                    if(!begin.isEmpty()) ((OfflineCourse) on).setBegin(begin);
                    String end = Utils.input("End: ");
                    if(!end.isEmpty()) ((OfflineCourse) on).setEnd(end);
                    String campus = Utils.input("Campus: ");
                    if(!campus.isEmpty()) ((OfflineCourse) on).setCampus(campus);
                }
                return true;
            }
        }
        return false;
    }

    public boolean delete(String courseId) {
        for (Course course : courseList) {
            if (course.getCourseID().equalsIgnoreCase(courseId)) {
                courseList.remove(course);
                return true;
            }
        }
        return false;
    }

}
