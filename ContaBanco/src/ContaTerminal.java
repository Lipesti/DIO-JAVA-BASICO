import java.util.Locale;
import java.util.Scanner;

// Classe que simula um terminal de caixa eletrônico para contas bancárias
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();  // Consumir o \n deixado pelo nextInt()

        System.out.println("Por favor, digite o numero da agencia: ");
        String numeroAgenciaString = sc.nextLine();

        System.out.println("Por favor informe o seu nome: ");
        String nomeCliente = sc.nextLine();
        
        System.out.println("Por favor informe o saldo da conta: ");
        double saldo = sc.nextDouble();
        
        if (saldo <= 10){
            System.out.println("Saldo insuficiente, para saque!");
            
        }
        // Usando o método concat() para construir a mensagem
        String mensagem = "\nOlá ".concat(nomeCliente)
                            .concat(", obrigado por criar uma conta em nosso banco. Sua agência é ")
                            .concat(numeroAgenciaString)
                            .concat(", sua conta é ")
                            .concat(String.valueOf(numeroConta))
                            .concat(", e seu saldo ")
                            .concat(String.valueOf(saldo))
                            .concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}
