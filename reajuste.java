
//importaçoes
import java.util.Scanner;

public class reajuste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float salarioMinimo = 1412, salario, qntdSalarioMinimo;

		System.out.println("Informe o seu salario");
		salario = leia.nextFloat();

		if (salario >= salarioMinimo) {
			qntdSalarioMinimo = salario / salarioMinimo;
			System.out.println("Você ganha " +(int)qntdSalarioMinimo + " salario(s) minimo(s)");
		} else {
			System.out.println("Você ganha menos de um salario minimo KKKKKKKKKKKKKKKKKKKKKKK");

		}
	}
}