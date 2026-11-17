import java.util.Scanner;
//Ler as notas de 10 alunos de uma turma. Contar quantos foram aprovados
//com nota maior ou igual a 6, quantos ficaram em recuperação com nota
//maior ou igual a 4 e quantos foram reprovados abaixo disso.

public class LISTA_ATIVIDADE_08{
  public static void main (String[] args){
    Scanner leitor = new Scanner(System.in);
    double[] notas = new double[10];
    int aprovados = 0;
    int recuperacao = 0;
    int reprovados = 0;

    for(int i = 0; i < notas.length; i++){
      System.out.print(" DIGITE A NOTA DO ALUNO(A) " + (i + 1) + ": ");
      notas[i] = leitor.nextDouble();
    }
    for(int i = 0; i < notas.length; i++){
      if(notas[i] >= 6.0){
        aprovados++;
      } else if(notas[i] >= 4.0){
        recuperacao++;
      } else{
        reprovados++;
      }
    }
    System.out.println("ALUNOS APROVADOS: " + aprovados);
    System.out.println("ALUNOS DE RECUPERAÇÃO: " + recuperacao);
    System.out.println("ALUNOS REPROVADOS: " + reprovados);

    leitor.close();
  }
}
