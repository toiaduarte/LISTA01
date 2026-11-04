public class LISTA_ATIVIDADE_02 {

    public static void main (String[] args){
        double[] preco = new double[3];
        preco[0] = 12.90;
        preco[1] = 5.50;
        preco[2] = 30.00;
        System.out.println("----------Valor do Produto----------");
        System.out.println();
        for (int i =0; i <preco.length; i++){
            System.out.println("Produto "+ (i + 1) + ": R$" + preco[i]);
        }
    }
}


