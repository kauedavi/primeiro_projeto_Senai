public class ex9 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        double[][] fertilidade = new double[6][6];

        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                System.out.print("Digite o índice de fertilidade da posição [" +
                        linha + "][" + coluna + "]: ");
                fertilidade[linha][coluna] = env.nextDouble();
            }
        }

        for (int linha = 0; linha < 6; linha++) {
            double soma = 0;

            for (int coluna = 0; coluna < 6; coluna++) {
                soma += fertilidade[linha][coluna];
            }

            double media = soma / 6;

            System.out.println("Média de fertilidade da linha " +
                    linha + ": " + media);
        }

    }
}
