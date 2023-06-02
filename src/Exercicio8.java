import java.util.ArrayList;
import java.util.List;

public class Exercicio8 {
    /*
    Crie um programa para exibir todos os inteiros dentro do intervalo
    100-150 cuja soma de todos os dígitos é um número par.
     */
    public static void main(String[] args) {

        System.out.println(somaDoNumeroEPar(100));
        List<Integer> somaEPar = new ArrayList<>();
        for (int i = 100; i <=150 ; i++) {
            if(somaDoNumeroEPar(i) == true){
                somaEPar.add(i);
            }
        }
        System.out.println("A soma dos dígitos dos números a seguir é par:");
        System.out.println(somaEPar);

    }
    public static  boolean somaDoNumeroEPar(Integer numero){
        int unidade = numero % 10;
        numero/=10;
        int dezena = numero % 10;
        numero/=10;
        int centena = numero%10;
        int soma = unidade+dezena+centena;
        if(soma%2==0){
            return true;
        } else {
            return false;
        }
    }
}
