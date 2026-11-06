public class ex4 {
     public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println(celsiusFahrenheit(4));
    }

    public static double celsiusFahrenheit(float c){
         return c * 1.8 + 32;
    }
}
