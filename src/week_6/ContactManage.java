/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class ContactManage {

    List<Contact> contactList = new ArrayList<>();

    public void input(Scanner sc, int id) {

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter group: ");
        String group = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        String fullName = firstName+" "+lastName;
        contactList.add(new Contact(id, fullName, firstName, lastName, group, address, phone));
    }
    public void display(){
        for(Contact cont: contactList){
            System.out.println(cont.toString());
        }
    }
    
    public void delete(int id){
        for(Contact cont: contactList){
            if(cont.getId() == id){
                contactList.remove(cont);
            }
        }
            
    }

}
