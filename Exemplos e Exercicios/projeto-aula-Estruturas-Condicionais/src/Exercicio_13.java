
import java.util.Scanner;
public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int macas;
		double custoTotal;
		
		System.out.printf("Digite a quantidade de ma��s:");
			macas = leitor.nextInt();
			
		if (macas < 12) {
			custoTotal = macas*1.30;
		}else {
			custoTotal = macas*1.00;
		}
		System.out.printf("A quantidade de ma��s �: %s\nO valor total da compra �: R$ %.2f.", macas, custoTotal);
		leitor.close();
	}

}
