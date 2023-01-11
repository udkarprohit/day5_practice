package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i = 2; i < num; i++){
            while (num % 2 == 0)
            {
                System.out.println(i + " ");
                num = num / i;
//                count++;
//                break;
            }
        }

        if(num > 2){
            System.out.println(num);
        }


//        if(count == 0){
//            System.out.println("is prime" + num);
//        } else {
//            System.out.println("is not a prime");
//        }


    }
}
