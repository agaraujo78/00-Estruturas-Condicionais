//6) Criar um programa que leia 2 n�meros reais, efetuar as 4 opera��es matem�ticas e mostrar os resultados.
import java.util.Scanner;

public class Exercicio_6_corrig {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double n_1, n_2, res;
		
		System.out.println("Digite o primeiro N�mero Real:");
		n_1 = leitor.nextDouble();//Nesta linha o usu�rio entra com o 1�numero Inteiro;
		
		System.out.println("Digite o segundo N�mero Real:");
		n_2 = leitor.nextDouble();//Nesta linha o usu�rio entra com o 2�numero Inteiro
		
		//Opera�ao de soma dos n�meros Reais e sua impress�o;
		res = (n_1 + n_2);
		System.out.println("Soma dos n�meros Reais �: " + res);
		
		//Opera�ao de subtracao dos n�meros Reais e sua impress�o;
		res = (n_1 - n_2);
		System.out.println("Subtra��o dos n�meros Reais �: " + res);		
		
		//Opera�ao de divisao dos n�meros Reais  e sua impress�o;
		res = n_1 / n_2;
		System.out.println("Divis�o dos n�meros Reais �: " + res);
		
		//Opera�ao de multiplicacao dos n�meros Reais  e sua impress�o;
		res = n_1 * n_2;
		System.out.println("Multiplica��o dos n�meros Reais �: " + res);		
		
		
		leitor.close();
	}

}
