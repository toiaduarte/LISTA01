import java.util.Scanner;

public class LISTA02_ATIVIDADE_9{
  
  public static long potencia(int base, int expoente){
    if(expoente == 0){
      return 1;
    }
    return base * potencia(base, expoente - 1);
  }
  public static void exibirPotencias(int[] bases, int expoente){
    for(int i = 0; i < bases.length; i++){
      System.out.println(bases[i] + "^" + expoente + " = " + potencia(bases[i], expoente));
    }
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("DIGITE O EXPOENTE: ");
    int expoente = leitor.nextInt();

    int[] bases = new int[5];
    for (int i = 0; i < bases.length; i++){
      System.out.print("DIGITE A BASE " + (i + 1) + ": ");
      bases[i] = leitor.nextInt();
    }
    exibirPotencias(bases, expoente);

    leitor.close();
  }
}
