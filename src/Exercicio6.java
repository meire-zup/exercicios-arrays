import java.util.Scanner;

public class Exercicio6 {
    /*
    Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        if(numero%5 ==0 && numero%7 ==0){
            System.out.println("O número digitado "+numero+" é múltiplo de 5 e 7.");
        } else {
            System.out.println("O número digitado "+numero+" não é múltiplo de 5 e 7.");

        }

    }
}
