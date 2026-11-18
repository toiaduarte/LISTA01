import java.util.Scanner;

public class LISTA02_ATIVIDADE_1{
  public static String gerarLinha(char simbolo, int tamanho){
    String linha = "";
    for (int i = 0; i < tamanho; i++){
      linha = linha + simbolo;
    }
    return linha;
  }
  public static void desenharTriangulo(int altura){
    for (int i = 1; i <= altura; i++){
      System.out.println(gerarLinha('*', i));
    }
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int[] alturas = new int[3];

    for (int i = 0; i < alturas.length; i++){
      System.out.print("DIGITE A ALTURA DO TRIÂNGULO " + (i + 1) + ": ");
      alturas[i] = leitor.nextInt();
    }
    for (int i = 0; i < alturas.length; i++){
      desenharTriangulo(alturas[i]);
      if (i < alturas.length - 1){
        System.out.println();
      }
    }
    leitor.close();
  }
}
