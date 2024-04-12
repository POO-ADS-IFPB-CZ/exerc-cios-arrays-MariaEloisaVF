public class NotaAluno {
    public static void main(String[] args) {
        double notas[] = {90, 100, 85, 93, 75, 45, 67, 98, 34, 50};

        double mediaSoma = 0;
        int SomaAcima = 0;
        int SomaAbaixo = 0;

        for(int i=0; i<notas.length; i++){
            mediaSoma += notas[i];
        }
        double media = mediaSoma/notas.length;

        for(int i=0; i<notas.length; i++) {
            if (notas[i] >= media) {
                SomaAcima++;
            } else {
                SomaAbaixo++;
            }
        }
        System.out.println("A média das notas é: " + media);
        System.out.println("Número de alunos aprovados: " + SomaAcima);
        System.out.println("Número de alunos reprovados: " + SomaAbaixo);
    }
}