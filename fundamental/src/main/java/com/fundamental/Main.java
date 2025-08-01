package com.fundamental;

public class Main {

    static int varSec = 12345;

    public static void firstMethod(){
        
        int number = 12345;
        String city = "New York";
    
        boolean isFlag = true;
        char character = 'A';
        long phonenumber = 98765423562323L;

        double decimalValue = 234.432;
        
        System.out.println(number);
        System.out.println(isFlag);
        System.out.println(character);
        System.out.println(phonenumber);
        System.out.println(decimalValue);
        System.out.println(city);
    }

    public static void main(String[] args) {

        Main.firstMethod();

    }
}