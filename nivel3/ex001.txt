/*1.	Média Aritmética: Receba três notas de um aluno (double) e calcule a média aritmética simples.*/

class Main {
    public static void main(String[] args) {
        double p1, p2, p3;
        p1 = 75;
        p2 = 10.7;
        p3 = 100;

        double media = (p1 + p2 + p3)/3;
        System.out.println("Suas notas foram: ");
        System.out.println("Prova 1: "+p1);
        System.out.println("Prova 2: "+p2);
        System.out.println("Prova 3: "+p3);
        System.out.println("A media desse semestre e de: "+media);

    }
} 