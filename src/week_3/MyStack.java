/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_3;

import java.util.Stack;

/**
 *
 * @author ThinhBui
 */
public class MyStack {

    private int stackValue;

    public MyStack(int stackValue) {
        this.stackValue = stackValue;
    }

    public MyStack() {
    }
    
    
    Stack<Integer> stack = new Stack<>();
    
    void push(int x){
        stack.push(x);
    }
    void pop(){
        if(!stack.isEmpty()){
        System.out.println(stack.pop());}
        else{
            System.out.println("stack is emptty");
        }
    }
    void getAt(int index){
        try {
            System.out.println(stack.get(index));
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    
    
}
