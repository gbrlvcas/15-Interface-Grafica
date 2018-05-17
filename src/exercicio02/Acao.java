package exercicio02;

import javax.swing.JOptionPane;

public class Acao {

	//Construtor
	public Acao(String data){
		
		//Obter a validação do campo
		
		boolean valida = validarCampo(data);
		
			//Mensagem da validação
		JOptionPane.showMessageDialog(null, valida == true ? "Falha!" : "O dia escolhido cai num...");
		
			//Verificar se o campo esta validado
		if(valida == true) {
			JOptionPane.showMessageDialog(null, "Digite uma data entre 1 e 28");
		}else{
			
			JOptionPane.showMessageDialog(null, diaNome(data));
		}
	}
	
	//Método de validação de campo
	private boolean validarCampo(String data){
		
		//Variavel
		boolean valida = false;
		int dataNum = Integer.parseInt(data);
		
		if(dataNum < 1 || dataNum > 28){
			valida = true;
		}
		
		//Retorno
		return valida;
	}
	
	//Método decifrar o dia da semana
	private String diaNome(String data){
		
		//Variaveis
		int dataNum = Integer.parseInt(data);
		String nomeDia = "";
		
		//Condicional
		switch(dataNum){
		case 3:
		case 4:
		case 10:
		case 11:
		case 17:
		case 18:
		case 26:
		case 27:
			nomeDia = "Fim de semana";
			break;
		default:
			nomeDia = "Dia de semana";
			break;
			
		}
		
		//Retornar 
		return nomeDia;
	}
}
