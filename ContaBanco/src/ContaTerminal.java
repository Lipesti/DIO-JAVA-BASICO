
import java.util.Locale;
import java.util.Scanner;

// Classe que simula um terminal de caixa eletrônico para contas bancárias
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o numero da agencia: ");
        String numeroAgenciaString = sc.nextLine();

        System.out.println("Por favor informe o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor informe a saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.println("\nOlá " + nomeCliente +" obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgenciaString + ", sua  conta é " + numeroConta + ", e seu saldo " + saldo + " já está disponível para saque");
    }
}
