import java.util.Scanner;

public class LISTA02_ATIVIDADE_5{
  public static String paraBinario(int n){
    if (n == 0){
      return "0";
    }
    String binario = "";
    int atual = n;
    while (atual > 0){
      int resto = atual % 2;
      binario = resto + binario;
      atual = atual / 2;
    }
    return binario;
  }
  public static void exibirTabela(int[] v){
    for (int i = 0; i < v.length; i++){
      System.out.println(v[i] + " = " + paraBinario(v[i]));
    }
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int[] numeros = new int[5];

    for (int i = 0; i < numeros.length; i++){
      System.out.print("DIGITE O NUMERO NÃO NEGATIVO " + (i + 1) + ": ");
      numeros[i] = leitor.nextInt();
    }
    exibirTabela(numeros);

    leitor.close();
  }
}
