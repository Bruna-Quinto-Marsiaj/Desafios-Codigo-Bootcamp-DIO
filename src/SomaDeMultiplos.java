import java.util.Scanner;

public class SomaDeMultiplos {
    public static void main(String[] args) {

        int a , n;
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero a: ");
        a = scan.nextInt();

        System.out.println("Digite o numero n: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % a == 0) {
                soma +=  i;
            }

        }
        System.out.println(soma);
    }
}