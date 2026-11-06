public class ex6 {
      public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        imparPar(2);
    }

    public static void imparPar(int a) {
        if(a % 2 == 0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
    }
}
