package luiz.udemy.While;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int x = sc.nextInt();
		
		int soma = 0;	
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("Soma igual a: " + soma);
		
		sc.close();
	}

}
