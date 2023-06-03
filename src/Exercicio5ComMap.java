import java.util.*;

public class Exercicio5ComMap {
    /*
   Criar um programa que calcule a média de salários de uma empresa,
   pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
    */
    public static void main(String[] args) {
        Map<String, Double> salarioDosFuncionarios = new HashMap<>();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Informe o número de funcionários da empresa:");
        int quantidadeDeFuncionarios = scanner1.nextInt();
        for (int i = 0; i <quantidadeDeFuncionarios ; i++) {
            System.out.println("Informe o nome do "+(i+1)+"º funcionário:");
            String nome = scanner2.nextLine();
            System.out.println("Informe o "+(i+1)+"º salário:");
            double salario = scanner1.nextDouble();
            salarioDosFuncionarios.put(nome, salario);
        }
        System.out.println(salarioDosFuncionarios);

        double soma = 0;
        for (Map.Entry<String, Double> entry : salarioDosFuncionarios.entrySet()) {
            soma = soma+ entry.getValue();
        }
        System.out.println(soma);
        System.out.println("Salários dos funcionários: "+salarioDosFuncionarios);
        double media  = soma/salarioDosFuncionarios.size();
        System.out.printf("MÉDIA SALARIAL: %,.2f",media);
    }
}
