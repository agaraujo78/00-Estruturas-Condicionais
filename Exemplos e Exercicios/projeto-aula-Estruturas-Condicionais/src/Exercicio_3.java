//3) Criar um programa que leia o nome de uma pessoa, a sua idade e o seu sal�rio, e mostrar essas informa��es.
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		System.out.print("Digite o seu nome:");
		nome = leitor.nextLine(); // Nesta linha o usu�rio digita o nome da pessoa
		
		System.out.print("Digite a sua idade:");
		idade = leitor.nextInt(); // Nesta linha o usu�rio digita a idade da pessoa
		
		System.out.print("Digite o seu sal�rio:");
		salario = leitor.nextDouble();
		
		//Nas linhas abaixo s�o impressas os dados informados pelo usu�rio
		System.out.printf("Nome:  %s\n" , nome);
		System.out.printf("Idade: %s anos \n" , idade);
		System.out.printf("Sal�rio: R$%.2f" , salario);
		//System.out.println("Nome: " + nome); 
		//System.out.println("Idade: " + idade);
		//System.out.println("Sal�rio: " + salario); 


	
		leitor.close();
	}

}
