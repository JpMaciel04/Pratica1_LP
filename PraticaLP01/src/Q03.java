import java.util.Locale;
import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;

        System.out.println("DIGITE UMA FRASE :");
        frase = ler.nextLine();
        frase = frase.toUpperCase();

        int contadorVogal = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)== 'A'|| frase.charAt(i)=='E'||frase.charAt(i)=='I'||frase.charAt(i)=='O'||frase.charAt(i)=='U')
                contadorVogal++;
        }
        System.out.println("NUMERO DE VOGAIS NA FRASE É "+contadorVogal);
    }
}
