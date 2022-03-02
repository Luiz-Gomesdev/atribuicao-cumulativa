package luiz.udemy.atribuicaoCumulativa;

import java.util.Locale;
import java.util.Scanner;

public class OperadoraTelefonia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double minutos, conta;
		
		System.out.println("Digite a quantidade de minutos: ");
		minutos = sc.nextDouble();
		
		conta = 50.00;
		if (minutos > 100) {
			conta += (minutos-100)*2.00;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		
		sc.close();

	}

}
