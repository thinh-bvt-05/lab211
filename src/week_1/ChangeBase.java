/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_1;


public class ChangeBase {
    private String number;

    public ChangeBase(String number) {
        this.number = number;
    }
    
    
    void decimalToBinary(){
        int subNumber = Integer.parseInt(number);
        String result="";
        if(subNumber == 0){
            result = "0";
        }else{
            while(subNumber > 0){
                result = (subNumber % 2) + result;
                subNumber = subNumber / 2;
            }
        }
       
        System.out.println(result);
       
    }
    
    void binaryToDecimal(){
        int result=0;
        
        for(int i =0; i < number.length();i++ ){
            char c = number.charAt(number.length()-1-i);
            if(c == '1'){
                result=result+(2*i);
            }
        }
        System.out.println(result);
    }
    
    void hexaToBinary(){
        int subNumber = Integer.parseInt(number);
        String result="";
        if(subNumber == 0){
            result = "0";
        }else{
            while(subNumber > 0){
                result = subNumber % 16;
                subNumber = subNumber / 16;
            }
        }
       
        System.out.println(result);
       
    }
            

}
