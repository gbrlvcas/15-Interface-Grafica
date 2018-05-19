package exercicio03;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculo {

	//Construtor
	public Calculo() {
		
		//Caixa
		JFrame cx = new JFrame("Program de calculo básico");
		cx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cx.setSize(300, 400);
		cx.setLocationRelativeTo(null);
		cx.getContentPane().setBackground(Color.DARK_GRAY);
		cx.setLayout(null);
		
		//Texto (Mensagem solicitando primeiro numero)
		JLabel lblnum1 = new JLabel("Digite o primeiro número");
		lblnum1.setBounds(50, 10, 200, 50);
		lblnum1.setFont(new Font("Arial", Font.BOLD, 16));
		int contador = 0;
		lblnum1.setForeground(Color.WHITE);
		
		//Texto (Mensagem solicitando segundo numero)
		JLabel lblnum2 = new JLabel("Digite o segundo número");
		lblnum2.setBounds(50, 100, 200, 50);
		lblnum2.setFont(new Font("Arial", Font.BOLD, 16));
		lblnum2.setForeground(Color.WHITE);
		
		//Resultado
		JLabel lblresult = new JLabel("");
		lblresult.setBounds(45, 270, 200, 50);
		lblresult.setFont(new Font("Arial", Font.BOLD, 30));
		lblresult.setForeground(Color.WHITE);
		lblresult.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		//Campo (Escrever o primeiro numero)
		JTextField txtnum1 = new JTextField();
		txtnum1.setBounds(120, 50, 50, 50);
		txtnum1.setFont(new Font("Calibri", Font.BOLD, 30));
		txtnum1.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Campo (Escrever o segundo numero)
		JTextField txtnum2 = new JTextField();
		txtnum2.setBounds(120, 140, 50, 50);
		txtnum2.setFont(new Font("Calibri", Font.BOLD, 30));
		txtnum2.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Botao
		JButton btncalc = new JButton("Calcular");
		btncalc.setBounds(95, 200, 100, 40);
		btncalc.setFont(new Font("Arial", Font.BOLD, 14));
		
		//Ação do botão
		btncalc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//Variaveis
				String num1 = txtnum1.getText();
				String num2 = txtnum2.getText();
				
				//Objeto
				Acao a = new Acao();
				lblresult.setText(a.validador(num1, num2));
			}
		});
		
		
		
		
		//Adicionando ao componente
			
			//Caixas
			cx.add(lblnum1);
			cx.add(lblnum2);
			
			//Campos
			cx.add(txtnum1);
			cx.add(txtnum2);
			
			//Botão
			cx.add(btncalc);
			
			//Resultado
			cx.add(lblresult);
	
		//Tornando a caixa visivel
		cx.setVisible(true);
	}
}
