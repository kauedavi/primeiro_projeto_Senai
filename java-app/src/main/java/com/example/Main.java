package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        float totalVenda = 0;
        float valorRecebido = 0;
        int quantidadeDeVendas = 0;

        do{
             System.out.println("Faça sua compra: " + " quantidade: " + quantidadeDeVendas);
             valorRecebido = env.nextFloat();

             totalVenda = valorRecebido + totalVenda;

             quantidadeDeVendas ++;
           

        }while(quantidadeDeVendas < 5);

        System.out.println("total: " + quantidadeDeVendas);
    }

    
}