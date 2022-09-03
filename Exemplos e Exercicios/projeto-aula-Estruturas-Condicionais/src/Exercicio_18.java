import java.util.Scanner;
public class Exercicio_18 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int i; //contador
		int contImpar = 0;
		int n; //numero digitado
		
		for (i = 1; i <=10; i++) {
			System.out.printf("Digite o %s° valor: ", i);
			n = leitor.nextInt();
			
			if(n % 2 !=0) {
				contImpar++;
			}
		}
	
		System.out.printf("Quantidade de Números ímpares: %s", contImpar);
		
		leitor.close();
	}

}
