package com.example;

public class atv4 {
     public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        int quantidade = 1;
        int notasPesquisa = 0;
        int totalPesquisa = 0;

        while(quantidade <= 10){

            System.out.print("Qual seu nível de satisfação com nossos produtos? avaliação " + quantidade+ " (0/10)\n");
            notasPesquisa = env.nextInt();
            quantidade++;
            totalPesquisa = totalPesquisa + notasPesquisa;

        }
        System.out.println("total das pesquisas:" + quantidade);
    }
}
