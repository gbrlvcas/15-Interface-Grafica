package exercicio03;

public class Acao {

	public Acao(String num1, String num2) {
		
		
		
		
	}
	
	//Validador
	private String validadors(String num1, String num2) {
		
		//Variaveis
		String resultado = "";
		
		
		if(num1.equals("") || num2.equals("")) {
			resultado = "Prencha os dois campos";
		}else if(Integer.parseInt(num1) == Integer.parseInt(num2)) {
			resultado = num1 + num2;
		}else{
			resultado = Integer.parseInt(num1) * Integer.parseInt(num2);
		}
		
		//Retorno
		
		return resultado;
	}
	
}
