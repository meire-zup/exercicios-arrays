import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio10 {
    /*
    Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
    e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.
     */
    public static void main(String[] args) {
        Set<Integer> vetorA = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            vetorA.add(i);
        }
        int somaDosNumerosImpares = 0;
        int quantidadeDosNumerosImpares = 0;
        Iterator<Integer>  iterator = vetorA.iterator();
        while (iterator.hasNext()){
            int elemento = iterator.next();
            if(elemento%2 != 0){
                somaDosNumerosImpares+=elemento;
                quantidadeDosNumerosImpares++;
            }
        }
        double mediaDosNumerosImpares = somaDosNumerosImpares/quantidadeDosNumerosImpares;

        System.out.println("Vetor: "+vetorA);

        System.out.println("Média dos números ímpares: "+mediaDosNumerosImpares);

    }
}
