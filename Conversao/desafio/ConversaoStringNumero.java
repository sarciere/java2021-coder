import javax.swing.JOptionPane;

/**
 * ConversaoStringNumero
 */
public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = 
            JOptionPane.showInputDialog("Digite o primeiro numero:");
        String valor2 = 
            JOptionPane.showInputDialog("Digite o segundo numero:");
        
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.printf("A soma dos valores são : %f", soma);
        System.out.printf("A media dos valores são : %f", soma / 2);
    }    
}