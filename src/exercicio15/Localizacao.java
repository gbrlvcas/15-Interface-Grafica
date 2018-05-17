package exercicio15;

import java.awt.Color;

import javax.swing.JFrame;

public class Localizacao {

	public Localizacao() {
		
		//JFrame - Criando a caixa
		JFrame local = new JFrame("Localização");
		local.setSize(400,400);
		local.setLocationRelativeTo(null);
		local.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		local.setLayout(null);
		local.getContentPane().setBackground(Color.DARK_GRAY);
		
		//JLabel - Descrição
		JLabel lblEstado = new JLabel("Informe o estado");
		
		//Adicionando ao componente
		
		
		//Exibindo o programa (Parte grafica)
		local.setVisible(true);
	}
}
