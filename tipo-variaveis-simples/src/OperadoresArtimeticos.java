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
        System.out.println("Decremento " + number + "\n");

        //Boleano True e False 
        boolean variavel = true; //

        System.out.println(!variavel); // Saída: Valor da variavel: false devido o sinal de negação ! 
        System.out.println(variavel); // Saída: Valor da variavel: true
        
        System.out.println("\n");


        //Operadores Aritmeticos
        int a = 5;
        int b = 3;
        System.out.println("Soma: " + (a + b)); // Saída: Soma: 8
        System.out.println("Subtracao: " + (a - b)); // Saída: Subtracao: 2
        System.out.println("Multiplicacao: " + (a * b)); // Saída: Multiplicacao: 15
        System.out.println("Divisao: " + (a / b)); // Saída: Divisao: 1.6666666666666667
}
}
