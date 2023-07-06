package com.example.java.utilities;

import java.util.Scanner;

public class InputHelfer {
     public static String getInput(String prompt){      //static ... sadece ayni package icinde olursa erisim saglar package disinda da calismasi icin public static ...
        Scanner scan=new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextLine();
    }
//    public static String getInput(String prompt){      //static keyword kaldirilarak instance method yöntemiyle erisim saglaniyor.
//        Scanner scan=new Scanner(System.in);
//        System.out.println(prompt);
//        return scan.nextLine();
//    }
}
