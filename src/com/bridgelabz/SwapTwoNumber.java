package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers to swap : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp = 0;
        System.out.println("Before swapping : " + num1 + " and " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping : " + num1 + " and " + num2);
    }
}
