import java.util.Scanner;

public class LISTA_ATIVIDADE_03 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nota = new double[4];
        double soma = 0;
        for (int i = 0; i < nota.length; i++) {
            System.out.println("informe sua nota " + (i + 1) + ": ");
            nota[i] = scanner.nextDouble();
            soma += nota[i];
        }
        double media = soma / nota.length;
        System.out.println("Media: " + media + " Soma: " + soma);

        if (media>= 6){
            System.out.printf("Avaliação: Aprovado!");
        }else {
            System.out.printf("Avaliação: Reprovado.")
            ;        }
    }
}
