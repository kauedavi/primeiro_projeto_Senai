package com.example;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner env =  new Scanner(System.in);
    
        System.out.println("Digite sua nota");
        int idade = env.nextInt();

        String verif = (idade < 18) ? "Menor de idade" : "Maior de idade";

        System.out.println(verif);

    }
}
