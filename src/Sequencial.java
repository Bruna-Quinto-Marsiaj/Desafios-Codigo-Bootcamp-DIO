import java.util.Scanner;

public class Sequencial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero, pos = 0;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};


        System.out.println("Digite o numero para a busca: ");
        numero = scan.nextInt();

        pos = posicao(numero, elementos);

        if (pos == -1){
            System.out.println("Numero " + numero + " nao encontrado!");
        } else {
            System.out.println("Numero " + numero + " encontrado na posicao " + pos);
        }
    }


    private static int posicao(int numero, int[] elementos) {
        int pos = -1;
        for(int i = 0; i < elementos.length; i++) {
            //Verifica se o elemento que está sendo procurado está no vetor.
            if (numero == elementos[i]) {
               pos = i;
            }
        }

        return pos;
    }

}



