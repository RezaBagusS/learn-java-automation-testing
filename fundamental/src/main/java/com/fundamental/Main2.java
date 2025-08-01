package com.fundamental;

public class Main2 {
    
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Team";

        int a = 200;
        int b = 300;

        System.out.println(str1 + " " + str2);
        System.out.println(a + b);
        
        System.out.println(a + b + str1 + str2);
        System.out.println(str1 + str2 + a + b);

        if (a < 1000) {
            System.out.println("A kurang dari 1000");
        } else {
            System.out.println("A lebih dari 1000");
        }
    
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            default:
            System.out.println("Its weekend bro");
                break;
        }
        
    }

}
