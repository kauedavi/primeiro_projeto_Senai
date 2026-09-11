public class atv2 {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);
        int peca = 0;
        
        do{
            peca ++;
            System.out.println("Peça produzida: " + peca);
        }while(peca < 20);

        System.out.println("Limite de produção alcançado: " + peca);
    }
}
