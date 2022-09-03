//7) Criar um programa que leia um valor em Real e a cotação do dólar, e converta esse valor em dólares.
import java.util.Scanner;

public class Exercicio_7_corrig  {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double real, cot_dolar, cambio;
		
		System.out.println("Digite o valor desejado em Reais:");
		real = leitor.nextDouble(); //Nesta linha o usuário entra com um valor em Real
		
		System.out.println("Digite a cotaçao do Dolar em Reais:");
		cot_dolar = leitor.nextDouble(); //Nesta linha o usuário entra com a cotaçao do Dolar em Reais

		
		//Operaçao de converçãó dos Reais para o Dolar
		cambio = (real)/cot_dolar;
		
		//Nas linha abaixo esta impresso valor em dolar
		System.out.printf("O valor de R$ %.2f em dólares é: $ %.2f ", real, cambio);

		leitor.close();
	}

}
