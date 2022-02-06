package com.dio.loop.array;

import java.util.Scanner;

public class Consoante {

    /*
    Faça um Programa que leia um vetor de 6 caracteres,
    e diga quantas consoantes foram lidas.
    Imprima as consoantes.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scanner.next();

            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;

        } while(count < consoantes.length);

        for(String consoante : consoantes) {
            if(consoante != null)
                System.out.println(consoante);
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

    }

}
