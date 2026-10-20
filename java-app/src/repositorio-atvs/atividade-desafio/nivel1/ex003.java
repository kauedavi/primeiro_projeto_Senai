/*3.	Conversão de Tipos (Casting Implícito e Explícito): Declare uma variável do tipo float e atribua um valor fracionado. Em seguida, declare uma variável do tipo long e atribua a ela o valor da variável float usando casting explícito. Por fim, declare uma variável do tipo double e atribua a ela o valor da variável long (casting implícito). Exiba todos os valores no console. */

class Main {
    public static void main(String[] args) {
        float varF = 2.7f;
        long varL = (long) varF;//casting explicito
        double varD = varL;
        System.out.println("Valor do Float "+ varF);
        System.out.println("Valor do Long "+ varL);
        System.out.println("Valor do Double "+ varD);
    }
} 