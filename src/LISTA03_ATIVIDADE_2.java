public class LISTA03_ATIVIDADE_2{
  public static void main(String[] args){
    int[][] m = new int[3][3];
    int soma = 0;

    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        m[i][j] = Integer.parseInt(IO.readln("DIGITE O VALOR [" + i + "][" + j + "]: " ));
        soma = soma + m[i][j];
      }
    }
    System.out.println("SOMA: " + soma);
  }
}
