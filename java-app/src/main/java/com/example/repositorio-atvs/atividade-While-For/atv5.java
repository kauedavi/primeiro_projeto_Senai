package com.example;

public class atv5 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        float valorVenda = 0;
        float valorTotal = 0;
        char resposta;

        do {
            System.out.print("\nQual o valor do produto comprado?\nR$");
            valorVenda = env.nextFloat();

            valorTotal = valorTotal + valorVenda;
            System.out.println("\nVocê deseja continuar comprando?");
            resposta = env.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        System.out.println("Valor total da compra: R$" + valorTotal);
    }
}
