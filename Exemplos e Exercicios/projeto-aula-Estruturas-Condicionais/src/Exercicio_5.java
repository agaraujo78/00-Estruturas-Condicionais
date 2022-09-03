	//5) Criar um programa que leia 2 números inteiros, efetuar as 4 operações matemáticas e mostrar os resultados.
	import java.util.Scanner;
	
	public class Exercicio_5 {
	
		public static void main(String[] args) { 
			Scanner leitor	= new Scanner(System.in);
			
			int numero_1;
			int numero_2;
			
			System.out.println("Digite o primeiro Número Inteiro:");
			numero_1 = leitor.nextInt();//Nesta linha o usuário entra com o 1°numero Inteiro;
			
			System.out.println("Digite o segundo Número Inteiro:");
			numero_2 = leitor.nextInt();//Nesta linha o usuário entra com o 2°numero Inteiro
			
			//Operaçao de soma dos números Inteiros
			int soma = (numero_1 + numero_2);
			
			//Operaçao de subtracao dos números Inteiros
			int subtracao = (numero_1 - numero_2);
					
			//Operaçao de divisao dos números Inteiros
			int divisao = (numero_1 )/numero_2;
			
			//Operaçao de multiplicacao dos números Inteiros
			int multiplicacao = (numero_1 )*numero_2;
			
			//Nas linhas abaixo são impressas os dados calculados
			System.out.println("Soma dos números inteiros é: " + soma);
			System.out.println("Subtração dos números inteiros é: " + subtracao);
			System.out.println("Divisão dos números inteiros é: " + divisao);
			System.out.println("Multiplicação dos números inteiros é: " + multiplicacao);
		
			leitor.close();
		}
	
	}
