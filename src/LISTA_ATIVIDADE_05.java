import java.util.Scanner;

public class LISTA_ATIVIDADE_05{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    double[] originais = new double[5];
    double[] comEconomia = new double[5];

    for(int i = 0; i <originais.length; i++){
      System.out.print(" DIGITE O PREÇO DO PRODUTO " + (i + 1) + ": ");
      originais[i] = leitor.nextDouble();
      comEconomia[i] = originais[i] - (originais[i] * 0.10);
    }
    for(int i = 0; i < originais.length; i++){
      System.out.printf("PRODUTO %d - Original: R$ %.2f, Com economia: R$ %.2f\n", (i + 1), originais[i], comEconomia[i]);
    }
    leitor.close();
  }
}
