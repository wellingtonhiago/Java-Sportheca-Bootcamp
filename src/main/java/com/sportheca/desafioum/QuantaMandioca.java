package com.sportheca.desafioum;

import java.io.IOException;
import java.util.Scanner;

public class QuantaMandioca  {

    public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        // System.out.println("Quantas porções Chico irá comer? ");
        porcoes[0] *= leitor.nextInt();

        // System.out.println("Quantas porções Bento irá comer? ");
        porcoes[1] *= leitor.nextInt();

        // System.out.println("Quantas porções Bernardo irá comer? ");
        porcoes[2] *= leitor.nextInt();

        // System.out.println("Quantas porções Marina irá comer? ");
        porcoes[3] *= leitor.nextInt();

        // System.out.println("Quantas porções Lara irá comer? ");
        porcoes[4] *= leitor.nextInt();

        // Lembrando que Marlene sempre come 225 gramas
        int total = 225;
        for(int i = 0; i < porcoes.length; i++){
            total += porcoes[i];
        }
        // System.out.println("O total de mandiocas a ser preparada em gramas é: ");
        System.out.println(total);

    }
}