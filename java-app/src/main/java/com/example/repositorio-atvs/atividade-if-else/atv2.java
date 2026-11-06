package com.example;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner env =  new Scanner(System.in);
    
        System.out.println("Digite sua nota");
        int nota = env.nextInt();

        String verif = (nota < 7) ? "Reprovado, otario" : "Aprovado, VAMOOO!";

        System.out.println(verif);

    }
}
