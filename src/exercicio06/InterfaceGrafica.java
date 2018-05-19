package exercicio06;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InterfaceGrafica {

	public InterfaceGrafica(){
		
	//Caixa
	JFrame contaDin = new JFrame("Contador de dinheiro");
	contaDin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	contaDin.setSize(500,380);
	contaDin.setLocationRelativeTo(null);
	contaDin.getContentPane().setBackground(Color.DARK_GRAY);
	contaDin.setLayout(null);
	
	//BackGround
	JLabel bg = new JLabel(new ImageIcon("C:\\Users\\Gbrlvcas\\Desktop\\Programacao\\15-Interface-Grafica\\src\\exercicio06\\dindin.gif"));
	bg.setBounds(-150, 0, 700, 346);
	
	//Fala Julius [1]
	JLabel lbljulius = new JLabel("Voce esta gastando 45 centavos para programar isso");
	lbljulius.setBounds(0, 303, 500, 20);
	lbljulius.setFont(new Font("Arial", Font.BOLD, 18));
	lbljulius.setForeground(Color.BLACK);
	lbljulius.setBackground(Color.WHITE);
	lbljulius.setOpaque(true);
	
	//Decrição da caixa [J]
	JLabel lblquant = new JLabel("Digite a quantidade");
	lblquant.setBounds(270, 20, 300, 50);
	lblquant.setFont(new Font("Arial", Font.BOLD, 20));
	lblquant.setForeground(Color.WHITE);
	
	//Digitar na caixa [1]
	JTextField txtquant = new JTextField();
	txtquant.setBounds(330, 60, 50, 50);
	txtquant.setFont(new Font("Calibri", Font.BOLD, 20));
	txtquant.setHorizontalAlignment(SwingConstants.CENTER);
	
	//Descrição combobox [2]
	JLabel lblvalores = new JLabel("Selecione o valor");
	lblvalores.setBounds(280, 120, 200, 50);
	lblvalores.setFont(new Font("Arial", Font.BOLD, 20));
	lblvalores.setForeground(Color.WHITE);
	
	//Selecionar o valor [2]
	JComboBox<String> valores = new JComboBox<>();
	valores.setBounds(310, 160, 100, 50);
	valores.setFont(new Font("Calibri", Font.BOLD, 20));
	valores.addItem("   Valor");
	valores.addItem(" 0.01");
	valores.addItem(" 0.05");
	valores.addItem(" 0.10");
	valores.addItem(" 0.25");
	valores.addItem(" 0.50");
	valores.addItem(" 1.00");

	//Botão para calcular [3]
	JButton btncalc = new JButton("Calcular");
	btncalc.setBounds(310, 220, 100, 50);
	
	
	//Resultado
	JLabel resultado = new JLabel("");
	resultado.setBounds(30, 220, 200, 50);
	resultado.setFont(new Font("Calibri", Font.BOLD, 40));
	resultado.setForeground(Color.WHITE);
	
	//Resultado
	JLabel erro = new JLabel("");
	erro.setBounds(30, 220, 220, 50);
	erro.setFont(new Font("Calibri", Font.BOLD, 22));
	erro.setForeground(Color.WHITE);
	
	
	//Ação do botão [3]
	btncalc.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
		String quantidade = txtquant.getText();
		String valor = valores.getSelectedItem().toString();
		
		
		Acao a = new Acao(quantidade, valor);
		
		if(a.erro == true) {
			erro.setText(a.resultado);
		}else {
			erro.setText("");
			resultado.setText(String.valueOf("R$ "+a.calcResultado(quantidade, valor)));
			
		}
		}
		
	});
		
	//Adicionando os componentes

		//Texto
		contaDin.add(lblquant);
		
		//Caixa de texto
		contaDin.add(lbljulius);
		contaDin.add(txtquant);
		contaDin.add(lblvalores);
		contaDin.add(resultado);
		contaDin.add(erro);
		
		//Combobox
		contaDin.add(valores);
		
		//Botão
		contaDin.add(btncalc);
		
		//Background
		contaDin.add(bg);
	
	//Mostrando Interface Grafica
	contaDin.setVisible(true);
}
}



