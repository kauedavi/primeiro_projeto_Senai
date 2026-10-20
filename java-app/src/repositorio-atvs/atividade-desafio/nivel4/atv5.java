package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o primeiro valor: ");
       int a = input.nextInt();

       System.out.println("Digite o segundo valor: ");
       int b = input.nextInt();

       System.out.println("Valor A: "+a+"\nValor B: "+b);
        int repA = a;
        int repB = b;

         a = repB;
         b = repA;
        
        System.out.println("\nTroca de valores efetuada.");
        System.out.println("\nValor A: "+a+"\nValor B: "+b);
        }
}