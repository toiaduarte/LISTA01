import java.util.Scanner;

public class LISTA02_ATIVIDADE_4{
  public static void ordenar(int[] v){
    for (int i = 0; i < v.length - 1; i++){
      for (int j = 0; j < v.length - 1 - i; j++){
        if (v[j] > v[j + 1]){
          int temp = v[j];
          v[j] = v[j + 1];
          v[j + 1] = temp;
        }
      }
    }
  }
  public static boolean estaOrdenado(int[] v){
    for (int i = 0; i < v.length - 1; i++){
      if (v[i] > v[i + 1]){
        return false;
      }
    }
    return true;
  }
  public static void exibir(int[] v){
    for (int i = 0; i < v.length; i++){
      System.out.print(v[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int[] numeros = new int[6];

    for (int i = 0; i < numeros.length; i++){
      System.out.print("DIGITE O NÚMERO " + (i + 1) + ": ");
      numeros[i] = leitor.nextInt();
    }
    System.out.print("ANTES: ");
    exibir(numeros);
    System.out.println("ESTÁ ORDENADO? " + estaOrdenado(numeros));

    ordenar(numeros);

    System.out.print("DEPOIS: ");
    exibir(numeros);
    System.out.println("ESTÁ ORDENADO? " + estaOrdenado(numeros));

    leitor.close();
  }
}
