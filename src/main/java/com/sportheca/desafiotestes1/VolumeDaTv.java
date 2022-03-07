package com.sportheca.desafiotestes1;

import java.io.IOException;
import java.util.Scanner;

public class VolumeDaTv  {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int V = leitor.nextInt(); //Volume inicial
        int T = leitor.nextInt(); //Trocas de volume
        for (int i = 0; i < T; i++) {
            V += leitor.nextInt();
            if (V > 100){
                V = 100;
            }
            if (V < 0){
                V = 0;
            }
        }
        System.out.println(V);
    }

}
