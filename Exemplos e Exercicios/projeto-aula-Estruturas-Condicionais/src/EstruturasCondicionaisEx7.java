

		import java.util.Scanner;
		 public class EstruturasCondicionaisEx7 {
		 public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);

		 String nome;
		 int idade;
		 double salario;

		 System.out.println("Digite o seu nome:");
		 nome = leitor.nextLine(); // Nesta linha o usu�rio entra com o nome

		 System.out.println("Digite a sua idade:");
		 idade = leitor.nextInt(); // Nesta linha o usu�rio entra com idade

		 System.out.println("Digite o seu salario:");
		 salario = leitor.nextDouble(); // Nesta linha o usu�rio entra com o  sal�rio  

		
		 //As linhas abaixo imprimem os dados digitados pelo usu�rio
		 System.out.println("NOME: " + nome);
		 System.out.println("IDADE: " + idade);
		 System.out.println("SAL�RIO:" + salario);
      leitor.close();
	}

}
