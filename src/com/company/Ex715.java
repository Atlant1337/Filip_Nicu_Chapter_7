package com.company;

public class Ex715 {
    public static void main(String[] args) {

        int[] array;

        array = new int[(args.length >= 1) ? Integer.parseInt(args[0]) : 10];

        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
