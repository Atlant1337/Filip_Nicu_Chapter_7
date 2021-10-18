package com.company;
import java.util.Scanner;

public class Ex714Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ex714 tst = new Ex714();
        System.out.printf("Input the numbers : %n");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        System.out.printf("\nn1 * n2 = %d%n", tst.calc(n1, n2));
        System.out.printf("n1 * n2 * n3 = %d%n", tst.calc(n1, n2, n3));
        System.out.printf("n1 * n2 * n3 * n4 = %d%n", tst.calc(n1, n2, n3, n4));
        System.out.printf("n1 * n2 * n3 * n4 * n5 = %d%n", tst.calc(n1, n2, n3, n4, n5));

    }
}
