//importaçoes
import java.util.Scanner;

public class mediaAritmetica {

	public static void main(String[] args) {
		byte num1 = 7, num2 = 8, num3 = 9;
		byte num4 = 4, num5 = 5, num6 = 6;
		int media1, media2, somaMedias;
		float mediaGeral;

		media1 = (num1 + num2 + num3) / 3;
		media2 = (num4 + num5 + num6) / 3;
		somaMedias = media1 + media2;
		mediaGeral = (media1 + media2) / (float)2;

	System.out.println("A média 1 é: " +media1);
	System.out.println("A média 2 é: " +media2);
	System.out.println("A soma das médias 1 e 2 é: " +somaMedias);
	System.out.println("A média geral entre as médias é: " +mediaGeral);
	}
}