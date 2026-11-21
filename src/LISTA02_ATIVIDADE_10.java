import java.util.Scanner;

public class LISTA02_ATIVIDADE_10{

  public static int fibonacci(int n){
    if (n == 0){
      return 0;
    }
    if (n == 1){
    return 1;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
}
public static int somar(int[] v){
  int total = 0;
  for (int i = 0; i < v.length; i++){
    total = total + v[i];
  }
  return total;
}

  public static void exibir(int[] v){
    for (int i = 0; i < v.length; i++){
      System.out.print(v[i] + " ");
    }
      System.out.println();
  }
   public static void main(String[] args){
  Scanner leitor = new Scanner(System.in);

  System.out.print("DIGITE N (DE 1 A 30): ");
  int n = leitor.nextInt();

  if (n < 1 || n > 30){
    System.out.println("QUANTIDADE INVÁLIDA.");
  } else{
    int[] seq = new int[n];
    for (int i = 0; i < n; i++){
      seq[i] = fibonacci(i);
    }
    exibir(seq);
    System.out.println("SOMA: " + somar(seq));
  }

  leitor.close();
  }
}
