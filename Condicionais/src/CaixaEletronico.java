public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 5.00;
        double valorSolicitado = 17.00;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;


            System.out.println("Saque realizado com sucesso.\nSaldo: R$ " + String.format("%.2f", saldo) + " disponivel");
        }
        else {
            System.out.println("Você tentou fazer um saque de R$ " + String.format("%.2f", valorSolicitado) + "\nNão foi possivel completar a transação devido o saldo insuficiente.\nSeu saldo atual é de R$ " + String.format("%.2f", saldo));
        }
    }
}
