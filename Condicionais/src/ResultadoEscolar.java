
import java.util.Scanner;

public class ResultadoEscolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int nota1, nota2, nota3, nota4;
        int media;
        int faltas;

        System.out.println("Informe o nome completo do aluno: ");
        nome = sc.nextLine();

        System.out.println("Informe a primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Informe a segunda nota: ");
        nota2 = sc.nextInt();

        System.out.println("Informe a terceira nota: ");
        nota3 = sc.nextInt();

        System.out.println("Informe a quarta nota: ");
        nota4 = sc.nextInt();
        
        System.out.println("Informe o número de faltas: ");
        faltas = sc.nextInt();
        System.out.println("\n");
        
        sc.close();
        
        

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média das notas: " + media);
        System.out.println("Número de faltas: " + faltas);


        // Condição ternária com operador lógico && 
        // O resultado é "Aluno aprovado!" se a média for >= 6 e as faltas <= 15
        String resultado = media >= 6 && faltas <= 15 
        ? "Aluno aprovado! \nmedia "  + media + "\nfaltas " + faltas 
        : "Aluno reprovado! \nmedia "  + media + "\nfaltas " + faltas;

        System.out.println(resultado);
        
        // Alternativa com if-else
        // O resultado é "Aluno aprovado!" se a média for >= 6 e as faltas <= 15
        // Senão, o resultado é "Aluno reprovado!"
        // O uso do operador ternário é mais conciso e legível neste caso.
        // O código abaixo é equivalente ao código anterior com if-else.

      /*
    if (media >= 6 && faltas <= 15) {
        System.out.println("Aluno aprovado! \nmedia "  + media + "\nfaltas " + faltas);
    } else {
        System.out.println("Aluno reprovado! \nmedia "  + media + "\nfaltas " + faltas);
    }
*/

    }
}
