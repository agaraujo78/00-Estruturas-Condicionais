	//5) Criar um programa que leia 2 n�meros inteiros, efetuar as 4 opera��es matem�ticas e mostrar os resultados.
	import java.util.Scanner;
	
	public class Exercicio_5_corrig {
	
		public static void main(String[] args) { 
			Scanner leitor	= new Scanner(System.in);
			
			int n_1, n_2, res;
						
			System.out.println("Digite o primeiro N�mero Inteiro:");
			n_1 = leitor.nextInt();//Nesta linha o usu�rio entra com o 1�numero Inteiro;
			
			System.out.println("Digite o segundo N�mero Inteiro:");
			n_2 = leitor.nextInt();//Nesta linha o usu�rio entra com o 2�numero Inteiro
			
			//Opera�ao de soma dos n�meros Inteiros e sua impress�o;
			res = (n_1 + n_2);
			System.out.println("Soma dos n�meros inteiros �: " + res);
			
			//Opera�ao de subtracao dos n�meros Inteiros e sua impress�o;
			res = (n_1 - n_2);
			System.out.println("Subtra��o dos n�meros inteiros �: " + res);		
			
			//Opera�ao de divisao dos n�meros Inteiros  e sua impress�o;
			res = n_1 / n_2;
			System.out.println("Divis�o dos n�meros inteiros �: " + res);
			
			//Opera�ao de multiplicacao dos n�meros Inteiros  e sua impress�o;
			res = n_1 * n_2;
			System.out.println("Multiplica��o dos n�meros inteiros �: " + res);		
			
			
			leitor.close();
		}
	
	}
