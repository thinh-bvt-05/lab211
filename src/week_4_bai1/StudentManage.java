/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4_bai1;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class StudentManage {

    private List<Student> array;
    private Scanner sc = new Scanner(System.in);

    public StudentManage() {
        array = new ArrayList<>();
    }

    private boolean checkStudent(Student student) {
        if (student == null) {
            return false;
        }
        for (Student st : array) {
            if (st.getSemester().equalsIgnoreCase(student.getSemester())
                    && st.getCourseName().equalsIgnoreCase(student.getCourseName())
                    && st.getStudentName().equalsIgnoreCase(student.getStudentName())
                    && st.getId().equalsIgnoreCase(student.getId())) {
                return false;
            }
        }
        return true;
    }

    public boolean addStudent(Student student) {
        if (student != null && checkStudent(student)) {
            array.add(student);
            return true;
        }

        return false;
    }

    public List<Student> findAndSort() {
        List<Student> tempName = new ArrayList();
        System.out.println("Enter name to find: ");
        String name = sc.nextLine();
        for (Student st : array) {
            if (st.getStudentName().equalsIgnoreCase(name)) {
                tempName.add(st);
            }
        }
        Collections.sort(tempName, new Comparator<Student>() {
           @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentName().compareTo(o2.getStudentName());
            }
            

        });
        if(tempName.isEmpty()){
            System.out.println("No student found by name");
            return tempName;
        }
        
        System.out.printf("%-15s %-15s %-15s\n", "Name", "Semester", "Course Name");

        for (Student student : tempName) {
            System.out.printf("%-15s %-15s %-15s\n", student.getStudentName(), student.getSemester(), student.getCourseName());
        }
        return tempName;
    }

    public void deleteOrUpdate() {
        System.out.println("Enter id to find: ");
        String id = sc.nextLine();
        for (Student student : array) {
            if (student.getId().equalsIgnoreCase(id)) {
                System.out.println(student.toString());
                while (true) {
                    System.out.println("1. Delete");
                    System.out.println("2. Update");
                    System.out.println("Your choice: ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            if (deleteStudent(id) == 1) {
                                System.out.println("Delete success!");
                                showStudent();
                            } else {
                                System.out.println("Delete fail!");
                            }
                            return;
                        case 2:
                            if (update(student) == 1) {
                                System.out.println("Update success!");
                                
                            } else {
                                System.out.println("Update fail!");
                            }
                            return;
                        default:
                            System.out.println("Invalid!! Choice 1 or 2.");
                    }
                }
            }
            

        }
        System.out.println("Not found student with ID: "+id);
    }

    public int deleteStudent(String id) {
        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.get(i).getId().equalsIgnoreCase(id)) {
                array.remove(i);
                return 1;
            }
        }
        return 0;
    }

    public int update(Student student) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getId().equalsIgnoreCase(student.getId())) {
                System.out.println("Enter id to update: ");
                String id = sc.nextLine();
                System.out.println("Enter name to update: ");
                String name = sc.nextLine();
                System.out.println("Enter semester to update: ");
                String semester = sc.nextLine();
                System.out.println("Enter course name to update: ");
                String course = sc.nextLine();
                student.setId(id);
                student.setStudentName(name);
                student.setSemester(semester);
                student.setCourseName(course);
                System.out.println(array.get(i).toString());
                return 1;
            }
        }

        return 0;
    }

    public void sortStudent() {
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentName().compareTo(o2.getStudentName());
            }

        });
    }

    public void showStudent() {
        if(array.isEmpty()){
            System.out.println("The list is empty!");
        }else{
        for (Student i : array) {
            System.out.println(i);
        }
        }
    }

    public void reportStudent() {
        Map<String, Integer> report = new HashMap<>();
        for(Student student: array){
            String key =  student.getStudentName()+" | " + student.getCourseName();
            report.put(key, report.getOrDefault(key, 0)+1);
        }
        System.out.println("The report as below: ");
        for(Map.Entry<String,Integer> entry : report.entrySet()){
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }
    }

}
