package com.dio.loop;

import java.util.Scanner;

public class Nota {
    /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido
    e continue pedindo
    até que o usuário informe um valor válido.
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Informe uma nota entre 0 e 10 abaixo");
        nota = scanner.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Essa nota é inválida!");
            System.out.println("Digite novamente");
            nota = scanner.nextInt();
        }

    }

}
