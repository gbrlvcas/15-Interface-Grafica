package exercicio11;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InterfaceGrafica {

	public InterfaceGrafica() {
		
		//JFrame
		
			//Caixa
			JFrame caixa = new JFrame("Lanchonete");
			caixa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			caixa.setSize(500,500);
			caixa.setLocationRelativeTo(null);
		
		//JLabel
			
			//Quantidade
			JLabel lblQuantidade = new JLabel("Quantidade desejada");
			lblQuantidade.setBounds(150, 85, 140, 30);
			lblQuantidade.setFont(new Font("Calibri", Font.BOLD, 15));
			lblQuantidade.setForeground(Color.BLACK);
			lblQuantidade.setBackground(Color.WHITE);
			lblQuantidade.setOpaque(true);
		
		//JText
			
			//Quantidade
			JTextField txtQuantidade = new JTextField();
			txtQuantidade.setBounds(300, 85, 70, 30);
			txtQuantidade.setFont(new Font("Calibri", Font.BOLD, 25));
			txtQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
			
			
		//JComboBox
			
			//Lista de pedidos
			JComboBox<String> pedidos = new JComboBox<>();
			pedidos.setBounds(150, 50, 220, 30);
			pedidos.setFont(new Font("Calibri", Font.BOLD, 15));
			pedidos.addItem("Escolha seu pedido");
			pedidos.addItem("Hambúrguer + Suco de Laranja");
			pedidos.addItem("Sanduíche + Suco de Uva");
			pedidos.addItem("Prato do dia");
			pedidos.addItem("Pizza");
			pedidos.addItem("Lasanha");
			pedidos.addItem("Pão de Queijo");
			pedidos.addItem("Bolo");
			
		//JButton
			
			//Solicitar pedido
			JButton btnPedir = new JButton("Solicitar pedido");
			btnPedir.setBounds(150, 120, 220 ,30);
			btnPedir.setFont(new Font("Calibri", Font.BOLD, 17));
		
		
//Adicionando componentes ===========================================================		
	
		//Background
		JLabel BG = new JLabel(new ImageIcon("C:\\Users\\Gbrlvcas\\Desktop\\Programacao\\15-Interface-Grafica\\src\\exercicio11\\Lanchonete.jpg"));
		BG.setOpaque(true);
		
		//Adicionar componentes ao programa
		
		//JLabel e JText
			
			//Quantidade
			caixa.add(lblQuantidade);
			caixa.add(txtQuantidade);
			
		//Botão
			
			//Solicitar pedido
			caixa.add(btnPedir);
			
			
		//ComboBox - Pedidos
		caixa.add(pedidos);
		
		//Background
		caixa.add(BG);
		
		
		
		//Deixando o programa visivel
		caixa.setVisible(true);
	}
}
