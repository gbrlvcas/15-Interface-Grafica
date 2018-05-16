package exemplo01;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario {

	//Construtor
	public Formulario() {
		
		//JFrame
		JFrame frm = new JFrame("Exercicio 01");
		frm.setVisible(true);
		frm.setSize(500, 300);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		//JLabel
		JLabel lblNomeProduto = new JLabel("Informe o prodto");
		lblNomeProduto.setBounds(20, 20, 150, 20);
		
		JLabel lblPagamentoProduto = new JLabel("Informe a forma de pagamento");
		lblPagamentoProduto.setBounds(20, 120, 180, 20);
		
		JLabel lblValorProduto = new JLabel("Informe o valor do produto");
		lblValorProduto.setBounds(20, 200, 150, 20);
		
		//Adiciionar componentes ao JFrame
		frm.add(lblNomeProduto);
		frm.add(lblPagamentoProduto);
		frm.add(lblValorProduto);
		
	}

}











