import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String placa;
        int ano;

        System.out.println("Digite a placa:");
        placa = ler.nextLine();

        System.out.println("Digite o ano de fabricação :");
        ano = ler.nextInt();

        if (ano <= 2010)
            System.out.println("CARRO VELHO");

        else if (ano <= 2022)
            System.out.println("CARRO SEMI NOVO");

        else if (ano == 2023)
            System.out.println("CARRO NOVO");
        else
            System.out.println("INVALIDO");

        for (int i = 0; i < placa.length(); i++) {
            if (placa.charAt(i) == 'A' || placa.charAt(i) == 'E' || placa.charAt(i) == 'I' || placa.charAt(i) == 'O' || placa.charAt(i) == 'U' )
                placa=placa.replace(placa.charAt(i), '*');
        }
        System.out.println("PLACA ALTERADA: "+placa);
    }



}
