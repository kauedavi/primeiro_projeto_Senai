/*3.	Área do Quadrado: Peça o valor do lado de um quadrado e calcule sua área (A = lado * lado).*/
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Main { 
    public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o lado do seu quadrado em centímetros: ");
    double lado = entrada.nextDouble();

    double area = lado*lado;

    System.out.println("A área do quadrado é de " + area + "Cm²");
    }
}