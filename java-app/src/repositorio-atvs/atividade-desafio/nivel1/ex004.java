/*4.	Diferença entre Tipos de Dados: Declare uma variável do tipo short e atribua a ela um valor pequeno. Declare uma variável do tipo int e atribua a ela o valor da variável short (casting implícito). Depois, declare uma variável do tipo byte e atribua a ela o valor da variável short usando casting explícito. Exiba todos os valores no console. */

class Main {
    public static void main(String[] args) {
        short varS = 2;
        int varI = varS;
        byte varB = (byte) varS;
        System.out.println("Valor do Double: "+ varS);
        System.out.println("Valor do Inteiro: "+ varI);
        System.out.println("Valor do Byte: "+ varB);
    }
} 