import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    /*
    Criar um programa que calcule a média de salários de uma empresa,
    pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
     */
    public static void main(String[] args) {
        List<Double> salarioDosFuncionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de funcionários da empresa:");
        int quantidadeDeFuncionarios = scanner.nextInt();
        for (int i = 0; i <quantidadeDeFuncionarios ; i++) {
            System.out.println("Informe o "+(i+1)+"º salário:");
            double salario = scanner.nextDouble();
            salarioDosFuncionarios.add(salario);
        }
        double soma = 0;
        for (double salario : salarioDosFuncionarios) {
            soma+=salario;
        }
        System.out.println("Salários dos funcionários: "+salarioDosFuncionarios);
        double media  = soma/salarioDosFuncionarios.size();
        System.out.printf("MÉDIA SALARIAL: %,.2f",media);
    }
}
