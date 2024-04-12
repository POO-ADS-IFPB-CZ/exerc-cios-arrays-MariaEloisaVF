public class Fibonacci {
    public static void main(String[] args) {
        int fibo[] = new int[30];
        //Definindo o primeiro e segundo elemento da série
        fibo[0] = 0;
        fibo[1] = 1;
        //Calculando e imprimindo os demais elementos da série
        for(int i = 2; i < fibo.length; i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
            System.out.println(fibo[i]);
        }
    }
}