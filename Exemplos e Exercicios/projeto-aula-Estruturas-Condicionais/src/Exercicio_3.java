//3) Criar um programa que leia o nome de uma pessoa, a sua idade e o seu salário, e mostrar essas informações.
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		System.out.print("Digite o seu nome:");
		nome = leitor.nextLine(); // Nesta linha o usuário digita o nome da pessoa
		
		System.out.print("Digite a sua idade:");
		idade = leitor.nextInt(); // Nesta linha o usuário digita a idade da pessoa
		
		System.out.print("Digite o seu salário:");
		salario = leitor.nextDouble();
		
		//Nas linhas abaixo são impressas os dados informados pelo usuário
		System.out.printf("Nome:  %s\n" , nome);
		System.out.printf("Idade: %s anos \n" , idade);
		System.out.printf("Salário: R$%.2f" , salario);
		//System.out.println("Nome: " + nome); 
		//System.out.println("Idade: " + idade);
		//System.out.println("Salário: " + salario); 


	
		leitor.close();
	}

}
