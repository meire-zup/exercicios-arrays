import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    /*
    Escreva um programa para remover um elemento específico de uma lista.
     */
    public static void main(String[] args) {
        List<Integer> numerosPares = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos números pares deseja adicionar na lista:");
        int quantidadeDeNumerosPares = scanner.nextInt();
        int contador = 1;
        while (contador <= quantidadeDeNumerosPares){
            System.out.println("Informe um número par:");
            int numeroPar = scanner.nextInt();
            if(numeroPar % 2 == 0){
                numerosPares.add(numeroPar);
                contador++;
            } else {
                System.out.println("O número não é par! Digite um número par!");
            }
        }
        System.out.println("Lista de números pares :"+numerosPares);
        System.out.println("REMOVENDO O PRIMEIRO NÚMERO DA LISTA:");
        numerosPares.remove(0);
        System.out.println("Lista de números pares :"+numerosPares);

    }
}
