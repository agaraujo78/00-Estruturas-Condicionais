//8) Criar um programa que receba o ano de nascimento de uma pessoa e 
//imprima a sua idade atual e imprima tamb�m a sua idade em 2050.
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int ano_atual = 2022;
		int anoNascimento;
		int idadeAtual;
		int idade2050;
		
		System.out.println("Digite o seu ano de nascimento, no formato (aaaa): ");
		anoNascimento = leitor.nextInt();//Nesta linha o usu�rio entra com o seu ano de nascimento
		
		//Calculo da idade de uma pessoa
		idadeAtual = ano_atual - anoNascimento;
		
		//Calculo da idade de uma pessoa em 2050
		idade2050 = 2050 - anoNascimento;
		
		//Nas linhas abaixo s�o impressas os dados calculados
		System.out.println("Idade atual da pessoa �: " + idadeAtual);
		System.out.println("A idade da pessoa em 2050 ser�: " + idade2050);
		
		leitor.close();
	}

}
