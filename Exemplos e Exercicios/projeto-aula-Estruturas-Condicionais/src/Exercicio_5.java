	//5) Criar um programa que leia 2 n�meros inteiros, efetuar as 4 opera��es matem�ticas e mostrar os resultados.
	import java.util.Scanner;
	
	public class Exercicio_5 {
	
		public static void main(String[] args) { 
			Scanner leitor	= new Scanner(System.in);
			
			int numero_1;
			int numero_2;
			
			System.out.println("Digite o primeiro N�mero Inteiro:");
			numero_1 = leitor.nextInt();//Nesta linha o usu�rio entra com o 1�numero Inteiro;
			
			System.out.println("Digite o segundo N�mero Inteiro:");
			numero_2 = leitor.nextInt();//Nesta linha o usu�rio entra com o 2�numero Inteiro
			
			//Opera�ao de soma dos n�meros Inteiros
			int soma = (numero_1 + numero_2);
			
			//Opera�ao de subtracao dos n�meros Inteiros
			int subtracao = (numero_1 - numero_2);
					
			//Opera�ao de divisao dos n�meros Inteiros
			int divisao = (numero_1 )/numero_2;
			
			//Opera�ao de multiplicacao dos n�meros Inteiros
			int multiplicacao = (numero_1 )*numero_2;
			
			//Nas linhas abaixo s�o impressas os dados calculados
			System.out.println("Soma dos n�meros inteiros �: " + soma);
			System.out.println("Subtra��o dos n�meros inteiros �: " + subtracao);
			System.out.println("Divis�o dos n�meros inteiros �: " + divisao);
			System.out.println("Multiplica��o dos n�meros inteiros �: " + multiplicacao);
		
			leitor.close();
		}
	
	}
