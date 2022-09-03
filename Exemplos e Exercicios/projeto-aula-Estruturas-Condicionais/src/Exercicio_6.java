//6) Criar um programa que leia 2 números reais, efetuar as 4 operações matemáticas e mostrar os resultados.
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double numero_1;
		double numero_2;   

		System.out.println("Digite o primeiro Número Real:");
		numero_1 = leitor.nextDouble();//Nesta linha o usuário entra com o 1° numero Real
		
		System.out.println("Digite o segundo Número Real:");
		numero_2 = leitor.nextDouble();//Nesta linha o usuário entra com o 2° numero Real
		
		//Operaçao de soma dos números Reais
		double soma = (numero_1 + numero_2);
				
		//Operaçao de subtracao dos números Reais
		double subtracao = (numero_1 - numero_2);
						
		//Operaçao de divisao dos números Reais
		double divisao = (numero_1 )/numero_2;
				
		//Operaçao de multiplicacao dos números Reais
		double multiplicacao = (numero_1 )*numero_2;
		
		//Nas linhas abaixo são impressos os dados calculados
		System.out.println("Soma dos números reais é: " + soma);
		System.out.println("Subtração dos números reais é: " + subtracao);
		System.out.println("Divisão dos números reais é: " + divisao);
		System.out.println("Multiplicação dos números reais é: " + multiplicacao);
	
		leitor.close();
		
	}

}
