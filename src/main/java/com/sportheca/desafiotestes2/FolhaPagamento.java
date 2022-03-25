package com.sportheca.desafiotestes2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FolhaPagamento {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int valor1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double valorHora = Double.parseDouble(st.nextToken());

        System.out.println("NUMBER = " + valor1);
        System.out.println(String.format("SALARY = U$ %.2f", (valor2*valorHora)));


    }
}
