
import java.util.Scanner;
public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double n1, n2, media, base = 6;
		
		System.out.printf("Favor inserir a 1° nota:");
			n1 = leitor.nextDouble();
			
		System.out.printf("Favor inserir a 2° nota:");
			n2 = leitor.nextDouble();	
			
		media = (n1 + n2)/2;
		
		if (media >= base ) {
			System.out.printf("Média: %s\n O aluno foi APROVADO.", media);
		}else {
			System.out.printf("Média: %s\n O aluno foi REPROVADO.", media);
		
			
		leitor.close();
					
		}
	
	}

}
