/*10) Criar um programa que receba dois valores A e B, e efetue a troca dos
 *  valores de forma que a vari�vel A passe a possuir o valor da vari�vel B e 
 *  que a vari�vel B passe a possuir o valor da vari�vel A. Por fim, apresentar 
 *  os valores trocado.
 */
import java.util.Scanner;
public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String A, B, aux;
			
		
		System.out.println("Digite valores para a Vari�vel A:");
		A = leitor.nextLine(); //Nesta linha o usu�rio entra com a vari�vel A
		
		System.out.println("Digite valores para a Vari�vel B:");
		B = leitor.nextLine(); //Nesta linha o usu�rio entra com a vari�vel B
	
		aux = A;
		A = B;
		B = aux;
		
		//Nas linhas abaixo est�o declaradas as vari�veis A e B Trocadas
		System.out.printf("A NOVA vari�vel A �: " , A );
		System.out.println("A NOVA vari�vel B �: " + B);
		
	
		
		
		leitor.close();
		
	}

}
