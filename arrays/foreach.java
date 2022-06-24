package arrays;

import java.util.Arrays;
import java.util.Random;

public class foreach {
    public static void main(String[] args) {
        double[] Lista = new double[5];
        
        //For comum
        for (int i = 0; i < Lista.length; i++) {
            Random r = new Random();
            Lista[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(Lista));        

        //foreach
        for (double ListaDeValores : Lista) {
            Random r = new Random();
            ListaDeValores = r.nextDouble();            
            System.out.println(ListaDeValores);
        }
    }
}
