package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        double total = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantas notas deseja informar: ");
        double[] ListaNotas = new double[entrada.nextInt()];

        for (int i = 0; i < ListaNotas.length; i++) {
            System.out.printf("Informe a %sª nota: ", (i + 1));
            ListaNotas[i] = entrada.nextDouble();
            total += ListaNotas[i];
        }

        System.out.println(Arrays.toString(ListaNotas));
        System.out.printf("A média das notas é %2f ", total / ListaNotas.length);

        entrada.close(); 
    }   
}
