import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o  valor da sua compra:");
        float produto = input.nextFloat();

        int desconto = 85;

        float result = produto * ((float) desconto/100f);
        System.out.println(result);

    }
}