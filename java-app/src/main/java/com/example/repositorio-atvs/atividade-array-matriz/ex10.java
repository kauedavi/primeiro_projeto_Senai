public class ex10 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        double[][] producao = new double[4][12];

        double maiorProducao = 0;
        int pomarMaior = 0;

        for (int pomar = 0; pomar < 4; pomar++) {
            double totalAnual = 0;

            for (int mes = 0; mes < 12; mes++) {
                System.out.print("Digite a produção do pomar " + (pomar + 1) +
                        " no mês " + (mes + 1) + ": ");
                producao[pomar][mes] = env.nextDouble();

                totalAnual += producao[pomar][mes];
            }

            if (pomar == 0 || totalAnual > maiorProducao) {
                maiorProducao = totalAnual;
                pomarMaior = pomar + 1;
            }
        }

        System.out.println("Pomar com maior produção anual: " + pomarMaior);
        System.out.println("Produção anual: " + maiorProducao);
    }
}
