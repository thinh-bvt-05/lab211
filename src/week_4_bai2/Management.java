/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4_bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Management {

    Scanner sc = new Scanner(System.in);
    List<Student> manageStudent = new ArrayList<>();
    List<Teacher> manageTeacher = new ArrayList<>();
    List<Person> person = new ArrayList<>();

    public void inputStudent() {
        int n = Utils.checkInt("How many people do you want to input: ");
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.inputAll(sc);
            manageStudent.add(student);
        }
    }

    public void showStudent() {
        if (manageStudent.isEmpty()) {
            System.out.println("Is empty");
        } else {
            sortStudent();
            for (Student student : manageStudent) {
                System.out.println(student);
            }
        }
    }

    private void sortStudent() {
        Collections.sort(manageStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getYearOfAdmission(), o2.getYearOfAdmission());
            }

        });
    }

    public void inputTeacher() {
        int n = Utils.checkInt("How many people do you want to input: ");
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher();
            teacher.inputAll(sc);
            manageTeacher.add(teacher);
        }
    }

    public void showTeacher() {
        if (manageTeacher.isEmpty()) {
            System.out.println("Is empty");
        } else {
            sortTeacher();
            for (Teacher teacher : manageTeacher) {
                System.out.println(teacher);
            }
        }
    }

    private void sortTeacher() {
        Collections.sort(manageTeacher, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return Integer.compare(o2.getYearProfession(), o1.getYearProfession());
            }

        });
    }

    public void searchPerson() {
        String name = Utils.checkName("Enter name to find: ");
        for (Person p : manageTeacher) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p.toString());
            }
        }
        for (Person p : manageStudent) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p.toString());
            }
        }

    }
    public void printAllPerson(){
        person.addAll(manageTeacher);
        person.addAll(manageStudent);
        sortPerson();
        for(Person p: person){
            System.out.println(p.getId()+" - "+p.getName()+" - "+p.getPhone()+" - "+p.getYearOfBirth()+" - "+p.getMajor());
        }
    }
    private void sortPerson(){
        Collections.sort(person, new Comparator<Person>(){
                @Override
                public int compare(Person o1, Person o2) {
                    return Integer.compare(o1.yearOfBirth, o2.yearOfBirth);
                }
                
            });
    }
    
}
