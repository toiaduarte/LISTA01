import java.util.Scanner;
//Ler o valor de um empréstimo e a taxa de juros simples
//mensal em porcentagem. Preencher um array de 12

public class LISTA_ATIVIDADE_06{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("DIGITE O VALOR DO EMPRÉSTIMO: ");
    double emprestimo = leitor.nextDouble();
    System.out.print("DIGITE A TAXA DE JUROS MENSAL(%): ");
    double taxa = leitor.nextDouble();

    double[] valorOriginal = new double[12];
    double[] comJuros = new double[12];

    for (int i = 0; i < valorOriginal.length; i++){
      int mes = i + 1;
      valorOriginal[i] = emprestimo;
      comJuros[i] = valorOriginal[i] + (valorOriginal[i] * (taxa / 100.0) * mes);
    }
    for (int i = 0; i <valorOriginal.length; i++){
      System.out.printf("MÊS %d: R$ %.2f\n", (i + 1), comJuros[i]);
    }
    leitor.close();
  }
}
