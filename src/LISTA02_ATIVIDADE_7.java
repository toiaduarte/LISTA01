import java.util.Scanner;

public class LISTA02_ATIVIDADE_7{
  public static String gerarIniciais(String nomeCompleto){
    String[] partes = nomeCompleto.trim().split(" ");
    String iniciais = "";

    for (int i = 0; i < partes.length; i++){
      if (!partes[i].isEmpty()){
        iniciais = iniciais + partes[i].toUpperCase().charAt(0) + ".";
      }
    }
    return iniciais;
  }
  public static void exibirChamada(String[] nomes){
    for (int i = 0; i < nomes.length; i++){
      System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
    }
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    String[] nomes = new String[4];

    for (int i = 0; i < nomes.length; i++){
      System.out.print("DIGITE O NOME COMPLETO DO ALUNO " + (i + 1) + ": ");
      nomes[i] = leitor.nextLine();
    }
    exibirChamada(nomes);

    leitor.close();
  }
}
