package com.dio.loop;

import java.util.Scanner;

public class MaiorEMedia {
    /*
    Faça um programa que leia 5 números
    e informe o maior número
    e a média desses números.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        int maior = 0;
        int total = 0;
        int media = 0;
        int opt = 0;

        System.out.println("Quantas vezes desejar executar?");
        opt = scanner.nextInt();
        do {
            System.out.println("Entre com um número");
            numero = scanner.nextInt();
            contador++;
            if(numero > maior) maior = numero;
            media = (total += numero / opt);
            System.out.println("Número maior: " + maior);
            System.out.println("Média dos números: " + media);

        } while(contador < opt);

//        for(int i = 0; i < 5; i++) {
//            System.out.println("Entre com um número");
//            numero = scanner.nextInt();
//
//            if(numero > maior) maior = numero;
//            total = total + numero;
//        }
//        System.out.println("Maior número: " + maior);
//        System.out.println("Media número: " + total / 5);

//        while(contador < 5) {
//            System.out.println("Insira um número");
//            numero = scanner.nextInt();
//            if(numero > maior) {
//                maior = numero;
//            }
//            total = total + numero;
//            contador + 1;
//        }
//        System.out.println("Maior número: " + maior);
//        System.out.println("Média de número: " + (total / 5));
    }
}
