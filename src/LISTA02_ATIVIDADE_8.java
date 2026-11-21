import java.util.Scanner;

public class LISTA02_ATIVIDADE_8{
  public static String maiorPalavra(String[] palavras){
    String maior = palavras[0];
    for (int i = 1; i < palavras.length; i++){
      if (palavras[i].length() > maior.length()){
        maior = palavras[i];
      }
    }
    return maior;
  }
  public static void exibirPalavras(String[] palavras){
    for (int i = 0; i < palavras.length; i++){
      System.out.println((i + 1) + ": " + palavras[i]);
    }
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    String frase = leitor.nextLine().trim();

    String[] palavras = frase.split(" ");

    exibirPalavras(palavras);
    System.out.println("TOTAL DE PALAVRAS: " + palavras.length);
    System.out.println("MAIOR PALAVRA: " + maiorPalavra(palavras));

    leitor.close();
  }
}
