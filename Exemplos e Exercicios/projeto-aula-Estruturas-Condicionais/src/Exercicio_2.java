//2-Criar um programa que calcule a média de 2 notas e mostrar essa média na tela.
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double nota_1;
		double nota_2;
		
		
		System.out.println("Digite a primeira nota:");
		nota_1 = leitor.nextDouble(); //Nesta linha o usuário entra com a primeira nota
		
		System.out.println("Digite a segunda nota:");
		nota_2 = leitor.nextDouble();//Nesta linha o usuário entra com a segunda nota
		
		//calcula a media
		double media = (nota_1 + nota_2)/2;
		
		// A linha abaixo imprime a media calculada
		System.out.println("Média: " + media);	
		
		leitor.close();
	}

}
