//9) Criar um programa que receba idade de uma pessoa e imprima o seu ano de nascimento.
import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int anoAtual = 2022;
		int idadeAtual;
		int anoNascimento;
		
		System.out.println("Digite a idade da pessoa:");
		idadeAtual = leitor.nextInt(); //Nesta linha o usu�rio entra com a sua idade
		
		//C�lculo do Ano de Nascimento
		 anoNascimento = anoAtual - idadeAtual;
		
		//Na linha abaixo est� impressa o ano de nascimento da pessoa
		//System.out.println("O ano de nascimento da pessoa �: " + anoNascimento);
		System.out.printf("A sua idade �: %s.\n25voc� nasceu em %s." , idadeAtual, anoNascimento);
		
		leitor.close();
		
		
	}

}
