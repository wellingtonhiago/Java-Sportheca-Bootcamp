package com.sportheca.desafioum;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuantaMandioca  {

    public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

      // porcoes[0] Chico
      // porcoes[1] Bento
      // porcoes[2] Bernardo
      // porcoes[3] Marina
      // porcoes[4] Lara

        int total = 225;
        boolean valorValido = false;
        int i = 0;

        for (i = 0; i< porcoes.length; i++) {
            try {
                porcoes[i] *= leitor.nextInt();
                total += porcoes[i];
            }  catch (InputMismatchException e) {
                System.out.println("Entre com um inteiro: ");
                porcoes[i] *= leitor.nextInt();
            }
        }


        // System.out.println("O total de mandiocas a ser preparada em gramas é: ");
        System.out.println(total);

    }
}