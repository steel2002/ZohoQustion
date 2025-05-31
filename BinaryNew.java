
// File: BinaryNew.java

import java.util.Scanner;

public class BinaryNew {

    public static void binary(int n){
        String str="";
        while(n >0){
            str=(n % 2) + str;
            n = n / 2;
        }
        System.out.println("Binary: " + str);
    }

    // octal value 

    static void octal(int n){
            String str="";
            while(n >0){
                str=(n % 8) + str;
                n = n / 8;
            }
            System.out.println("Octal: " + str);
        }
    // hexadecimal value

    static void hexadecimal(int n){
        String str="";
        String hex="0123456789ABCDEF";
        while(n >0){
            str=hex.charAt(n % 16) + str;
            n = n / 16;
        }
        System.out.println("Hexadecimal: " + str);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  number: ");
        int n = scan.nextInt();
        binary(n);
        octal(n);
         hexadecimal(n);
    }
    
}
