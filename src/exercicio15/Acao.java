package exercicio15;

import javax.swing.JOptionPane;

public class Acao {
	
	//Construtor
	public Acao(String cidade) {
		
		JOptionPane.showMessageDialog(null, descricaoCidade(cidade));
	}
		
	//M�todo - Cidade selecionada
	private String descricaoCidade(String cidade) {
		
		//Variavel
		String infoCidade = "";
		
		if(cidade.equals("Blumenau")) {
			infoCidade = "Popula��o: \nIDH: \nAtra��o principal: Oktoberfest";
		}

		//Retonar
		return infoCidade;
	}
		
	}
	
