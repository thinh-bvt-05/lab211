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

    void decimalToBinary() {
        int subNumber = Integer.parseInt(number);
        String result = "";
        if (subNumber == 0) {
            result = "0";
        } else {
            while (subNumber > 0) {
                result = (subNumber % 2) + result;
                subNumber = subNumber / 2;
            }
        }

        System.out.print("Binary value: "+result);
        System.out.println();

    }

    int binaryToDecimal() {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(number.length() - 1 - i);
            if (c == '1') {
                result = (int) (result + Math.pow(2, i));
            }
        }
        System.out.print("Decimal value: "+result);
        System.out.println();
        return result;
    }

    String decimalToHexa() {
        int subNumber = Integer.parseInt(number);
        String result = "";
        if (subNumber == 0) {
            result = "0";
        } else {
            while (subNumber > 0) {
                int remainder = subNumber % 16;
                if (remainder > 9) {
                    result = (char) ('A' + remainder - 10) + result;
                } else {
                    result = remainder + result;
                }
                subNumber = subNumber / 16;
            }

        }
        System.out.print("Hexa value: "+result);
        System.out.println();
        return result;

    }

    int hexaToDecimal() {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            char character = number.charAt(number.length() - 1 - i);
            int temp = 0;
            if (character >= '0' && character <= '9') {
                temp = character - '0';
            } else if (character >= 'a' && character <= 'f') {
                temp = character - 'a' + 10;
            } else if (character >= 'A' && character <= 'F') {
                temp = character - 'A' + 10;
            }
            result = (int) (result + temp * Math.pow(16, i));
        }
        System.out.print("Decimal value: "+result);
        System.out.println();
        return result;
    }

    void hexaToBinary() {
        int decimal = hexaToDecimal();
        this.number = String.valueOf(decimal);

        decimalToBinary();
    }

    void binaryToHexa() {
        int decimal = binaryToDecimal();
        this.number = String.valueOf(decimal);
        decimalToHexa();
    }
}
