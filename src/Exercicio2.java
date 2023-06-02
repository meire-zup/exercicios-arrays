import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercicio2 {
    /*
    Escreva um programa para inserir um elemento (posição específica) em uma lista.
     */
    public static void main(String[] args) {
        List<Integer> numerosImpares = new ArrayList<>(Arrays.asList(1,3,5,7,9,11,15));
        System.out.println(numerosImpares);
        System.out.println("Adicionando o número 13 na posição específica:");
        numerosImpares.add(6,13);
        System.out.println(numerosImpares);


    }
}
