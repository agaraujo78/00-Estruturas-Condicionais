	//5) Criar um programa que leia 2 números inteiros, efetuar as 4 operações matemáticas e mostrar os resultados.
	import java.util.Scanner;
	
	public class Exercicio_5_corrig {
	
		public static void main(String[] args) { 
			Scanner leitor	= new Scanner(System.in);
			
			int n_1, n_2, res;
						
			System.out.println("Digite o primeiro Número Inteiro:");
			n_1 = leitor.nextInt();//Nesta linha o usuário entra com o 1°numero Inteiro;
			
			System.out.println("Digite o segundo Número Inteiro:");
			n_2 = leitor.nextInt();//Nesta linha o usuário entra com o 2°numero Inteiro
			
			//Operaçao de soma dos números Inteiros e sua impressão;
			res = (n_1 + n_2);
			System.out.println("Soma dos números inteiros é: " + res);
			
			//Operaçao de subtracao dos números Inteiros e sua impressão;
			res = (n_1 - n_2);
			System.out.println("Subtração dos números inteiros é: " + res);		
			
			//Operaçao de divisao dos números Inteiros  e sua impressão;
			res = n_1 / n_2;
			System.out.println("Divisão dos números inteiros é: " + res);
			
			//Operaçao de multiplicacao dos números Inteiros  e sua impressão;
			res = n_1 * n_2;
			System.out.println("Multiplicação dos números inteiros é: " + res);		
			
			
			leitor.close();
		}
	
	}
