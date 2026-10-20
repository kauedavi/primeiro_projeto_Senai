public class ex5 {
     public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println(calcularMedia(3, 6, 7));
    }

    public static float calcularMedia(float a, float b, float c) {
        float[] lista = {a, b, c};
        int total = 0;
        float result = 0;

        for (float i : lista) {
            total += i;
        }
        result = total / lista.length;
        return result;
    }
}
