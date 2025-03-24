/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_7;

/**
 *
 * @author ThinhBui
 */
public class OrderItem {
    private String productName;
    private int quanlity;
    private double price;
    private double amount;

    public OrderItem(String productName, int quanlity, double price) {
        this.productName = productName;
        this.quanlity = quanlity;
        this.price = price;
        this.amount = quanlity*price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "productName=" + productName + ", quanlity=" + quanlity + ", price=" + price + ", amount=" + amount + '}';
    }
    
    
    
}
