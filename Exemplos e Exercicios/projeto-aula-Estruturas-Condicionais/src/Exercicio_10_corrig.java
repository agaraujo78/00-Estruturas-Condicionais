/*10) Criar um programa que receba dois valores A e B, e efetue a troca dos
 *  valores de forma que a vari�vel A passe a possuir o valor da vari�vel B e 
 *  que a vari�vel B passe a possuir o valor da vari�vel A. Por fim, apresentar 
 *  os valores trocado.
 */
import java.util.Scanner;
public class Exercicio_10_corrig {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int A, B, aux;
			
		
		System.out.println("Digite valores para a Vari�vel A:");
		A = leitor.nextInt(); //Nesta linha o usu�rio entra com a vari�vel A
		
		System.out.println("Digite valores para a Vari�vel B:");
		B = leitor.nextInt(); //Nesta linha o usu�rio entra com a vari�vel B
	
		System.out.printf("A = %s |  B = %s\n\n", A, B);
		
		aux = A;		
		A = B;
		B = aux;
		
		//Nas linhas abaixo est�o declaradas as vari�veis A e B Trocadas
		System.out.printf("A = %s |  B = %s\n\n", A, B);
				
		
		leitor.close();
		
	}

}