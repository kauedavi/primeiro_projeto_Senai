public class atv13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite qual o valor da transação: R$");
        float transacao = input.nextFloat();

        System.out.print("Digite o limite do seu cartão: R$");
        float limite = input.nextFloat();

        float porcentagem = transacao * 100 / limite;


        if(porcentagem > 80){
            System.out.println("Essa transação é suspeita.");
        }else{
            System.out.println("Essa transação não é suspeita");
        }
    }
}

