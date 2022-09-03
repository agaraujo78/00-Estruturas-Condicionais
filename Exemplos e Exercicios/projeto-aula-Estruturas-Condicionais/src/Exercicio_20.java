import java.util.Scanner;
public class Exercicio_20 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		int a, b, n, soma;
		
		System.out.printf("Digite um valor para A: ");
		   a = leitor.nextInt();
		
		System.out.printf("Digite um valor para B: ");
			b = leitor.nextInt();

System.out.printf("Digite um valor para N: ");
			n = leitor.nextInt();

		
			soma = a + b;
			
			if(soma % n == 0) {
				System.out.printf("%s é divisivel por %s!", soma, n);
			}else {
				System.out.printf("%s não é divisivel por %s!", soma, n);
				}
	
	leitor.close();
	}

}

