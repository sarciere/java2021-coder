public class ConversaoInteiroParaString{
	public static void main(String[] args) {
		Integer num1 = 10000; //utilizando o wrappers
		System.out.println(num1.toString().length());

		int num2 = 100000;
		System.out.println(Integer.toString(num2)); //casting explicito;
	}
}