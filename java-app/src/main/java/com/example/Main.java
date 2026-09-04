package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println("Salario:");
        float salario = env.nextFloat();

        System.out.println("parcela:");
         float parcela = env.nextFloat();
   
        float porcentagem = salario * 0.3f;

       
         String verif = parcela <= porcentagem ? "A parcela está dentro 30%" : "A parcela está fora dos 30%"; 

        System.out.print(verif);

    }
}