import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroUm, numeroDois;
        System.out.println("Digite o primeiro número: ");
        numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        numeroDois = scanner.nextInt();

        while (numeroUm > numeroDois) {
            System.out.println("Segundo parametro deve ser maior do que o primeiro.");
            System.out.println("Digite o primeiro número: ");
            numeroUm = scanner.nextInt();
    
            System.out.println("Digite o segundo número: ");
            numeroDois = scanner.nextInt();
         }
         int diferenca = numeroDois - numeroUm;

         for(int i = 0; i < diferenca; i++){
            System.out.println("Imprimindo o número " + i);
         }

    }
}