public class atv {
       public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner env = new Scanner(System.in);
        int[] milho = new int[7];
        int semana = 1;
        int total = 0;
        int maior = 0;

        for (int i = 0; i < milho.length; i++) {
            System.out.println("Qual foi a produção de milho no dia " + semana + "?");
            semana++;
            milho[i] = env.nextInt();
        }

        for (int i = 0; i < milho.length; i++) {
            total = milho[i] + total;

            if (milho[i] > maior) {
                maior = milho[i];
            }
        }

        System.out.println("total:" + total);
        System.out.println("maior:" + maior);
    }
}
