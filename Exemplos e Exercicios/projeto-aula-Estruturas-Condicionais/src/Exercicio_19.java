import java.util.Scanner;
public class Exercicio_19 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		int a, b, soma;
		
		System.out.println("Digite um valor para A: ");
		   a = leitor.nextInt();
		
		System.out.println("Digite um valor para B: ");
			b = leitor.nextInt();
		
			soma = a + b;
			
			if(soma % 2 == 0) {
				System.out.printf("%s é divisivel por 2!", soma);
			}else {
				System.out.printf("%s não é divisivel por 2!", soma);
				}
	
			leitor.close();
	}

}
