package exercicio02;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calendario {

	//Construtor
	public Calendario() {
		
		//JFrame - Criando a caixa
		JFrame calen = new JFrame("Calendario");
		calen.setSize(300, 200);
		calen.setLocationRelativeTo(null);
		calen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calen.setLayout(null);
		calen.getContentPane().setBackground(Color.BLUE);
		
		
		//JLabel - Descrição
		JLabel lblData = new JLabel("Informe a data");
		lblData.setBounds(35, 25, 150, 100);
		lblData.setFont(new Font("Arial", Font.BOLD, 20));
		lblData.setForeground(Color.WHITE);
		
		//JTextField
		JTextField txtData = new JTextField();
		txtData.setBounds(185, 50, 50, 50);
		txtData.setFont(new Font("Calibri", Font.BOLD, 20));
		txtData.setHorizontalAlignment(SwingConstants.CENTER);
		
		//JButton
		JButton btn = new JButton ("Terminei!");
		btn.setBounds(90, 120, 100, 30);
		
		//Função do botao
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String data = txtData.getText();
				
				//Criar Objeto
				Acao a = new Acao(data);
				
				//Limpar o campo
				txtData.setText("");
				
				//Selecionar o campo
				txtData.requestDefaultFocus();
				
			}
		});
		
		
		
		
		//Adicionando o componente
		
			//Label
			calen.add(lblData);
			
			//JText
			calen.add(txtData);
			
			//JButton
			calen.add(btn);
			
		//Exibindo o calendario
		calen.setVisible(true);
		
	}


}
