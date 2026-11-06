package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Digite o seu peso em KG: ");
        float peso = input.nextFloat();
        System.out.print("Digite a sua altura (em metros): ");
        float altura = input.nextFloat();

        float imc = peso / (altura*altura);
        System.out.println("O seu IMC é de: "+imc);

    }
}