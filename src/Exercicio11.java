import java.util.*;

public class Exercicio11 {
    /*
    Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
    Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
     */
    public static void main(String[] args) {
        Set<Integer> idades = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a "+(i+1)+"ª idade:");
            int idade = scanner.nextInt();
            idades.add(idade);
        }
        int maiorIdade = -1;
        int posicao = -1;
        for (int idade : idades) {
            if(idade>maiorIdade){
                maiorIdade = idade;
            }
        }

        System.out.println(idades);
        System.out.println(maiorIdade);

    }
}
