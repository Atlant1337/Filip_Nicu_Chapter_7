package com.company;
import java.util.Random;

public class Ex717 {
    public static void main(String [] args){
        Random th = new Random();
        int d1, d2, sum;
        int [] freq = new int [13];
        for (int i = 0; i <= 36000; i++) {
            d1 = th.nextInt(6)+1;
            d2 = th.nextInt(6)+1;
            freq[d1+d2]++;
            sum = d1 + d2;
        }
        System.out.printf("Sum\t\t\tFrequency\n");
        System.out.printf("---------------------\n");
        for (int i = 2; i < freq.length; i++) {
            System.out.printf("%d\t\t\t%d\t\t\t\n",i,freq[i]);
        }
    }
}