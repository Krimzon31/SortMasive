package com.company;

import java.util.Random;

public class Main {

    public static void BubbleSort(int[][] arr) { // Сортировка пузырьком
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        int b = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = b;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        // Создаём двумерный массив и заполняем его рандомными числами
        int[][] Array = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                Array[i][j] = rand.nextInt(10);

            }
        }

        BubbleSort(Array);
        for (int[] ints : Array) {
            for (int j = 0; j < Array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
            System.out.println("+++++++++");
        }
}
