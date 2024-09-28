import java.util.Scanner;

public class Aboutme {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Qual seu nome?");
            String nome = scanner.nextLine();
            System.out.println("Qual seu sobrenome?");
            String sobrenome = scanner.nextLine();
            System.out.println("Qual sua idade?");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual seu endereço?");
            String endereco = scanner.nextLine();
            System.out.println("Qual seu e-mail?");
            String email = scanner.nextLine();
            System.out.println("Qual seu telefone?");
            String telefone = scanner.nextLine();
            System.out.println("Olá, " + nome + " " + sobrenome + "!\nVocê tem " + idade + " anos \nSeu endereço é " + endereco + ". \nSeu e-mail é " + email + " \neu telefone é " + telefone + ".");
        }
        

    }

