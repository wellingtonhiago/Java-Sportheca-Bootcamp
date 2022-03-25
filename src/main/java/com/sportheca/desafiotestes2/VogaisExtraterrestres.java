package com.sportheca.desafiotestes2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VogaisExtraterrestres {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vowel;
        String sentence;
        int count;
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            count = 0;
            vowel = scan.nextLine();
            sentence = scan.nextLine();

            for (int i = 0; i < vowel.length() ; i++) {
                for (int j = 0; j < sentence.length(); j++) {
                    if (sentence.charAt(j) == vowel.charAt(i)) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
