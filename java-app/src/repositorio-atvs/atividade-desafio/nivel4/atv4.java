package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite seu salario por hora:");
        float salarioHora = input.nextFloat();

        System.out.println("Digite suas horas trabalhadas:");
        float horaTrabalhada = input.nextFloat();

        float result =  salarioHora * horaTrabalhada;


        System.out.println("Salario bruto:" + result);
        }
}
