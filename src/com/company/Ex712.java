package com.company;
import java.util.Scanner;

public class Ex712 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        int count = 0;
        int x = 0;
        int n = 0;
        while (x < arr.length) {
            System.out.println("\nEnter number: ");
            n = input.nextInt();
            if (n >= 10 && n <= 100) {
                boolean check = false;
                x++;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == n)
                        check = true;
                }
                if (!check) {
                    arr[count] = n;
                    count++;
                } else
                    System.out.printf("Duplicate!!! \n");
            } else
                System.out.println("Number must be between 10 and 100");
            for (int i = 0; i < x; i++) {
                if (arr[i] != 0)
                    System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

