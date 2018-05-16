package exemplo01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formulario {

	//Construtor
	public Formulario() {
		
		//JFrame
		JFrame frm = new JFrame("Exercicio 01"); //Criar o JFrame e colocar o nome do titulo
		frm.setSize(380, 300); //Setar o tamanho da caixa
		frm.setLocationRelativeTo(null); //Centralizar a caixa
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Quando o cliente fechar, a caixa fecha e não fica oculta
		frm.setLayout(null); //Poder criar o layout dos elementos "Basico"
		
		//JLabel
		JLabel lblNomeProduto = new JLabel("Informe o produto"); //Descrição
		lblNomeProduto.setBounds(20, 20, 150, 20); //Posição da descrição
		
		JLabel lblPagamentoProduto = new JLabel("Informe a forma de pagamento"); //Descrição
		lblPagamentoProduto.setBounds(20, 60, 180, 20); //Posição da descrição
		
		JLabel lblValorProduto = new JLabel("Valor do produto"); //Descrição
		lblValorProduto.setBounds(20, 100, 130, 20); //Posição da descrição
		
		//JTextField
		JTextField txtNomeProduto = new JTextField(); //Criado a caixa para o cliente digitar
		txtNomeProduto.setBounds(130, 20, 200, 20); //Posição da caixa
		
		JTextField txtValorProduto = new JTextField(); //Criado a caixa para o cliente digitar
		txtValorProduto.setBounds(180, 100, 150, 20); //Posição da caixa
		
		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(200, 60, 130, 20);
		combo.addItem("A Vista");
		combo.addItem("A Prazo");
		
		//JButton
		JButton btn = new JButton ("Calcular");
		btn.setBounds(120, 150, 130, 20);
		
		//Adicionando ação ao JButton
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter daqdos informados pelo usuário
				String nomeProduto = txtNomeProduto.getText();
				String formaPagamento = combo.getSelectedItem().toString();
				String valorProduto = txtValorProduto.getText();
				
				//Criar objetos
				Acao a = new Acao(nomeProduto, formaPagamento, valorProduto);
				
			}
		});
		
		
		//Adicionar componentes ao JFrame
		frm.add(lblNomeProduto);
		frm.add(lblPagamentoProduto);
		frm.add(lblValorProduto);
		
		frm.add(txtNomeProduto);
		frm.add(txtValorProduto);
	
		frm.add(combo);
		frm.add(btn);
		
		//Exibir o formulario e seus componentes
		frm.setVisible(true); //Fazer com que a caixa fique visivel
	}

}











