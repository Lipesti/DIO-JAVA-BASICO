public class OperadoresArtimeticos {
    public static void main(String[] args) {
        int numero = 5; // Definição da variavel
        numero = -numero; // Passando variavel para negativo

        System.out.println("Valor de numero: " + numero); // Saída: Valor de numero: -5

        numero = numero * -1; // Convertendo o numero para positivo
        System.out.println("Valor de numero: " + numero + "\n"); // Saída: Valor de numero: 5

        //INCREMENTO DE NUMEROS 
        int number = 6;
        System.out.println("Valor original do numero " + number); // Valor original do numero

        number++; // INCREMENTO
        System.out.println("Incremento " + number); 
        
        number = 6; // Resetando a variavel
        number--; // Decremento de number 
        System.out.println("Decremento " + number);
}
}
