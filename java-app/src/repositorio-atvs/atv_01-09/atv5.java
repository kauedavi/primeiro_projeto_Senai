package com.example;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner env =  new Scanner(System.in);
    
       int acao = env.nextInt();

       switch (acao) {
        case 1:
            System.out.println("Hoje é domingo");
            break;

            case 2:
            System.out.println("Hoje é segunda");
            break;
            
            case 3:
            System.out.println("Hoje é terca");
            break;

            case 4:
            System.out.println("Hoje é quarta");
            break;

            case 5:
            System.out.println("Hoje é quinta");
            break;

            case 6:
            System.out.println("Hoje é sexseven");
            break;

            case 7:
            System.out.println("Hoje é sabado");
            break;

       
        default:
             System.out.println("Erro.");
            break;
       }
        

    }
}