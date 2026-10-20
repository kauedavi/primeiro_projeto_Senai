public class ex9 {
        public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println(calcularPotencia(10, 3));

    }

      public static int calcularPotencia(int base, int exp) {
        int resultado = 1;
        for (int i = 0; i < exp; i++) {
            resultado = resultado * base;
        }
        
        return resultado;
    }
}
