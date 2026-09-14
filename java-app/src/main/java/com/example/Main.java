package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        for (int quantidade = 0; quantidade <= 15; quantidade++) {

            System.out.println("Digite o produto");
            String produto = env.nextLine();

            System.out.println("Produto nº" + quantidade + " verificado. Tipo de produto: " + produto);
        }
    }
}