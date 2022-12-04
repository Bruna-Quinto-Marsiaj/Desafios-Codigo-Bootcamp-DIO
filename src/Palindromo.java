import java.util.Scanner;

public class Palindromo {// no desafio o nome da classe ficou como desafio, padrão da pagina do bootcamp
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();
        String palindromo = "";

        for(int i = palavra.length() -1; i >= 0; i--){

            palindromo += palavra.charAt(i);

        }

        if(palindromo.equals(palavra)) {
            System.out.print("TRUE");
        }
        else {
            System.out.print("FALSE");

        }
        sc.close();

    }
}