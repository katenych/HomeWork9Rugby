package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] lazyArray = new int[25];

        Random random = new Random();
        int summ = 0;
        int summ2 = 0;
        System.out.println("Team 1");
        for (int i = 0; i < lazyArray.length; i++) {
            lazyArray[i] = random.nextInt(18, 40);
            System.out.print(lazyArray[i] + " ");
            summ += lazyArray[i];
        }
        System.out.println();
        System.out.println("Average: " + summ/lazyArray.length);

        System.out.println();
        System.out.println("Team 2");
        for (int j = 0; j < lazyArray.length;j++) {
            lazyArray[j] = random.nextInt(18, 40);
            System.out.print(lazyArray[j] + " ");

            summ2 += lazyArray[j];
        }
        System.out.println();
        System.out.println("Average: " + summ2/lazyArray.length);
    }
}
