/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week3;

import java.util.Random;

/**
 *
 * @author ThinhBui
 */
public class BubbleSort {
    private int[] array;

    public BubbleSort(int n) {
        this.array = new int[n];
    }
    
    void addValue(){
        Random ran = new Random();
        for(int i =0; i < array.length;i++){
            array[i] = ran.nextInt(array.length);
        }
    }
    void showArray() {
       // System.out.print("The array: ");
        for (int print : array) {
            System.out.print(print + " ");
        }
        System.out.println("");
    }
    
    
    void bubbleSort(){
        addValue();
        System.out.print("Unsorted array: ");
        showArray();
        boolean check = false;
        for(int i =0;i<array.length-1 && !check;i++){
            check = true;
            for(int j = 0; j < array.length - i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    check = false;
                }
            }
            
        }
        System.out.print("Sorted array: ");
        showArray();
    }

}
