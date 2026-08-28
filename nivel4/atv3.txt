package com.example;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
 
       System.out.print("Digite a quantidade percorrida em km: ");
       float distancia = input.nextFloat();
 
       System.out.print("Digite a quantidade gasta de combustível (litros): ");
       float combustivel = input.nextFloat();
 
       float consumoMedio = distancia / combustivel;
 
       System.out.println("Você gastou em média "+consumoMedio+"L/KM");
 
 
    }
}