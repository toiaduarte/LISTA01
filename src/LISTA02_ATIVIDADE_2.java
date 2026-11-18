import java.util.Scanner;

public class LISTA02_ATIVIDADE_2{
  public static double calcularImc(double peso, double altura){
    return peso / (altura * altura);
  }
  public static String classificarImc(double imc){
    if (imc < 18.5){
      return "ABAIXO DO PESO";
    } else if (imc < 25.0){
      return "PESO NORMAL";
    } else if (imc < 30.0){
      return "SOBREPESO";
    } else{
      return "OBESIDADE";
    }
  }
  public static void exibirRelatorio(double[] pesos, double[] alturas){
    for (int i = 0; i < pesos.length; i++){
      double imc = calcularImc(pesos[i], alturas[i]);
      String classificacao = classificarImc(imc);
      System.out.printf("PESSOA %d: IMC %.2f %s\n", (i + 1), imc, classificacao);
    }
  }
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    double[] pesos = new double[4];
    double[] alturas = new double[4];

    for (int i = 0; i < 4; i++){
      System.out.print("DIGITE O PESO DA PESSOA " + (i + 1) + ": " );
      pesos[i] = leitor.nextDouble();
      System.out.print("DIGITE A ALTURA DA PESSOA " + (i + 1) + ": ");
      alturas[i] = leitor.nextDouble();
    }
    exibirRelatorio(pesos, alturas);

    leitor.close();
  }
}
