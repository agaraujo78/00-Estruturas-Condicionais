//4) Criar um programa que leia um n�mero real imprima o seu dobro.
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double numero;
		double dobro;
				
		System.out.println("Digite um n�mero Real:");
		numero = leitor.nextDouble();//Nesta linha o usu�rio entra com o numero Real
		
		//C�lculo do dobro do numero real
		dobro = (numero)*2;
		
		// A linha abaixo imprime o dobro calculado
		//System.out.println("O dobro do n�mero Real informado �: " + dobro);
		System.out.printf("O dobro de %s �: %s " , numero, dobro);
		
		leitor.close();
		
	}

}
