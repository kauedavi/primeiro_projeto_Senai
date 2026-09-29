package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        float[] temperaturaDiaria = new float[10];

        int dia = 1;

        for (int i = 0; i < temperaturaDiaria.length; i++) {
            System.out.println("temperatura do dia " + dia);
            dia++;
            temperaturaDiaria[i] = env.nextFloat();
        }
    }

}