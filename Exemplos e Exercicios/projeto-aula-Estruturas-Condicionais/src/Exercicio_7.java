//7) Criar um programa que leia um valor em Real e a cota��o do d�lar, e converta esse valor em d�lares.
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double Real;
		double cot_dolar;
		
		System.out.println("Digite o valor desejado em Reais:");
		Real = leitor.nextDouble(); //Nesta linha o usu�rio entra com um valor em Real
		
		System.out.println("Digite a cota�ao do Dolar em Reais:");
		cot_dolar = leitor.nextDouble(); //Nesta linha o usu�rio entra com a cota�ao do Dolar em Reais

		
		//Opera�ao de conver��� dos Reais para o Dolar
		double cambio = (Real)/cot_dolar;
		
		//Nas linha abaixo esta impresso valor em dolar
		System.out.println("O valor em d�lar �: " + cambio);

		leitor.close();
	}

}
