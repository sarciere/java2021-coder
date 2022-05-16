package estruturadecontrole;

import java.util.Scanner;

public abstract class EstruturaIF {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double Nota = 1.5;

        if (Nota >= 2) {
            System.out.println("Você está aprovado!");
        }else if(Nota > 10){
            System.out.println("Você está reprovado!");
        }        
        Entrada.close();
    }
}
