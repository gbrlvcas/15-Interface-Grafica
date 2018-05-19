package exercicio06;


public class Acao {

	//Atributos
	String resultado = "";
	boolean erro = false;
	public static double armazenaValor = 0;

	public Acao(String quantidade, String valor ){
		
		//Variaveis
	
		if(erro == true){
			resultado = "Digite apenas n�meros";
		}
	}
	
	//M�todo de valida��o
	private boolean erroQuantidade(String quantidade){
		
		//Variavel
		boolean erro = false;
		Double validaValor;
		
		//Validador - A variavel "validaValor" ira converter o String para Int, se for digitado uma letra, a convers�o dar� erro.
		
		try{
			
			validaValor = Double.parseDouble(quantidade);
			
		}catch(Exception e){
			erro = true;
		}
		
		//Retornar valor
		return erro;
	}
	
	//M�todo para calcular o valor
	public static void calcResultado(String quantidade, String valor){
		
		//Variaveis
		double calculo = 0;
		
		//Calculando
		calculo += Double.parseDouble(quantidade) * Double.parseDouble(valor);
		
		
		
	}
}
