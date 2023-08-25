import java.util.Scanner;
public class Q01
{
    public static void main(String[] args) {
        double velocidade, tempo, distancia, kmLitro;

        double consumo;

        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITA A  VELOCIDADE:");

        velocidade = ler.nextDouble();

        System.out.println("DIGITE A TEMPO GASTO:");

        tempo = ler.nextDouble();

        System.out.println("DIGITE KM/LITRO;");

        kmLitro = ler.nextDouble();

        distancia = velocidade * tempo;

        consumo = distancia / kmLitro;

        System.out.println("CONSUMO MEDIO: "+consumo);



    }
}
