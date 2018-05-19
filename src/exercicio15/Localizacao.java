package exercicio15;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Localizacao {

	public Localizacao() {

		// JFrame - Criando a caixaa
		JFrame local = new JFrame("Localização");
		local.setSize(400, 400);
		local.setLocationRelativeTo(null);
		local.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		local.setLayout(null);
		local.getContentPane().setBackground(Color.DARK_GRAY);

		// JLabel - Descrição

		// Estado
		JLabel lblEstado = new JLabel("Escolha o estado");
		lblEstado.setBounds(100, 20, 200, 20);
		lblEstado.setFont(new Font("Arial", Font.BOLD, 20));
		lblEstado.setForeground(Color.WHITE);

		// Cidades
		JLabel lblcidades = new JLabel("Escolha a cidade");
		lblcidades.setBounds(100, 100, 200, 20);
		lblcidades.setFont(new Font("Arial", Font.BOLD, 20));
		lblcidades.setForeground(Color.WHITE);
		

		// JComboBox - Estados
		JComboBox<String> estados = new JComboBox<>();
		estados.setBounds(100, 40, 200, 40);
		estados.addItem("Selecione um estado");
		estados.addItem("Santa Catarina");
		estados.addItem("Parana");
		estados.addItem("Rio Grande do Sul");
		estados.setFont(new Font("Calibri", Font.BOLD, 16));

		// JComboBox - Cidades
		JComboBox<String> cidades = new JComboBox<>();
		cidades.setBounds(100, 120, 200, 40);
		cidades.setSelectedIndex(-1);
		cidades.setFont(new Font("Calibri", Font.BOLD, 16));
		

		// JButton
		JButton btn = new JButton("Prosseguir");
		btn.setBounds(140, 300, 100, 50);

		// Função do botão
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				

				// Obter os dados
				String estado = estados.getSelectedItem().toString();

				if (cidades.getItemCount() == 0) {
					switch (estado) {
					case "Selecione um estado":
						cidades.setSelectedItem(-1);
						break;
						
					case "Santa Catarina":
						cidades.addItem("Selecione uma cidade");
						cidades.addItem("Blumenau");
						cidades.addItem("Penha");
						cidades.addItem("Balneario Camboriu");
						break;
						
					case "Parana":
						cidades.addItem("Selecione uma cidade");
						cidades.addItem("Curitiba");
						cidades.addItem("Foz do Iguaço");
						cidades.addItem("Pinhais");
						break;
						
					case "Rio Grande do Sul":
						cidades.addItem("Selecione uma cidade");
						cidades.addItem("Porto Alegre");
						cidades.addItem("Gramado");
						cidades.addItem("Pelotas");
					}
					
					
				}else {

					// Variavel para usar na acao
					String cidade = cidades.getSelectedItem().toString();

					// Criando o Objeto
					Acao a = new Acao(cidade);
					
					// Limpar estados
					cidades.removeAllItems();

				}

			}
		});

		// Adicionando ao componente

		// JFrame
		local.add(lblEstado);
		local.add(lblcidades);

		// ComboBox - Estado
		local.add(estados);
		local.add(cidades);

		// Botão
		local.add(btn);

		// Exibindo o programa (Parte grafica)
		local.setVisible(true);
	}
}
