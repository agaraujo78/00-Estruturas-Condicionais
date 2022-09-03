// Verificar se a nota do aluno é maior ou igual a 6
// Agora, vamos ver o mesmo exemplo, mas utilizando a
//instrução if com as codições de verdadeiro ou falso.
public class EstruturasCondicionaisEx2 {
	public static void main(String[] args) {
		int nota1 = 6;
		int nota2 = 8;
		//Calcula a média
		int media = (nota1 + nota2)/2;	
		//verifica se a media émaior ou igual a 6
		if (media >= 6)
			System.out.println("Aprovado");	
		else
			System.out.println("Reprovado");	
	}
}


