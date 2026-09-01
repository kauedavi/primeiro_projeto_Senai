import java.util.Scanner;

public class atv4 {
    static void main(){

        Scanner env = new Scanner(System.in);

        System.out.println("Digite a sua nota final ");
        int nota = env.nextInt();

        if (nota == 10){
            System.out.println("Você foi ótimo!");
        }else if (nota <= 9 && nota >= 7){
            System.out.println("Parabéns!");
        }else if (nota >= 5 && nota <= 6){
            System.out.println("Seu desempenho ok.");
            }else {
            System.out.println("Nota ruim.");
        }

    }
}

 