import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercicio12 {
    /*
    Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que
    nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.
     */
    public static void main(String[] args) {

        Set<Integer> vetorA = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 20 ; i++) {
            System.out.println("Informe o "+i+"º número:");
            int numero = scanner.nextInt();
            if(!vetorA.contains(numero)){
                vetorA.add(numero);
            } else {
                System.out.println("Número repetido. Informe outro número:");
                i--;
            }
        }
        Set<Integer> vetorB = new HashSet<>();
        Set<Integer> vetorC = new HashSet<>();
        for (int numero : vetorA) {
            if(numero%2 == 0){
                vetorB.add(numero);
            } else {
                vetorC.add(numero);
            }
        }
        System.out.println("VETOR A: "+vetorA);
        System.out.println("VETOR B - números pares: "+vetorB);
        System.out.println("VETOR C - números ímpares: "+vetorC);
    }
}
