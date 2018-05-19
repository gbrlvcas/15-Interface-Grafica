package exercicio03;

public class Acao {
	
	
	
	//Validador
	public String validador(String num1, String num2) {
		
		//Variaveis
		String resultado = "";

		
		
		if((num1.equals("")) || (num2.equals(""))) {
			resultado = "Campo vazio";
		}else if(num1.equals(num2)) {
			resultado = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
		}else{
			resultado = String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
		}
		
		//Retorno
		
		return resultado;
	}
	
}
