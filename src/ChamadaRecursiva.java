import java.util.*;

public class ChamadaRecursiva {
    public static void main(String[] args) {

        int  N;

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o numero N: ");
        N = numero.nextInt();

        System.out.println(somatorio(N));
    }


     static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}

