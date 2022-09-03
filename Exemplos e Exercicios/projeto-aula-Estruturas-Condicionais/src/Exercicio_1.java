import java.util.Scanner;


public class Exercicio_1 {
	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		
		 String nome_1;
    	 String nome_2;
		 String nome_3;

		 System.out.println("Digite o nome da primeira pessoa:");
		 nome_1 = leitor.nextLine(); // Nesta linha o usuário entra com o nome da primeira pessoa

 		 System.out.println("Digite o nome da segunda pessoa:");
		 nome_2= leitor.nextLine(); // Nesta linha o usuário entra com o nome da segunda pessoa

		 System.out.println("Digite o nome da terceira pessoa:");
		 nome_3= leitor.nextLine(); // Nesta linha o usuário entra com o nome da terceira pessoa

	 
		 //As linhas abaixo imprimem os dados digitados pelo usuário
		 System.out.println("Nome da primeira pessoa: " + nome_1);
 		 System.out.println("Nome da segunda pessoa: " + nome_2);
		 System.out.println("Nome da terceira pessoa: " + nome_3);
		 leitor.close();
	}
}



		
		
		
		
		
		
		
		
		
	


