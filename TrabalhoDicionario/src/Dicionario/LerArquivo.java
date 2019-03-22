package Dicionario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LerArquivo {
	
	

	private String nomeArq;//Endereço do arquivo no computador
	private String[] vetorTxt;
	private int tamanhoVetor;
	
	public LerArquivo(String nomeArq, String[] vetorTxt, int tamanhoVetor) {
		this.nomeArq = nomeArq;
		this.vetorTxt = vetorTxt;
		this.tamanhoVetor = tamanhoVetor;
		
	}

	public LerArquivo(String nomeArq) {
		this.nomeArq = nomeArq;
	}
	public LerArquivo() {
		
	}

	public String[] CriarVetor() {
		
		try {
			FileReader localArq = new FileReader(nomeArq);
			//para entrada baseada em caracteres de um arquivo.
			BufferedReader leitorDeLinhas = new BufferedReader(localArq);
			//leitor de linhas do arquivo de entrada(FileReader(nomeArq)
			
			String linha = " "; 
			//Variável para receber as linhas comop Strings
			linha = leitorDeLinhas.readLine();
			this.tamanhoVetor = Integer.parseInt(linha);
			
			vetorTxt = new String[tamanhoVetor + 1];
			/*esse +1 vem por conta do arquivo ter uma linha a mais justamente 
			  por informar a quantia de linhas do vetor.*/
			int i = 0;
			
				while(linha != null) {
					linha = leitorDeLinhas.readLine();
					vetorTxt[i] = linha;
					i++;
				}
				
		localArq.close();
		JOptionPane.showMessageDialog(null,"Arquivo Dicionário lido e vetor criado com sucesso!");
		
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Erro na leitura do arquivo: " + 
	                e.getMessage());
	    }
		this.tamanhoVetor = vetorTxt.length;
		return vetorTxt;
		
	}
  
	public void EscreverVetorTxt(String[] vetorOrdenado, String path) throws IOException {
		
			FileWriter endereco = new FileWriter(path);
			BufferedWriter escrever = new BufferedWriter(endereco);
	        String linha = "";
	       
	        
	        	for(int i = 0; i < vetorOrdenado.length; i++) {
	        		try {
	        		
	        		System.out.println(vetorOrdenado[i] + "|" + vetorOrdenado[i].length() + "|");
	        		linha = vetorOrdenado[i] + " |" + vetorOrdenado[i].length() + "|\n";
	        		escrever.append(linha);
	        		
	            
	        		}
	        		catch (IOException e) { 
		    			e.printStackTrace();
		    			
	        		}
	        		escrever.close();
	        	
	        	}
	        endereco.close();
			JOptionPane.showMessageDialog(null,"VetorOrdenado salvo em Txt com sucesso!");
    	
    }
 	
		
	public void VerPosicao(int posicao) {
		for(int i = 0; i < posicao; i++) {
			System.out.println(vetorTxt[i]);
		}
		
	}
	
	public String getNomeArq() {
		return nomeArq;
	}
	public void setNomeArq(String nomeArq) {
		this.nomeArq = nomeArq;
	}
	public String[] getVetorTxt() {
		return vetorTxt;
		
	}
	public void setVetorTxt(String[] vetorTxt) {
		this.vetorTxt = vetorTxt;
	}
	public int getTamanhoVetor() {
		return tamanhoVetor;
	}
	public void setTamanhoVetor(int tamanhoVetor) {
		this.tamanhoVetor = tamanhoVetor;
	}
	
	
}
