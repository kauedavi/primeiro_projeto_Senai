/*4.	Perímetro do Retângulo: Solicite a base e a altura de um retângulo. Calcule e exiba o perímetro.*/
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Main { 
    public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a base do seu retangulo em centímetros: ");
    double base = entrada.nextDouble();

    System.out.println("Informe a altura do seu retangulo em centímetros: ");
    double altura = entrada.nextDouble();

    double perimetro = (base + altura)*2;

    System.out.println("O perímetro do retangulo é de " + perimetro + "Cm");
    }
}