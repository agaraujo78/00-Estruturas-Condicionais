//6) Criar um programa que leia 2 n�meros reais, efetuar as 4 opera��es matem�ticas e mostrar os resultados.
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double numero_1;
		double numero_2;   

		System.out.println("Digite o primeiro N�mero Real:");
		numero_1 = leitor.nextDouble();//Nesta linha o usu�rio entra com o 1� numero Real
		
		System.out.println("Digite o segundo N�mero Real:");
		numero_2 = leitor.nextDouble();//Nesta linha o usu�rio entra com o 2� numero Real
		
		//Opera�ao de soma dos n�meros Reais
		double soma = (numero_1 + numero_2);
				
		//Opera�ao de subtracao dos n�meros Reais
		double subtracao = (numero_1 - numero_2);
						
		//Opera�ao de divisao dos n�meros Reais
		double divisao = (numero_1 )/numero_2;
				
		//Opera�ao de multiplicacao dos n�meros Reais
		double multiplicacao = (numero_1 )*numero_2;
		
		//Nas linhas abaixo s�o impressos os dados calculados
		System.out.println("Soma dos n�meros reais �: " + soma);
		System.out.println("Subtra��o dos n�meros reais �: " + subtracao);
		System.out.println("Divis�o dos n�meros reais �: " + divisao);
		System.out.println("Multiplica��o dos n�meros reais �: " + multiplicacao);
	
		leitor.close();
		
	}

}
