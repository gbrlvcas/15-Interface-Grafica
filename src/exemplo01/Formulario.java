package exemplo01;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario {

	//Construtor
	public Formulario() {
		
		//JFrame
		JFrame frm = new JFrame("Exercicio 01"); //Criar o JFrame e colocar o nome do titulo
		frm.setSize(500, 300); //Setar o tamanho da caixa
		frm.setLocationRelativeTo(null); //Centralizar a caixa
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Quando o cliente fechar, a caixa fecha e não fica oculta
		frm.setLayout(null); //Poder criar o layout dos elementos "Basico"
		
		//JLabel
		JLabel lblNomeProduto = new JLabel("Informe o produto"); //Descrição
		lblNomeProduto.setBounds(10, 20, 150, 20); //Posição da descrição
		
		JLabel lblPagamentoProduto = new JLabel("Informe a forma de pagamento"); //Descrição
		lblPagamentoProduto.setBounds(10, 100, 180, 20); //Posição da descrição
		
		JLabel lblValorProduto = new JLabel("Informe o valor do produto"); //Descrição
		lblValorProduto.setBounds(10, 180, 150, 20); //Posição da descrição
		
		//JTextField
		JTextField txtNomeProduto = new JTextField(); //Criado a caixa para o cliente digitar
		txtNomeProduto.setBounds(130, 20, 200, 20); //Posição da caixa
		
		JTextField txtValorProduto = new JTextField(); //Criado a caixa para o cliente digitar
		txtValorProduto.setBounds(190, 100, 200, 20); //Posição da caixa
		
		
		//Adiciionar componentes ao JFrame
		frm.add(lblNomeProduto);
		frm.add(lblPagamentoProduto);
		frm.add(lblValorProduto);
		
		frm.add(txtNomeProduto);
		frm.add(txtValorProduto);
		
		//Exibir o formulario e seus componentes
		frm.setVisible(true); //Fazer com que a caixa fique visivel
	}

}











