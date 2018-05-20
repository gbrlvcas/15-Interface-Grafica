package exercicio07;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InterfaceGrafica {

	public InterfaceGrafica() {
	
	//JFrame - Caixa
	JFrame caixa = new JFrame("Situação aluno");
	caixa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	caixa.setSize(600, 400);
	caixa.setLocationRelativeTo(null);
	caixa.getContentPane().setBackground(Color.DARK_GRAY);
	
	
	
//Criar componentes ================================================================================================================
	
	
	//JLabel e JText - Descrever e solicitar nota
	
		//Primeira nota - Descrição
		JLabel lblnota1 = new JLabel("Primeiro semestre");
		lblnota1.setBounds(20, 10, 200, 20);
		lblnota1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblnota1.setForeground(Color.WHITE);
		
		//Primeira nota - Solicitar nota
		JTextField txtnota1 = new JTextField();
		txtnota1.setBounds(70, 35, 50, 40);
		txtnota1.setFont(new Font("Calibri", Font.CENTER_BASELINE, 20));
		txtnota1.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Segunda nota - Descrição
		JLabel lblnota2 = new JLabel("Segundo semestre");
		lblnota2.setBounds(20, 95, 200, 20);
		lblnota2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblnota2.setForeground(Color.WHITE);
				
		//Segunda nota - Solicitar nota
		JTextField txtnota2 = new JTextField();
		txtnota2.setBounds(70, 120, 50, 40);
		txtnota2.setFont(new Font("Calibri", Font.CENTER_BASELINE, 20));
		txtnota2.setHorizontalAlignment(SwingConstants.CENTER);
				
		//Terceira nota - Descrição
		JLabel lblnota3 = new JLabel("Terceiro semestre");
		lblnota3.setBounds(20, 175, 200, 20);
		lblnota3.setFont(new Font("Calibri", Font.BOLD, 20));
		lblnota3.setForeground(Color.WHITE);
						
		//Terceira nota - Solicitar nota
		JTextField txtnota3 = new JTextField();
		txtnota3.setBounds(70, 200, 50, 40);
		txtnota3.setFont(new Font("Calibri", Font.CENTER_BASELINE, 20));
		txtnota3.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Quarta nota - Descrição
		JLabel lblnota4 = new JLabel("Quarto semestre");
		lblnota4.setBounds(20, 255, 200, 20);
		lblnota4.setFont(new Font("Calibri", Font.BOLD, 20));
		lblnota4.setForeground(Color.WHITE);
								
		//Quarta nota - Solicitar nota
		JTextField txtnota4 = new JTextField();
		txtnota4.setBounds(70, 280, 50, 40);
		txtnota4.setFont(new Font("Calibri", Font.CENTER_BASELINE, 20));
		txtnota4.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Resultado e Situação
		
			//Resultado
			JLabel lblResult = new JLabel("");
			lblResult.setBounds(300, 75, 100, 50);
			lblResult.setFont(new Font("Calibri", Font.BOLD, 40));
			lblResult.setForeground(Color.BLACK);
			lblResult.setBackground(Color.WHITE);
			lblResult.setOpaque(true);
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			
			//Situação
			JLabel lblSituacao = new JLabel("");
			lblSituacao.setBounds(250, 200, 200, 50);
			lblSituacao.setForeground(Color.BLACK);
			lblSituacao.setBackground(Color.WHITE);
			lblSituacao.setOpaque(true);
			lblSituacao.setHorizontalAlignment(SwingConstants.CENTER);
		
			
			
			
//Botao e Função ===================================================================================================================	
		
		
		//Botão de calcular
		JButton btnCalc = new JButton("Calcular");
		btnCalc.setBounds(275, 280, 150, 40);
		btnCalc.setFont(new Font("Calibri", Font.BOLD, 20));
		
		//Função
		btnCalc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String nota1 = txtnota1.getText();
				String nota2 = txtnota2.getText();
				String nota3 = txtnota3.getText();
				String nota4 = txtnota4.getText();
				
				//Passando variaveis para classe [AÇÃO]
				
				Acao a = new Acao(nota1, nota2, nota3, nota4);
				
					if(a.validaNota(nota1, nota2, nota3, nota4) == 1) {
						lblResult.setText(a.resultado);
						lblSituacao.setText(a.situacao);
						lblSituacao.setFont(new Font("Calibri", Font.BOLD, 16));
						
					}else if(a.validaNota(nota1, nota2, nota3, nota4) == 2) {
						lblResult.setText(a.resultado);
						lblSituacao.setText(a.situacao);
						lblSituacao.setFont(new Font("Calibri", Font.BOLD, 20));
						
					}else if(a.validaNota(nota1, nota2, nota3, nota4) == 3) {
						lblResult.setText(a.resultado);
						lblSituacao.setText(a.situacao);
						lblSituacao.setFont(new Font("Calibri", Font.BOLD, 16));
						
					}else if(a.validaNota(nota1, nota2, nota3, nota4) == 0) {
						lblResult.setText(a.resultado);
						lblSituacao.setText(a.situacao);
						lblSituacao.setFont(new Font("Calibri", Font.BOLD, 30));
					
			}
			}
		});
		
		
		
		
//Adicionar componentes ======================================================================================================================	
	
		//Background
		JLabel BG = new JLabel(new ImageIcon("C:\\Users\\Gbrlvcas\\Desktop\\Programacao\\15-Interface-Grafica\\src\\exercicio07\\escola.jpg"));
		BG.setSize(600,400);
		BG.setBounds(1, 1, 600,400);
		
	
	//Adicionar componentes ao programa
		
		//Notas
		
			//Primeira nota
			caixa.add(lblnota1);
			caixa.add(txtnota1);
			
			//Segunda nota
			caixa.add(lblnota2);
			caixa.add(txtnota2);
			
			//Terceira nota
			caixa.add(lblnota3);
			caixa.add(txtnota3);
			
			//Quartas nota
			caixa.add(lblnota4);
			caixa.add(txtnota4);
			
		//Resultado e Situação
		caixa.add(lblResult);
		caixa.add(lblSituacao);
			
		//Botão
		caixa.add(btnCalc);
		
		//Background
		caixa.add(BG);
		
	
	//Deixar o programa visivel
	caixa.setVisible(true);
	
	
	
	}
}