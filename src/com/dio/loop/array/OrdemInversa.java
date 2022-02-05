package com.dio.loop.array;

public class OrdemInversa {

    /*
    Crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
    */

    public static void main(String[] args) {
        int[] vetor = {4, -5, 3, -8, 12, 35};
        int count = 0;

        System.out.println("Vetor: ");
        while(count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println();
//        for(int i = (vetor.length - 1); i >= 0; i--) {
//            System.out.print(vetor[i] + " ");
//        }

//        count = (vetor.length - 1);
//        while(count >= 0) {
//            System.out.print(vetor[count] + " ");
//            count--;
//        }

        count = (vetor.length - 1);
        do{
            System.out.print(vetor[count] + " ");
            count--;
        }while(count >= 0);

    }

}
