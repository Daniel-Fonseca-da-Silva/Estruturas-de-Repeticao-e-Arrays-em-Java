package com.dio.loop;

import java.util.Scanner;

public class Fatorial {
    /*
    Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
    */

    public static void main(String[] args) {

        int fatorial = 0;
        int multiplicacao = 1;

        System.out.println("Entre com um número");
        Scanner scanner = new Scanner(System.in);
        fatorial = scanner.nextInt();

        for(int i = fatorial; i > 1; i--) {
            multiplicacao = multiplicacao * i; //54321
        }
        System.out.println(multiplicacao);

//        while(fatorial >= 1) {
//            multiplicacao = multiplicacao * fatorial;
//            fatorial--;
//        }
//        System.out.println(multiplicacao);

//        do{
//            multiplicacao = multiplicacao * fatorial;
//            fatorial--;
//        }while(fatorial >= 1);
//        System.out.println(multiplicacao);
    }

}
