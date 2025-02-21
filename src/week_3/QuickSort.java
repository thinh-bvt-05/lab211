/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_3;

import java.util.Random;

/**
 *
 * @author ThinhBui
 */
public class QuickSort {

    private int[] array;

    public QuickSort(int n) {
        this.array = new int[n];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    void addValue() {
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
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
    
    public int partition(int[] arr, int left, int right){
        int i = left;
        int j = right;
        int pivot = (arr[left] + arr[right])/2;
        while(i <= j){
        while(arr[i] < pivot){
            i++;
        }
        while(arr[j] > pivot){
            j--;
        }
        if(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        }
        return i;
    }
    
    void quickSort(int[] arr, int left, int right){
        int i = partition(arr, left, right);
        if(i < right){
            quickSort(arr, i, right);
        }
        if(left < i-1){
            quickSort(arr, left, i-1);
        }
        
    }

}
