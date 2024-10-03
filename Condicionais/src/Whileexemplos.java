import java.util.concurrent.ThreadLocalRandom;

public class Whileexemplos {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            // Verifica se o valor do doce é maior que a mesada
            if (valorDoce > mesada) 
                valorDoce = mesada;
                
            // Exibe o valor do doce com duas casas decimais
            System.out.printf("Valor do Doce: R$ %.2f%n", valorDoce);

            mesada = mesada - valorDoce;
        }

        // Exibe o valor final da mesada com duas casas decimais
        System.out.printf("Mesada: R$ %.2f%n", mesada);
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
