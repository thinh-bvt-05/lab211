/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_6_bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinhBui
 */
public class WorkerManagement {
    
    List<Worker> workList = new ArrayList<>();
    
    public void addWorker(Worker w){
        workList.add(w);
    }
    
    public void getInformation(){
        for(Worker w : workList){
            for(Salary s : w.getSalaryHistory()){
                System.out.println(w.toString()+""+s.toString());
            }
        }
    }
    
    public void changeUpSalary(String id, double money){
        for(Worker w: workList){
            if(w.getCode().equalsIgnoreCase(id)){
                w.addSalary(new Salary(money,"Up", java.time.LocalDate.now().toString()));
            }
        }
    }

}
