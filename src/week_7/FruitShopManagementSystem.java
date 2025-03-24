/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_7;

import java.util.ArrayList;

/**
 *
 * @author ThinhBui
 */
public class FruitShopManagementSystem {
    public static void main(String[] args) {
        
        Shopping shop = new Shopping();
        shop.createFruit(1, "Apple", 1.0, 100, "USA");
        shop.createFruit(2, "Mango", 2.0, 50, "India");
        shop.createFruit(3, "Banana", 0.5, 200, "Vietnam");
        
        ArrayList<OrderItem> bag1 = new ArrayList<>();
        OrderItem item1 = new OrderItem("Apple", 10, 1.5);
        OrderItem item2 = new OrderItem("Mango", 10, 2.5);
        bag1.add(item1);
        bag1.add(item2);
        
        
        shop.createOrder("Hung", bag1);
        shop.setFruitListQuanlity("Apple", 10);
        shop.setFruitListQuanlity("Mango", 10);
        
        ArrayList<OrderItem> bag2= new ArrayList<>();
        item1 = new OrderItem("Banana", 10, 1.5);
        item2 = new OrderItem("Mango", 10, 2.5);
        bag2.add(item1);
        bag2.add(item2);
        shop.setFruitListQuanlity("Banana", 10);
        shop.setFruitListQuanlity("Mango", 10);
        
        shop.createOrder("Quang", bag2);
        
        
        
        
    }
}
