import java.util.Scanner;
public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// A mob B = 0, A mob B = 1, 
		
		int valor;
		int res;
		
		System.out.printf("Digite um n�mero inteiro:");
		valor = leitor.nextInt(); // insira um numerio inteiro
		  
		res = valor%2; // % => mod
		
		  if (res == 0) {
			  System.out.printf("O n�mero %s � par", valor);
		  } else {
			  System.out.printf("O n�mero %s � �mpar", valor);
		  } 
		  
		  leitor.close();
	}

}
