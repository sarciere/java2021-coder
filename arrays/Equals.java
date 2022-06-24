package arrays;

public class Equals {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Joao", "emailteste@gmail.com");
        Usuario user2 = new Usuario("Joao", "emailteste@gmail.com");        

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user1));        
    }
}
