import java.util.Scanner;
//Ler o salário de 6 funcionários. Imprimir o maior salário, 
//o menor salário, a média com duas casas e quantos funcionários ganham acima da média.

public class LISTA_ATIVIDADE_07{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    double[] salarios = new double[6];
    double soma = 0;

    for(int i = 0; i < salarios.length; i++){
      System.out.print("DIGITE O SALARIO DO FUNCIONÁRIO " + (i + 1) + ": ");
      salarios[i] = leitor.nextDouble();
      soma = soma + salarios[i];
    }
    double maior = salarios[0];
    double menor = salarios[0];

    for(int i = 0; i < salarios.length; i++){
      if(salarios[i] > maior){
        maior = salarios[i];
      }
      if(salarios[i] < menor){
        menor = salarios[i];
      }
    }
    double media = soma / salarios.length;
    int acimaDaMedia = 0;

    for(int i = 0; i < salarios.length; i++){
      if(salarios[i] > media){
        acimaDaMedia++;
      }
    }
    System.out.printf(" MAIOR SALÁRIO: R$ %.2f\n", maior);
    System.out.printf("MENOR SALÁRIO: R$ %.2f\n", menor);
    System.out.printf("MÉDIA SALARIAL: R$ %.2f\n", media);
    System.out.println(" FUNCIONÁRIOS ACIMA DA MÉDIA: " + acimaDaMedia);

    leitor.close();
  }
}
