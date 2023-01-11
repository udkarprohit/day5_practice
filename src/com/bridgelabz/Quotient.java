package com.bridgelabz;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Num1 : ");
        int num2 = sc.nextInt();
        int quotientNum = 0,remainderNum = 0;

        quotientNum = num1 / num2;
        System.out.println("quotient : " + quotientNum);
        remainderNum = num1 % num2;
        System.out.println("Remainder : " + remainderNum);
    }
}
