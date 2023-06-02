import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    /*
    . Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.
     */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de números que serão fornecidos:");
        int quantidadeDeNumeros = scanner.nextInt();
        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.println("Informe o "+(i+1)+"º número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        System.out.println("Ordem de inserção: ");
        System.out.println(numeros);
        System.out.println("Ordem inversa:");
        Collections.reverse(numeros);
        System.out.println(numeros);

    }
}
