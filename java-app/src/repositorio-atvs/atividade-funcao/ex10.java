public class ex10 {
      public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println(calcularIMC(70.0, 1.75));

    }

    public static double calcularIMC(double peso, double altura) {
        double result = peso / (altura * altura);
        return result;
    }
}
