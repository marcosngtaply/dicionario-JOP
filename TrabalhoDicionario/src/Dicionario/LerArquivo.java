package Dicionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LerArquivo {
	
	//teste

	private String nomeArq;//Endereço do arquivo no computador
	private String[] vetorTxt;
	private int tamanhoVetor;
	
	public LerArquivo(String nomeArq, String[] vetorTxt, int tamanhoVetor) {
		this.nomeArq = nomeArq;
		this.vetorTxt = vetorTxt;
		this.tamanhoVetor = tamanhoVetor;
		
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
		JOptionPane.showMessageDialog(null,"Arquivo lido e vetor criado com sucesso!");
		
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Erro na leitura do arquivo: " + 
	                e.getMessage());
	    }
		
		return vetorTxt;
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
	public void getVetorTxt() {
		for(int i = 0; i < vetorTxt.length - 1; i++) {
			System.out.println(vetorTxt[i]);
		}
		/*long tempo = System.nanoTime();
		System.out.println(tempo);
		long tempoMili = System.currentTimeMillis();
		System.out.println(tempoMili);
		Código que conta o tempo, ainda precisando de uma forma de implementação*/
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
