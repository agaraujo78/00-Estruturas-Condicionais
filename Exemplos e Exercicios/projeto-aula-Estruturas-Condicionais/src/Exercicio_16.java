import java.util.Scanner;
public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int x;
		
		System.out.printf("Digite um n�mero entre 1 e 7: ");
			 x = leitor.nextInt();
			 
		switch (x) {
			 case 1 : System.out.println("Domingo"); break;
			 case 2 : System.out.println("Segunda-Feira"); break;
			 case 3 : System.out.println("Ter�a-Feira"); break;
			 case 4 : System.out.println("Quarta-Feira"); break;
			 case 5 : System.out.println("Quinta-Feira"); break;
			 case 6 : System.out.println("Sexta-Feira"); break;
			 case 7 : System.out.println("S�bado"); break;
			 default: System.out.printf("O n�mero %s est� fora do intervalo proposto" , x);
	  
		}
		leitor.close();
	}
}
