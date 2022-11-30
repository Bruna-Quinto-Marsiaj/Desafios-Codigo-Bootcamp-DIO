
/*Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”.
 Caso contrário, retorne "Nao sao iguais!” sem as aspas.
 */


import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;
        int b;

        //System.out.println("Digite o numero a: ");
        a = scan.nextInt();

        //System.out.println("Digite o numero b: ");
        b = scan.nextInt();

       if (a == b) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}