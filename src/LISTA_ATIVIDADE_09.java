import java.util.Scanner; 
//Os códigos dos produtos são {101, 205, 310, 420, 550} e os preços, na mesma ordem,
//{4.50, 12.00, 7.90, 25.00,3.20}. Ler um código e imprimir o preço do produto 
//correspondente. Se o código não existir, imprimir que o produto não foi encontrado.

public class LISTA_ATIVIDADE_09{
  public static void main (String[] args){
    Scanner leitor = new Scanner(System.in);

    int[] codigos = {101, 205, 310, 420, 550};
    double[] precos = {4.50, 12.00, 7.90, 25.00,3.20};

    System.out.print("DIGITE O CÓDIGO DO PRODUTO DESEJADO: ");
    int codigoBuscado = leitor.nextInt();

    boolean encontrado = false;

    for (int i = 0; i < codigos.length; i++){
      if (codigos[i] == codigoBuscado){
        System.out.printf("PREÇO DO PRODUTO: R$ %.2f\n", precos[i]);
        encontrado = true;
        break;
      }
    }
    if(!encontrado){
      System.out.println("PRODUTO NÃO LOCALIZADO.");
    }
    leitor.close();
  }
}
