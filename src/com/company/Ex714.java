package com.company;

public class Ex714 {
    public static int calc(int... n) {
        int r = 1;
        for (int i = 0; i < n.length; i++) {
            r *= n[i];
        }
        return r;
    }
}