import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    /*
    Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
    Fazer um algoritmo que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.
     */
    public static void main(String[] args) {
        List<List<Double>> bancoDeDados = new ArrayList<>();

        System.out.println("POPULANDO BANCO DE DADOS:");
        System.out.println("SEXO(1-feminino, 2-masculino); ALTURA");
        List<Double> pessoa1 = new ArrayList<>();
        pessoa1.add(1.0);
        pessoa1.add(1.65);
        bancoDeDados.add(pessoa1);
        List<Double> pessoa2 = new ArrayList<>();
        pessoa2.add(2.0);
        pessoa2.add(1.9);
        bancoDeDados.add(pessoa2);
        List<Double> pessoa3 = new ArrayList<>();
        pessoa3.add(1.0);
        pessoa3.add(1.6);
        bancoDeDados.add(pessoa3);
        List<Double> pessoa4 = new ArrayList<>();
        pessoa4.add(1.0);
        pessoa4.add(1.78);
        bancoDeDados.add(pessoa4);
        List<Double> pessoa5 = new ArrayList<>();
        pessoa5.add(2.0);
        pessoa5.add(1.79);
        bancoDeDados.add(pessoa5);
        List<Double> pessoa6 = new ArrayList<>();
        pessoa6.add(2.0);
        pessoa6.add(1.85);
        bancoDeDados.add(pessoa6);
        List<Double> pessoa7 = new ArrayList<>();
        pessoa7.add(1.0);
        pessoa7.add(1.58);
        bancoDeDados.add(pessoa7);
        List<Double> pessoa8 = new ArrayList<>();
        pessoa8.add(1.0);
        pessoa8.add(1.63);
        bancoDeDados.add(pessoa8);
        List<Double> pessoa9 = new ArrayList<>();
        pessoa9.add(1.0);
        pessoa9.add(1.8);
        bancoDeDados.add(pessoa9);
        List<Double> pessoa10 = new ArrayList<>();
        pessoa10.add(2.0);
        pessoa10.add(1.8);
        bancoDeDados.add(pessoa10);
        int mulheres = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        for (int i =0; i < bancoDeDados.size(); i++) {
            List<Double> linha = bancoDeDados.get(i);
            Double elementoLinha = linha.get(0);
            if(elementoLinha.equals(1.0)){
                mulheres= mulheres+1;
            }
        }
        for (int i =0; i < bancoDeDados.size(); i++) {
                List<Double> linha = bancoDeDados.get(i);
                Double elementoColuna = linha.get(1);
                if(elementoColuna > maiorAltura){
                    maiorAltura = elementoColuna;
                } else if(elementoColuna < menorAltura){
                    menorAltura = elementoColuna;
                }
            }

        double somaAlturaMasculino = 0;
        double mediaAlturaMasculino;
        for (int i =0; i < bancoDeDados.size(); i++) {
            List<Double> linha = bancoDeDados.get(i);
            Double elementoLinha = linha.get(0);
            if(elementoLinha.equals(2.0)){
                for (int j =0; j < bancoDeDados.size(); j++) {
                    List<Double> coluna = bancoDeDados.get(j);
                    Double elementoColuna = coluna.get(1);
                    somaAlturaMasculino += elementoColuna;
                }
            }
        }
        int homens = bancoDeDados.size() - mulheres;
        System.out.println(homens);
        mediaAlturaMasculino = somaAlturaMasculino/ homens;


        //Acessar o índice 4,0
        System.out.println(bancoDeDados.get(4).get(0));
        System.out.println(bancoDeDados);
        System.out.println("A quantidade de mulheres no banco de dados é de: "+mulheres);
        System.out.println("Maior altura: "+maiorAltura);
        System.out.println("Menor altura: "+menorAltura);
        System.out.println(somaAlturaMasculino);
        System.out.println("Média da altura masculino: "+mediaAlturaMasculino);




    }
}
