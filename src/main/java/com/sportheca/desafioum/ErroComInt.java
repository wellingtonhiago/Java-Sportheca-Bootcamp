package com.sportheca.desafioum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErroComInt {

    public static void main(String[] args) {
        boolean numeroValido = false;
        Scanner scan = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("Enter a number : ");
            if(scan.hasNextInt()){
                number = scan.nextInt();
                numeroValido = true;
            }else{
                scan.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!numeroValido);
    }
}
