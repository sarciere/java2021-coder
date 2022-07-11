public class ConversaoTipoPrimitivos{
	public static void main(String[] args) {
		double a = 1; //Implicita
		System.out.println(a);

		//literalmnte ele é armazenado como double, logigamente é preciso r
		//ealizar um casting para float, de formas explicita ou inplicida
		float b = (float) 1.1234563; //Explicita CAST
		System.out.println(b);


		int c = 4; //Implicita
		byte d = (byte) c; //Explicita CAST
		System.out.println(d); 

	}
}