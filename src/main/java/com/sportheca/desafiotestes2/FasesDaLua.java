package com.sportheca.desafiotestes2;

import java.util.Scanner;

public class FasesDaLua {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        } else if (fim >= inicio && inicio >= 3 && fim <= 96) {
            System.out.println("crescente");
        } else if (fim <= inicio && inicio <= 96 && fim >= 3){
            System.out.println("minguante");
        }else {
            System.out.println("cheia");
        }

    }
}
