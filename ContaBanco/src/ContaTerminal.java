import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Variaveis
        int numero;
        String agencia;
        String Nome;
        float saldo;

        System.out.println("Vamos Começar!:\n");

        System.out.println("Digite um Numero:");
        numero = sc.nextInt();

        System.out.println("Ágora digite o número da agência:");
        agencia = sc.next();

        System.out.println("Digite seu nome:");
        Nome = sc.next();

        System.out.println("Digite seu Saldo bancario");
        saldo = sc.nextFloat();

    System.out.println("\nOlá " + Nome +"\nObrigado por criar uma conta em nosso banco,\nsua agência é: " +agencia+ ", Conta: " +numero+ "\nseu saldo: " +saldo %.2f + " já esta disponível para saque!!\n");
    }
}
