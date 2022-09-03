//6) Criar um programa que leia 2 números reais, efetuar as 4 operações matemáticas e mostrar os resultados.
import java.util.Scanner;

public class Exercicio_6_corrig {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double n_1, n_2, res;
		
		System.out.println("Digite o primeiro Número Real:");
		n_1 = leitor.nextDouble();//Nesta linha o usuário entra com o 1°numero Inteiro;
		
		System.out.println("Digite o segundo Número Real:");
		n_2 = leitor.nextDouble();//Nesta linha o usuário entra com o 2°numero Inteiro
		
		//Operaçao de soma dos números Reais e sua impressão;
		res = (n_1 + n_2);
		System.out.println("Soma dos números Reais é: " + res);
		
		//Operaçao de subtracao dos números Reais e sua impressão;
		res = (n_1 - n_2);
		System.out.println("Subtração dos números Reais é: " + res);		
		
		//Operaçao de divisao dos números Reais  e sua impressão;
		res = n_1 / n_2;
		System.out.println("Divisão dos números Reais é: " + res);
		
		//Operaçao de multiplicacao dos números Reais  e sua impressão;
		res = n_1 * n_2;
		System.out.println("Multiplicação dos números Reais é: " + res);		
		
		
		leitor.close();
	}

}
