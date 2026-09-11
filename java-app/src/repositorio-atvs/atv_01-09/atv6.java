package com.example;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner env =  new Scanner(System.in);
        
        float salarioFuncionario = env.nextInt();

        if(salarioFuncionario <= 4000){
            System.out.print("Você tem direito ao VR.");
        } else{
             System.out.print("Você não tem direito ao VR.");
        }
    }
}