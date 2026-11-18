import java.util.Scanner;

public class LISTA02_ATIVIDADE_3{
  public static boolean ehPrimo(int numero){
    if (numero < 2){
      return false;
    }
    for (int i = 2; i < numero; i++){
      if (numero % i == 0){
        return false;
      }
    }
    return true;
  }
  public static int contarPrimos(int[] v){
    int contador = 0;
    for (int i = 0; i < v.length; i++){
      if (ehPrimo(v[i])){
        contador++;
      }
    }
    return contador;
  }
  public static void exibirPrimos(int[] v){
    System.out.print("PRINT ENCONTRADOS: ");
    for (int i = 0; i < v.length; i++){
      if (ehPrimo(v[i])){
        System.out.print(v[i] + " ");
      }
    }
    System.out.println();
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int[] numeros = new int[8];

    for (int i = 0; i < numeros.length; i++){
    System.out.print("DIGITE O NUMERO " + (i + 1) + ": ");
    numeros[i] = leitor.nextInt();
  }
  exibirPrimos(numeros);
  int totalPrimos = contarPrimos(numeros);
  System.out.println("QUANTIDADE DE PRIMOS: " + totalPrimos);

   leitor.close();
  }
}
