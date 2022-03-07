package com.sportheca.desafioum;

import java.io.IOException;
import java.util.Scanner;

public class ImprevistosNatalinos{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int numAlunos = leitor.nextInt();

        System.out.print("Escreva um número: ");
        int numPc = leitor.nextInt();

        System.out.print("Escreva um número: ");
        int qtsPcsQuebrados = leitor.nextInt();

        System.out.print("Escreva um número: ");
        int qtsPcsSemComp = leitor.nextInt();

        if ((numPc - numAlunos - 1) >= (qtsPcsQuebrados + qtsPcsSemComp)) {
            System.out.println("Igor feliz!");

        } else {
            if ((numPc - numAlunos - 1) < (qtsPcsQuebrados + qtsPcsSemComp) && (qtsPcsQuebrados > (qtsPcsSemComp * 0.5)))
                System.out.println("Caio, a culpa é sua!");
            else
                System.out.println("Igor bolado!");
        }
    }

}
