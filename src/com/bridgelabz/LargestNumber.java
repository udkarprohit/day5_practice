package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter value of c : ");
        int c = sc.nextInt();
        if(a >= b)
        {
            if(a >= c){
                System.out.println("a is grater");
            } else {
                System.out.println("c is grater");
            }
        } else {
            if (b >= c)
            {
                System.out.println("b is grater");
            }else {
                System.out.println("c is grater");
            }
        }
    }
}
