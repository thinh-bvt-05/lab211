/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinhBui
 */
public class CourseManagement {
    
    List<OnlineCourse> onlineCourse = new ArrayList<>();
    List<OfflineCourse> offlineCourses = new ArrayList<>();
    
    public boolean addOnlineCourse(OnlineCourse on){
        onlineCourse.add(on);
        return true;
    }
    
    public void showOnline(){
        for(OnlineCourse on: onlineCourse){
            System.out.println(on.toString());
        }
    }
    
    public boolean remove(String idCourse){
        for(OnlineCourse on: onlineCourse){
            if(on.getCourseID().equalsIgnoreCase(idCourse)){
                onlineCourse.remove(on);
                return true;
            }
        }
        return false;
    }
    

}
