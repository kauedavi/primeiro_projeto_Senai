public class ex8 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        int[][] focos = new int[5][5];

        int maiorQuantidade = 0;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Digite a quantidade de focos da região [" +
                        linha + "][" + coluna + "]: ");
                focos[linha][coluna] = env.nextInt();

                if (linha == 0 && coluna == 0 || focos[linha][coluna] > maiorQuantidade) {
                    maiorQuantidade = focos[linha][coluna];
                    linhaMaior = linha;
                    colunaMaior = coluna;
                }
            }
        }

        System.out.println("Maior quantidade de focos: " + maiorQuantidade);
        System.out.println("Região: [" + linhaMaior + "][" + colunaMaior + "]");

    }
}
