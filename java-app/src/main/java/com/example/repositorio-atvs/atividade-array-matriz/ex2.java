public class ex2 {
     public static void main(String[] args) {
        Scanner env = new Scanner(System.in);
       double[] temperaturas = new double[10];
        int diasAcimaDe30 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = env.nextDouble();

            if (temperaturas[i] > 30) {
                diasAcimaDe30++;
            }
        }

        System.out.println("Quantidade de dias com temperatura acima de 30°C: " + diasAcimaDe30);

    }
}
