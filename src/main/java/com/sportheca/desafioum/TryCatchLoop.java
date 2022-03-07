package com.sportheca.desafioum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchLoop {
    public static void main(String[] args) {

        boolean wenttocatch;
        int number_of_rigons = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                wenttocatch = false;
                number_of_rigons = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                wenttocatch = true;
                System.out.println("xx");
            }
        } while (wenttocatch == true);
    }
}
