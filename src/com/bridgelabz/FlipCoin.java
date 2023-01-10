package com.bridgelabz;

public class FlipCoin {
    public static void main(String[] args) {
        double arr[] = new double[10];
        double per=0,per1=0;
        if (arr.length >= 0)
        {
            for (int i = 0; i < arr.length;i++) {
                double flipCoin = (Math.random() * 10 ) % 2 ;
                if (flipCoin < 0.5) {
                    System.out.println("Tail " + flipCoin);
                    per1 = flipCoin/ arr.length * 100;
                } else {
                    System.out.println("Head " + flipCoin);
                    per = flipCoin/ arr.length * 100;
                }
            }
            System.out.println("Tail " + per1 + " Heads " + per);

        }
    }
}
