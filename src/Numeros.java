import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Criando lista sem tamanho definido
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        double soma=0;
        int cont=0;

        while (true) {
            System.out.print("Digite um número:");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }
            numeros.add(num);
            cont++;
        }
        //Somando todos os números da lista
        for (int num : numeros) {
            soma += num;
        }

        //Calculando a média e imprimindo
        if(cont>0){
            double media = soma/numeros.size();
            System.out.println("A média dos números digitados é: " + String.format("%.2f", media));
            System.out.println("A quantidade de números digitados é: " + cont);
        }
        else{
            System.out.println("Nenhum número foi digitado.");
        }
    }
}

