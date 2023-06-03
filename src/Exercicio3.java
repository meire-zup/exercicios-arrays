import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    /*
    Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).
     */
    public static void main(String[] args) {
        List<Integer> listaDeDoisNumeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        int primeiroNumero = scanner.nextInt();
        listaDeDoisNumeros.add(primeiroNumero);
        int segundoNumero;
        do {
            System.out.println("Informe o segundo número:");
            segundoNumero = scanner.nextInt();
            if(primeiroNumero == segundoNumero) {
                System.out.println("O segundo número não pode ser igual ao primeiro.");
            }
        } while (primeiroNumero == segundoNumero);
        listaDeDoisNumeros.add(segundoNumero);
        System.out.println("Valores:");
        System.out.println(listaDeDoisNumeros);
        System.out.println("Ordenando os números em ordem decrescente:");
        Collections.reverse(listaDeDoisNumeros);
        System.out.println(listaDeDoisNumeros);

    }
}
