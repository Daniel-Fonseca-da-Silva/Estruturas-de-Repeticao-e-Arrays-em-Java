package com.dio.loop;

import java.util.Scanner;

public class Tabuada {
    /*
    Desenvolva um gerador de tabuada,
    capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
    O usuário deve informar de qual numero ele deseja ver a tabuada.
    A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
*/

    public static void main(String[] args) {

        int qtdTabuada = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a tabuada desejada");
        qtdTabuada = scanner.nextInt();
        System.out.println(qtdTabuada);

        for(int i = 1; i <= 10; i++) {
            System.out.println(qtdTabuada + "X" + i + " = " + qtdTabuada * i);
        }

//        while(count <= 10) {
//            System.out.println(qtdTabuada + "X" + count + " = " + qtdTabuada * count);
//            count++;
//        }

//        do{
//            System.out.println(qtdTabuada + "X" + count + " = " + qtdTabuada * count);
//            count = count + 1;
//        }while(count <= 10);

    }

}
