//4) Criar um programa que leia um número real imprima o seu dobro.
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double numero;
		double dobro;
				
		System.out.println("Digite um número Real:");
		numero = leitor.nextDouble();//Nesta linha o usuário entra com o numero Real
		
		//Cálculo do dobro do numero real
		dobro = (numero)*2;
		
		// A linha abaixo imprime o dobro calculado
		//System.out.println("O dobro do número Real informado é: " + dobro);
		System.out.printf("O dobro de %s é: %s " , numero, dobro);
		
		leitor.close();
		
	}

}
