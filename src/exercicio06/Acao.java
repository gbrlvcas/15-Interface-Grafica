package exercicio06;

import javax.swing.JOptionPane;

public class Acao {

	//Atributos
	Double calculando = 0.00;
	
	public Acao(String quantidade, String valor ){
		
		boolean erro = erroQuantidade(quantidade);
		
		if(erro == true){
			JOptionPane.showMessageDialog(null, "Digite um numero");
		}else{
			JOptionPane.showMessageDialog(null, calcResultado(quantidade, valor));
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
	public Double calcResultado(String quantidade, String valor){
		
		
		//Calculando
		calculando += Double.parseDouble(quantidade) * Double.parseDouble(valor);
		
		return calcResultado(quantidade, valor);
		
		
	}
}
