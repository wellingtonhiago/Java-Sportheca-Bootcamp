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

        double total = 225;
        boolean valorValido = false;
        int i = 0;

        do{
            if(leitor.hasNextDouble()){
            System.out.println("Entre com a quantidade de porções: ");
                porcoes[i] *= (double) leitor.nextDouble();
                total += porcoes[i];
                i++;
                if(i == porcoes.length) valorValido = true;
            }else{
                leitor.nextLine();
            System.out.println("Valor inválido, entre com um valor inteiro: ");
            }
        }while(!valorValido);


        // System.out.println("O total de mandiocas a ser preparada em gramas é: ");
        System.out.println(total);

    }
}