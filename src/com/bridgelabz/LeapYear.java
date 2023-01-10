package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(year >= 1000 && year <= 9999)
        {
            if(year % 4 == 0)
            {
                System.out.println("Leap year");
            } else {
                System.out.println("Not an leap year");
            }
        } else {
            System.out.println("Enter the 4 digit number");
        }
    }
}
