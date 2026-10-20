public class ex5 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);
        
        double[] umidade = new double[8];
        int areasAbaixoDe40 = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a umidade da área " + (i + 1) + ": ");
            umidade[i] = env.nextDouble();

            if (umidade[i] < 40) {
                areasAbaixoDe40++;
            }
        }

        System.out.println("Quantidade de áreas com umidade inferior a 40%: " + areasAbaixoDe40);

    }
}
