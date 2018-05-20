package exercicio07;

public class Acao {
	
	//Atributos
	double validar;
	String resultado;
	String situacao;

	
	
	//Construtor
	
	public Acao(String nota1, String nota2, String nota3, String nota4) {
		
		//Variaveis
		int codErro = validaNota(nota1, nota2, nota3, nota4);
		
		
		//Condicional
		if(codErro == 1) {
			resultado= "";
			situacao = "Não deixe campo em branco";
			
		}else if(codErro == 2) {
			resultado = "";
			situacao = "Digite apenas números";
			
		}else if(codErro == 3) {
			resultado = "";
			situacao = "Digite notas entre 1 e 10";
			
		}else if(codErro == 0) {
			resultado = String.valueOf(calcularMedia(nota1, nota2, nota3, nota4));
			situacao = situacaoAluno(nota1, nota2, nota3, nota4);
		}
	}
	
	//Método de validação
	public int validaNota(String nota1, String nota2, String nota3, String nota4) {
		
		//Variaveis
		int codErro = 0;
		
		//Validação
		
			//Caso deixe o campo em branco
			if(nota1.equals("") || nota2.equals("") || nota3.equals("") || nota4.equals("")) {
				codErro = 1;
		
			}
			
			//Caso digite algo diferente de um número
			if(codErro == 0) {	
				try {
					
					validar = Double.parseDouble(nota1);
					validar = Double.parseDouble(nota2);
					validar = Double.parseDouble(nota3);
					validar = Double.parseDouble(nota4);
				
				
				}catch(Exception e) {
				codErro = 2;
				
				}
		
			}
			
			//Caso digite menos que 1 ou mais que 10
			if(codErro == 0) {
				
				if(Double.parseDouble(nota1) < 1 || Double.parseDouble(nota1) > 10) {
					codErro = 3;
					
				}else if(Double.parseDouble(nota2) < 1 || Double.parseDouble(nota2) > 10) {
					codErro = 3;
					
				}else if(Double.parseDouble(nota3) < 1 || Double.parseDouble(nota3) > 10) {
					codErro = 3;
					
				}else if(Double.parseDouble(nota4) < 1 || Double.parseDouble(nota4) > 10) {
					codErro = 3;
				}
			
		}
			
		//Retonar
		return codErro;

	}
	
	//Método para calular a média e dar o resultado
	public double calcularMedia(String nota1, String nota2, String nota3, String nota4) {
		
		//Variaveis
		double n1, n2, n3, n4, media;
		
		//Calculo
		n1 = Double.parseDouble(nota1);
		n2 = Double.parseDouble(nota2);
		n3 = Double.parseDouble(nota3);
		n4 = Double.parseDouble(nota4);
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		//Retonar
		return media;
	}
	
	//Método para ver qual a situação do aluno
	public String situacaoAluno(String nota1, String nota2, String nota3, String nota4) {
		
		//Variaveis
		String situacao;
		double mediaSituacao = calcularMedia(nota1, nota2, nota3, nota4);
		
		
		//Condicional
		if(mediaSituacao < 5) {
			situacao = "Reprovado";
			
		}else if(mediaSituacao < 7) {
			situacao = "Em Exame";
			
		}else if(mediaSituacao < 9) {
			situacao = "Bom";
					
		}else if(mediaSituacao < 10) {
			situacao = "Ótimo";
			
		}else {
			situacao = "Parabéns";
		}
		
		//Retornar
		return situacao;
		
	}
	
}
