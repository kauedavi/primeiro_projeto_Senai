package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o valor em real:");
        float real = input.nextFloat();

        System.out.println("Digite a cotacao atual");
        float cotacao =  input.nextFloat();


        float convercao = real / cotacao;
        
        System.out.println("O valor do real em dolar é:" + convercao);
    }
}