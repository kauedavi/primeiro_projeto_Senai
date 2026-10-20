public class ex3 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);
        double[] producao = new double[5];
        double totalGeral = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a produção do talhão " + (i + 1) + ": ");
            producao[i] = env.nextDouble();

            totalGeral += producao[i];
        }

        System.out.println("\nProdução por talhão:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Talhão " + (i + 1) + ": " + producao[i]);
        }

        System.out.println("Total geral produzido: " + totalGeral);

    }
}
