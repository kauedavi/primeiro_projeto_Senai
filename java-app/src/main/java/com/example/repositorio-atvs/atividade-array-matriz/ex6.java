public class ex6 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        double[][] producao = new double[4][3];
        double[] totalCultura = new double[3];

        for (int mes = 0; mes < 4; mes++) {
            for (int cultura = 0; cultura < 3; cultura++) {
                System.out.print("Digite a produção da cultura " + (cultura + 1) +
                        " no mês " + (mes + 1) + ": ");
                producao[mes][cultura] = env.nextDouble();

                totalCultura[cultura] += producao[mes][cultura];
            }
        }

        for (int cultura = 0; cultura < 3; cultura++) {
            System.out.println("Total da cultura " + (cultura + 1) + ": " + totalCultura[cultura]);
        }

    }
}
