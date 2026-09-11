package com.example;

import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println("Cargo:");
        String input = env.nextLine();

   
         String verif = input.equalsIgnoreCase("administrativo") || input.equalsIgnoreCase("lideranca") ? "Você pode fazer o curso de idiomas" : "Você não pode fazer o curso de idiomas"; 

        System.out.print(verif);

    }
}