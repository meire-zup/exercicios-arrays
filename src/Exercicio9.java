import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
    /*
    Crie um programa para exibir a soma de 20 números usando uma matriz.
     */
    public static void main(String[] args) {

        int[][] matriz = new int[10][2];
        Scanner scanner = new Scanner(System.in);
       for (int linha = 0; linha < 10; linha++) {
           for (int coluna = 0;  coluna< 2; coluna++) {
               System.out.println("Informe o número para a posição: ["+linha+"]"+"["+coluna+"]");
                matriz[linha][coluna] = scanner.nextInt();
           }
       }
       int soma = 0;
        System.out.println("MATRIZ 10 X 2:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                soma+=matriz[i][j];
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos da matriz é: "+soma);
        }
    }

