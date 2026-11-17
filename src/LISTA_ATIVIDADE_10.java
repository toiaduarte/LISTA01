import java.util.Scanner;
//Caixa de loja. Ler a quantidade N de itens da compra. Se N for menor que 1, 
//imprimir mensagem de quantidade inválida e encerrar. Caso contrário, ler
//o preço unitário e a quantidade de cada item em dois arrays de tamanho N.
//Imprimir o subtotal de cada item, o total da compra, um desconto de 5 por cento
//quando o total passar de 200,00 e o valor final a pagar, todos com duas casas.

public class LISTA_ATIVIDADE_10{
  public static void main (String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("DIGITE A QUANTIDADE DE ITENS DA COMPRA: ");
    int n = leitor.nextInt();

    if(n < 1){
      System.out.println("QUANTIDADE INVÁLIDA." );
    } else{
      double[] precos = new double[n];
      int[] quantidades = new int[n];
      double totalCompra = 0;

      for (int i = 0; i < n; i++) {
        System.out.print("DIGITE O PREÇO UNITÁRIO DO ITEM " + (i + 1) + ": ");
        precos[i] = leitor.nextDouble();
        System.out.print("DIGITE A QUANTIDADE DO ITEM " + (i + 1) + ": ");
        quantidades[i] = leitor.nextInt();
      }
      System.out.println();
      for (int i = 0; i < n; i++) {
        double subtotal = precos[i] * quantidades[i];
        totalCompra = totalCompra + subtotal;
        System.out.printf("ITEM %d - Subtotal: R$ %.2f\n", (i + 1), subtotal);
      }
      double desconto = 0;
      if (totalCompra > 200.00) {
        desconto = totalCompra * 0.05;
      }
      double valorFinal = totalCompra - desconto;
      System.out.printf("TOTAL DA COMPRA: R$ %.2f\n", totalCompra);
      System.out.printf("DESCONTO (5%%): R$ %.2f\n", desconto);
      System.out.printf("VALOR FINAL A PAGAR: R$ %.2f\n", valorFinal);
        }
    
        leitor.close();
  }
}
