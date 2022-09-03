/*10) Criar um programa que receba dois valores A e B, e efetue a troca dos
 *  valores de forma que a variável A passe a possuir o valor da variável B e 
 *  que a variável B passe a possuir o valor da variável A. Por fim, apresentar 
 *  os valores trocado.
 */
import java.util.Scanner;
public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String A, B, aux;
			
		
		System.out.println("Digite valores para a Variável A:");
		A = leitor.nextLine(); //Nesta linha o usuário entra com a variável A
		
		System.out.println("Digite valores para a Variável B:");
		B = leitor.nextLine(); //Nesta linha o usuário entra com a variável B
	
		aux = A;
		A = B;
		B = aux;
		
		//Nas linhas abaixo estão declaradas as variáveis A e B Trocadas
		System.out.printf("A NOVA variável A é: " , A );
		System.out.println("A NOVA variável B é: " + B);
		
	
		
		
		leitor.close();
		
	}

}
