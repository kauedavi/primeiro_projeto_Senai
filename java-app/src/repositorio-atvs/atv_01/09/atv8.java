package com.example;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println("Possui carro? sim/nao");
        String input = env.nextLine();

   
         String verif = input.equalsIgnoreCase("sim") ? "Você tem direito ao auxilio combustivel" : "Você não tem direito ao auxilio combustivel"; 

        System.out.print(verif);

    }
}