//criar um programa que leia o salario de um funcionario
// Apresente na tela o salario do funcionario com reajuste de 15% 

import java.util.Scanner;

public class Exercicio_11 {
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		double salario, reajuste;
		
		
		System.out.print("Digite o salário do funcionáro:");
		salario = leitor.nextDouble();
		
		reajuste = salario*0.15;
		
		System.out.printf("O salário atual é: R$ %.2f\n", salario);
		System.out.printf("Salario + 15%%: R$ %.2f", (salario + reajuste));
		
		
		leitor.close();
		}
}
