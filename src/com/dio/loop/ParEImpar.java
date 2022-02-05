package com.dio.loop;

import java.util.Scanner;

public class ParEImpar {
    /*
    Faça um programa que peça N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares.
    */

    public static void main(String[] args) {

        int qtdNumeros = 0;
        int count = 0;
        int numero = 0;
        int par = 0, impar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de números desejados");
        qtdNumeros = scanner.nextInt();

        do{
            System.out.println("Insira o número");
            numero = scanner.nextInt();
            if(numero %2 == 0) {
                par++;
            } else {
                impar++;
            }
            count++;
        }while(count < qtdNumeros);
        System.out.println("Quantida de números pares: " + par);
        System.out.println("Quantida de números impares: " + impar);
    }

}
