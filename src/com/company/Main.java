package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] m1 = new int[100];
        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = -500 + random.nextInt(1000);
        }
        for (int i = 0; i < m1.length; i++) {
            System.out.println(i+":"+m1[i]);
        }
            int[] m2 = new int[100];
        int j = 0;
        for (int i = 0; i < m2.length; i++) {
            int a = i % 2;
            if (m1[i] > 0 && a == 0) {
                m2[j] = m1[i];
                j++;
            }
        }
        for (int i = 0; i < m2.length; i++) {
            System.out.println(i+":"+m2[i]);
        }
    }
}
