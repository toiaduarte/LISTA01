import java.util.Scanner;
//Ler o preço de 5 produtos. Imprimir todos os preços lidos
//e, ao final, o total da compra com duas casas.
public class LISTA_ATIVIDADE_04{
   public static void main(String[] args){
     Scanner leitor = new Scanner(System.in);
     double[] preco = new double[5];
     double total = 0.0;

      for (int i = 0; i < preco.length; i++){
        System.out.print("DIGITE O PREÇO DO PRODUTO " + (i + 1) + ": R$ ");
        preco[i] = leitor.nextDouble();
        total = total + preco[i];
      }
     System.out.println("----- LISTA DE COMPRAS-----");
     System.out.println(" ");
     for (int i = 0; i < preco.length; i++){
       System.out.printf("PRODUTO %d: R$ %.2f\n", (i + 1), preco[i]);
     }
     System.out.printf("****TOTAL DA COMPRA: R$ %.2f\n ", total);
     System.out.println(" ");

     leitor.close();
   }  
}
