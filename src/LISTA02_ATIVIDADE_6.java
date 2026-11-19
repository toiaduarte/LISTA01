import java.util.Scanner;

public class LISTA02_ATIVIDADE_6{
  public static int contarVogais(String texto){
    String minusculo = texto.toLowerCase();
    int cont = 0;
    for (int i = 0; i < minusculo.length(); i++){
      char c = minusculo.charAt(i);
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        cont++;
      }
    }
    return cont;
  }
  public static void exibirContagem(String[] frases){
    int maxVogais = -1;
    String fraseMaisVogais = "";

    for (int i = 0; i < frases.length; i++){
      int qtd = contarVogais(frases[i]);
      System.out.println(frases[i] + " -> " + qtd + " vogais");

      if (qtd > maxVogais){
        maxVogais = qtd;
        fraseMaisVogais = frases[i];
      }
    }
    System.out.println("FRASE COM MAIS VOGAIS: " + fraseMaisVogais);
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    String[] frases = new String[3];

    for (int i = 0; i < frases.length; i++){
      System.out.print("DIGITE A FRASE " + (i + 1) + ": " );
      frases[i] = leitor.nextLine();
    }
    exibirContagem(frases);

    leitor.close();
  }
}
