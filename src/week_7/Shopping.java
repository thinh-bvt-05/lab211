/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinhBui
 */
public class Shopping {
    private List<Fruit> fruitList;
    private List<Order> orderList;

    public Shopping() {
        this.fruitList = new ArrayList<>();
        this.orderList= new ArrayList<>();
    }

    public void setFruitListQuanlity(String fruitName, int quanlity) {
        for(Fruit fruit: fruitList){
            if(fruit.getFruitName().equalsIgnoreCase(fruitName)){
                fruit.setQuantity(fruit.getQuantity()-quanlity);
                return;
            }
        }
    }
    
    
    
    public void createFruit(int fruitID, String fruitName, double price, int quantity, String origin){
        fruitList.add(new Fruit(fruitID, fruitName, price, quantity, origin));
    }
    
    public Fruit getFruitByName(String fruitName){
        for(Fruit fruit: fruitList){
            if(fruit.getFruitName().equalsIgnoreCase(fruitName)){
                return fruit;
            }
        }
        return null;
    }
    
    public void createOrder(String customerName, ArrayList<OrderItem> item){
        Order order = new Order(customerName);
    }
    
    
    
}
