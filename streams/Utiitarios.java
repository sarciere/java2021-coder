package streams;

import java.util.function.UnaryOperator;

public interface Utiitarios {
    
    public final static UnaryOperator<String> maiscula = n -> n.toUpperCase();        
    
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    
    public static String grito(String n){
        return n + "!!!";
    }

}
