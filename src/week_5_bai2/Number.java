/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_5_bai2;

/**
 *
 * @author ThinhBui
 */
public class Number {
    private String value;
    
    public String getValue(){
        return value;
    }
    
    public Number(String value){
        this.value=value;
    }
    
    public Number addTwoNum(Number other){
        
        return new Number(addLargeNum(this.value, other.value));
    }
//    public Number addTwoNum(Number other){
//        
//        return new Number(addLargeNum(this.value, other.value));
//    }
    
    public String addLargeNum(String so1, String so2){
        
        
        int max = Math.max(so1.length(), so2.length());
        so1=String.format("%"+max+"s", so1).replace(' ', '0');
        so2=String.format("%"+max+"s", so2).replace(' ', '0');
        
        StringBuilder result = new StringBuilder();
        //gia su 2 so do dai bang nhau
        int soDu= 0;
        for(int i=so1.length()-1;i>=0;i--){
            int s1 = so1.charAt(i) - '0';
            int s2 = so2.charAt(i) - '0';
            int sum = s1+s2+soDu;
            result.append(sum % 10);
            soDu = sum / 10;
        }
        
        if(soDu > 0){
            result.append(soDu);
            
        }
        
        return result.reverse().toString();
    }
    
    private String multiplyLargeNum(String n1, String n2){
        int[] result = new int[n1.length()+n2.length()];
        String temp = "";
        for(int i=n1.length()-1;i>=0;i--){
            int digit1= n1.charAt(i) - '0';
            for(int j = n2.length() - 1; j >=0; j--){
                int digit2 = n2.charAt(j) - '0';
                int product = digit1*digit2;
                
                int index = i+j+1;
                int sum=product + result[index];
                result[index] = sum%10;
                result[index-1]+=sum/10;
            }
        }
        for(int i = 0; i<result.length;i++){
            temp=temp+result;
        }
        return temp;
    }
    
}
