import java.util.Scanner;
public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int x;
		
		System.out.printf("Digite um número entre 1 e 7: ");
			 x = leitor.nextInt();
			 
		switch (x) {
			 case 1 : System.out.println("Domingo"); break;
			 case 2 : System.out.println("Segunda-Feira"); break;
			 case 3 : System.out.println("Terça-Feira"); break;
			 case 4 : System.out.println("Quarta-Feira"); break;
			 case 5 : System.out.println("Quinta-Feira"); break;
			 case 6 : System.out.println("Sexta-Feira"); break;
			 case 7 : System.out.println("Sábado"); break;
			 default: System.out.printf("O número %s está fora do intervalo proposto" , x);
	  
		}
		leitor.close();
	}
}
