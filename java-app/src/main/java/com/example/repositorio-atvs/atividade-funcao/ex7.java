public class ex7 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println(maiorNumero(10, 6, 7));

    }

    public static int maiorNumero(int a, int b, int c) {
        int[] lista = {a, b, c};
        int maior = 0;

        for (int i : lista) {
            if(i > maior){
                maior = i;
            }
        }

        return maior;
    }
}
