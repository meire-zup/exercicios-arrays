import java.util.*;

public class Exercicio11 {
    /*
    Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
    Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
     */
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a "+(i+1)+"ª idade:");
            int idade = scanner.nextInt();
            if(idades.contains(idade)){
                System.out.println("Idade não pode ser repetida.");
                i--;
            } else {
                idades.add(idade);
            }
        }
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        for (int idade : idades) {
            if(idade>maiorIdade){
                maiorIdade = idade;
            }
            if(idade<menorIdade){
                menorIdade = idade;
            }
        }

        System.out.println("Lista de idades: "+idades);
        System.out.println("A maior idade da lista é "+ maiorIdade+" e está na posição 0"+idades.indexOf(maiorIdade));
        System.out.println("A menor idade da lista é "+ menorIdade+" e está na posição 0"+idades.indexOf(menorIdade));

    }
}
