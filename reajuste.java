//importaçoes
import java.util.Scanner;

public class reajuste {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float saldo, porcentagemSaldo;

		System.out.println("Informe o saldo: ");
		saldo = leia.nextFloat();
	
		porcentagemSaldo = saldo + (saldo * 0.01f);

		System.out.println("Saldo final com reajuste: " +porcentagemSaldo);
		
	}
}