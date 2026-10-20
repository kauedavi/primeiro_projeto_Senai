public class ex8 {
     public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println(fatorial(10));

    }

    public static int fatorial(int a) {
        int result = 1;

        for (int i = a; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}
