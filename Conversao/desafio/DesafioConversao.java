package Conversao.desafio;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro salário:");
        String sal1 = Entrada.nextLine().replace(",", ".");
        System.out.println("Informe o segundo salário:");
        String sal2 = Entrada.nextLine().replace(",", ".");
        System.out.println("Informe o terceiro salário:");
        String sal3 = Entrada.nextLine().replace(",", ".");

        double salr1 = Double.parseDouble(sal1);
        double salr2 = Double.parseDouble(sal2);
        double salr3 = Double.parseDouble(sal3);

        double media = (salr1 + salr2 + salr3 ) / 3;
        System.out.printf("A média dos salarios é: %.2f", media);
        Entrada.close();
    }
}
