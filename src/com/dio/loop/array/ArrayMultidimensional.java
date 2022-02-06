package com.dio.loop.array;

import java.util.Random;

public class ArrayMultidimensional {
    /*
    Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
    */

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++) {
            for(int x = 0; x < M[i].length; x++) {
                M[i][x] = random.nextInt(9);
            }
        }

        System.out.println("Matriz");
        for(int[] linha : M) {
            for(int elementoDacoluna : linha) {
                System.out.print(elementoDacoluna + " ");
            }
            System.out.println();
        }

    }

}
