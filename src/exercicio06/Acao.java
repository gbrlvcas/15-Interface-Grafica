package exercicio06;


public class Acao {

	//Atributos
	String resultado = "";
	boolean erro = false;
	public static double armazenaValor = 0;

	public Acao(String quantidade, String valor ){
		
		
		//Condicional
		erro = erroQuantidade(quantidade);
		
		if(erro == true){
			resultado = "Digite apenas números";
		}
		
		
		
	}
	
	//Método de validação
	private boolean erroQuantidade(String quantidade){
		
		//Variavel
		boolean erro = false;
		Double validaValor;
		
		//Validador - A variavel "validaValor" ira converter o String para Int, se for digitado uma letra, a conversão dará erro.
		
		try{
			
			validaValor = Double.parseDouble(quantidade);
			
		}catch(Exception e){
			erro = true;
		}
		

		//Retornar valor
		return erro;
	}
	
	//Método para calcular o valor
	public static double calcResultado(String quantidade, String valor){
		
		
		
		//Calculando
		armazenaValor += Double.parseDouble(quantidade) * Double.parseDouble(valor);
		
		//Retornar
		return armazenaValor;
		
	}
}
