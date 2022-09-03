
import java.util.Scanner;
public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		
		
		System.out.printf("Digite a idade do nadador:");
			idade = leitor.nextInt();
			
		if (idade <= 10) {
			System.out.println("Nadador Infantil ");
		}else if ( idade <= 17){
			System.out.println("Nadador Juvenil ");
		}else {
			System.out.println("Nadador Sênior");
	    }
		System.out.println("Fim do processo");
		
		
		leitor.close();
	}
}