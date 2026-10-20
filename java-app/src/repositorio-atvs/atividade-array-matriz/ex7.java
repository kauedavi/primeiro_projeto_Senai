public class ex7 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        double[][] chuva = new double[7][4];
        double[] totalArea = new double[4];

        for (int dia = 0; dia < 7; dia++) {
            for (int area = 0; area < 4; area++) {
                System.out.print("Digite a quantidade de chuva da área " + (area + 1) +
                        " no dia " + (dia + 1) + ": ");
                chuva[dia][area] = env.nextDouble();

                totalArea[area] += chuva[dia][area];
            }
        }

        for (int area = 0; area < 4; area++) {
            System.out.println("Total de chuva na área " + (area + 1) + ": " + totalArea[area]);
        }

    }
}
