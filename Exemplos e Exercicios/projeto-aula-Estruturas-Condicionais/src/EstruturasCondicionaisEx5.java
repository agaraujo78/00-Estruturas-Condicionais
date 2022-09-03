
public class EstruturasCondicionaisEx5 {

	public static void main(String[] args) {
		
	      float imc = 18;
	 
		
		if(imc < 17)
			System.out.println("Muito Abaixo do peso");
		else if(imc>=17 && imc <=18.49)
			System.out.println("Abaixo do peso");
		else if(imc >=18.50 && imc<=24.99)
			System.out.println("Peso normal");
		else if(imc >=25 && imc<=29.99)	
			System.out.println("Acima do peso");
		else if(imc >=30 && imc<=34.99)
			System.out.println("Obesidade I"); 	
		else if(imc >=35 && imc <=39.99)
			System.out.println("Obesidade II (severa)");
		else
			System.out.println("Obesidade III (mórbida)");	
		
	
	}

}
