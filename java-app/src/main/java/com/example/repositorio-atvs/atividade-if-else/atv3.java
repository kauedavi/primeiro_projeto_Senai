package com.example;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner env =  new Scanner(System.in);
    
        System.out.println("Digite v1");
        int v1 = env.nextInt();

        System.out.println("Digite v2");
        int v2 = env.nextInt();

        if(v1 > v2){
            System.out.println("Valor: " + v1 + " maior!");
        } else if (v1 < v2){
            System.out.println("Valor: " + v1 + " menor!");
        } else if (v1 == v2){
            System.out.println("Valor: " + v1 + " e " + v2 +  " São iguais!");
        } else {
            System.out.println("Erro ao executar!");
        }

    }
}