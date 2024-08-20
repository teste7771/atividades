//importaçoes
import java.util.Scanner;
public class idade {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
	byte anos, meses, dias, mesesAno = 12, diasDoMes = 30;
	int diasTotais, anosEmMeses, somaMeses, somaDias;

	System.out.println("Digite quantos anos de idade: ");
	anos = leia.nextByte();

	System.out.println("Digite quantos meses de idade: ");
	meses = leia.nextByte();

	System.out.println("Digite quantos dias de idade: ");
	dias = leia.nextByte();

	anosEmMeses = mesesAno * anos;
	somaMeses = anosEmMeses + meses;
	somaDias = (somaMeses * diasDoMes) + dias;

System.out.println("A sua idade de forma detalhada é: " +anos + " anos, " +meses + " meses e " +dias + " dias. Totalizando um total de " +somaDias + " dias de vida." );
	}

}