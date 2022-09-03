//8) Criar um programa que receba o ano de nascimento de uma pessoa e 
//imprima a sua idade atual e imprima também a sua idade em 2050.
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int ano_atual = 2022;
		int anoNascimento;
		int idadeAtual;
		int idade2050;
		
		System.out.println("Digite o seu ano de nascimento, no formato (aaaa): ");
		anoNascimento = leitor.nextInt();//Nesta linha o usuário entra com o seu ano de nascimento
		
		//Calculo da idade de uma pessoa
		idadeAtual = ano_atual - anoNascimento;
		
		//Calculo da idade de uma pessoa em 2050
		idade2050 = 2050 - anoNascimento;
		
		//Nas linhas abaixo são impressas os dados calculados
		System.out.println("Idade atual da pessoa é: " + idadeAtual);
		System.out.println("A idade da pessoa em 2050 será: " + idade2050);
		
		leitor.close();
	}

}
