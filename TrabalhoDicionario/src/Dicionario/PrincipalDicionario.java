package Dicionario;

import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class PrincipalDicionario {
	
	public static void mergeSort(int[] vetor,int[] vetorAuxiliar, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, vetorAuxiliar, inicio, meio);
			mergeSort(vetor, vetorAuxiliar, meio + 1, fim);
			Intercalar(vetor, vetorAuxiliar, inicio, meio, fim);

		}
	}

	public static void Intercalar(int[] vetor, int[] vetorAuxiliar, int inicio, int meio, int fim) {
		for(int k = inicio; k <= meio; k++) {
			vetorAuxiliar[k] = vetor[k];
		}
		for(int k =  meio + 1; k <= fim; k++) {
			vetorAuxiliar[k] = vetor[k];

		}
		int i = inicio;
		int j = meio + 1;
		
		for(int k = inicio; k <= fim; k++) {
			if(i > meio) {
				vetor[k] = vetorAuxiliar[j++];
			}
			
			else if(j > fim) {
				vetor[k] = vetorAuxiliar[i++];
			}
			
			else if(vetorAuxiliar[i] < vetorAuxiliar[j]) {
				vetor[k] = vetorAuxiliar[i++];
			}
			
			else {
				vetor[k] = vetorAuxiliar[j++];
			}
				
		}
		
		
	}
	public static void mergeSortString(String[] vetor,String[] vetorAuxiliar, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSortString(vetor, vetorAuxiliar, inicio, meio);
			mergeSortString(vetor, vetorAuxiliar, meio + 1, fim);
			IntercalarString(vetor, vetorAuxiliar, inicio, meio, fim);

		}
	}
	public static void IntercalarString(String[] vetor, String[] vetorAuxiliar, int inicio, int meio, int fim) {
		for(int i = inicio; i <= meio; i++) {
			vetorAuxiliar[i] = vetor[i];
			//System.out.print(vetorAuxiliar[i] + "|");
		}
		
		for(int j = fim; j >= meio; j--) {
			vetorAuxiliar[j] = vetor[j];
			//System.out.print(vetorAuxiliar[j] + "-");
		}
		
		
		int esquerda = inicio;
		int direita = fim;
		
		for(int k = inicio; k <= fim; k++) {
			if(esquerda < meio) {
				vetor[k] = vetorAuxiliar[esquerda];
				esquerda++;
			}
			
			else if(direita > meio) {
				vetor[k] = vetorAuxiliar[direita];
				direita--;
			}
			
			else if(vetorAuxiliar[esquerda].length() < vetorAuxiliar[esquerda + 1].length()) {
				vetor[k] = vetorAuxiliar[esquerda];
				esquerda++;
			}
			
			else if (vetorAuxiliar[direita].length() < vetorAuxiliar[direita - 1].length()) {
				vetor[k] = vetorAuxiliar[direita];
				direita--;
			}
			
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		/*LerArquivo arq1 = new LerArquivo();
		arq1.setNomeArq("./ArquivosTxt/DicionarioIngles.txt");
		arq1.CriarVetor();
		
		
		//TESTE COM SELECTION SORT
		
		/*JOptionPane.showMessageDialog(null, "Por favor aguarde o processamento das informações...", "Teste com SELECTION SORT", 1);
		
		Ordenacao ordeSelection = new Ordenacao();
		ordeSelection.SelectionSort(arq1.getVetorTxt());
		JOptionPane.showMessageDialog(null, "Milisegundos = "+ ordeSelection.getTempoExecucaoMili()
				+ "\nNanosegundos = "+ ordeSelection.getTempoExecucaoNano()
				+ "\nEquivalente a " + ordeSelection.getTempoExecucaoMili() / 1000 + " segundos", 
				"Tempo de Execução da Ordenação com SelectionSort", 3);
		
		Busca buscaSequencial1 = new Busca();
		JOptionPane.showMessageDialog(null, buscaSequencial1.BuscaSequencial(ordeSelection.getVetorOrdenado(), "counterrevolutionary/SM"), 
				"Relatório de Busca Sequencial", 3);
		JOptionPane.showMessageDialog(null, "Milisegundos = " + buscaSequencial1.getTempoExecucaoMili()
				+"\nNanosegundos = " + buscaSequencial1.getTempoExecucaoNano()
				+"\nEquivalente a " + buscaSequencial1.getTempoExecucaoMili() / 1000 + " segundos",
				"Tempo de Execução da Busca Sequencial", 3);
		
		Busca buscaBinaria1 = new Busca();
		JOptionPane.showMessageDialog(null, buscaBinaria1.BuscaBinaria(ordeSelection.getVetorOrdenado(), "counterrevolution/SM"), 
				"Relatório de Busca Binária", 3);
		JOptionPane.showMessageDialog(null, "Milisegundos = " + buscaBinaria1.getTempoExecucaoMili()
				+"\nNanosegundos = " + buscaBinaria1.getTempoExecucaoNano()
				+"\nEquivalente a " + buscaBinaria1.getTempoExecucaoMili() / 1000 + " segundos",
				"Tempo de Execução da Busca Binária", 3);
		
		//TESTE COM INCERTION SORT
		
		/*JOptionPane.showMessageDialog(null, "Por favor aguarde o processamento das informações...", "Teste com INCERTION SORT", 1);
		
		Ordenacao ordeIncertion = new Ordenacao();
		ordeIncertion.IncertionSort(arq1.getVetorTxt());
		JOptionPane.showMessageDialog(null, "Milisegundos = "+ ordeIncertion.getTempoExecucaoMili()
				+ "\nNanosegundos = "+ ordeIncertion.getTempoExecucaoNano()
				+ "\nEquivalente a " + ordeIncertion.getTempoExecucaoMili() / 1000 + " segundos", 
				"Tempo de Execução da Ordenação com IncertionSort", 3);
		
		Busca buscaSequencial2 = new Busca();
		JOptionPane.showMessageDialog(null, buscaSequencial2.BuscaSequencial(ordeIncertion.getVetorOrdenado(), "counterrevolution/SM"), 
				"Relatório de Busca Sequencial", 3);
		JOptionPane.showMessageDialog(null, "Milisegundos = " + buscaSequencial2.getTempoExecucaoMili()
				+"\nNanosegundos = " + buscaSequencial2.getTempoExecucaoNano()
				+"\nEquivalente a " + buscaSequencial2.getTempoExecucaoMili() / 1000 + " segundos",
				"Tempo de Execução da Busca Sequencial", 3);
		
		Busca buscaBinaria2 = new Busca();
		JOptionPane.showMessageDialog(null, buscaBinaria2.BuscaBinaria(ordeIncertion.getVetorOrdenado(), "counterrevolutionary/SM"), 
				"Relatório de Busca Binária", 3);
		JOptionPane.showMessageDialog(null, "Milisegundos = " + buscaBinaria2.getTempoExecucaoMili()
				+"\nNanosegundos = " + buscaBinaria2.getTempoExecucaoNano()
				+"\nEquivalente a " + buscaBinaria2.getTempoExecucaoMili() / 1000 + " segundos",
				"Tempo de Execução da Busca Binária", 3);*/
		
		//TESTE COM BUBBLE SORT
		
		/*JOptionPane.showMessageDialog(null, "Por favor aguarde o processamento das informações...", "Teste com BUBBLE SORT", 1);
		
		Ordenacao ordeBubble = new Ordenacao();
		ordeBubble.BubbleSort(arq1.getVetorTxt());
		JOptionPane.showMessageDialog(null, "Milisegundos = "+ ordeBubble.getTempoExecucaoMili()
				+ "\nNanosegundos = "+ ordeBubble.getTempoExecucaoNano()
				+ "\nEquivalente a " + ordeBubble.getTempoExecucaoMili() / 1000 + " segundos", 
				"Tempo de Execução da Ordenação com BubbleSort", 1);
		
		Busca buscaSequencial3 = new Busca();
		JOptionPane.showMessageDialog(null, buscaSequencial3.BuscaSequencial(ordeBubble.getVetorOrdenado(), "counterrevolution/SM"), 
				"Relatório de Busca Sequencial", 1);
		JOptionPane.showMessageDialog(null, "Milisegundos = " + buscaSequencial3.getTempoExecucaoMili()
				+"\nNanosegundos = " + buscaSequencial3.getTempoExecucaoNano()
				+"\nEquivalente a " + buscaSequencial3.getTempoExecucaoMili() / 1000 + " segundos",
				"Tempo de Execução da Busca Sequencial", 1);
		
		Busca buscaBinaria3 = new Busca();
		JOptionPane.showMessageDialog(null, buscaBinaria3.BuscaBinaria(ordeBubble.getVetorOrdenado(), "counterrevolutionary/SM"), 
				"Relatório de Busca Binária", 1);
		JOptionPane.showMessageDialog(null, "Milisegundos = " + buscaBinaria3.getTempoExecucaoMili()
				+"\nNanosegundos = " + buscaBinaria3.getTempoExecucaoNano()
				+"\nEquivalente a " + buscaBinaria3.getTempoExecucaoMili() / 1000 + " segundos",
				"Tempo de Execução da Busca Binária", 1);*/
		
		
		//TESTE COM QUICK SORT
		String pathArquivo = "./ArquivosTxt/VetorOrdenadoIngles.txt";
		LerArquivo arq2 = new LerArquivo();
		arq2.setNomeArq("./ArquivosTxt/DicionarioLuxemburguista.txt");
		arq2.CriarVetor();

		JOptionPane.showMessageDialog(null, "Por favor aguarde o processamento das informações...", "Teste com QUICK SORT", 1);
		
		Ordenacao ordeQuick = new Ordenacao();
		ordeQuick.QuickSort(arq2.getVetorTxt(), 1, arq2.getTamanhoVetor() - 2);
		JOptionPane.showMessageDialog(null, "Milisegundos = "+ ordeQuick.getTempoExecucaoMili()
				+ "\nNanosegundos = "+ ordeQuick.getTempoExecucaoNano()
				+ "\nEquivale aproximadamente " + ordeQuick.getTempoExecucaoMili() / 1000 + " segundos", 
				"Tempo de Execução da Ordenação com QuickSort", 3);
		arq2.EscreverVetorTxt(ordeQuick.getVetorOrdenado(), pathArquivo);

		Busca buscaSequencial4 = new Busca();
		JOptionPane.showMessageDialog(null, buscaSequencial4.BuscaSequencial(ordeQuick.getVetorOrdenado(), "abacallanada/VY"), 
				"Relatório de Busca Sequencial", 3);
		JOptionPane.showMessageDialog(null, "Milisegundos = " + buscaSequencial4.getTempoExecucaoMili()
				+"\nNanosegundos = " + buscaSequencial4.getTempoExecucaoNano()
				+"\nEquivalente a " + buscaSequencial4.getTempoExecucaoMili() / 1000 + " segundos",
				"Tempo de Execução da Busca Sequencial", 3);
		
		Busca buscaBinaria4 = new Busca();
		JOptionPane.showMessageDialog(null, buscaBinaria4.BuscaBinaria(ordeQuick.getVetorOrdenado(), "Aarbechtslosegkeet/n"), 
				"Relatório de Busca Binária", 3);
		JOptionPane.showMessageDialog(null, "Milisegundos = " + buscaBinaria4.getTempoExecucaoMili()
				+"\nNanosegundos = " + buscaBinaria4.getTempoExecucaoNano()
				+"\nEquivalente a " + buscaBinaria4.getTempoExecucaoMili() / 1000 + " segundos",
				"Tempo de Execução da Busca Binária", 3);
		
		
		
		
		
		
		/*Ordenacao ordeIncertion = new Ordenacao();
		ordeIncertion.IncertionSort(arq1.CriarVetor());
		ordeIncertion.MostrarOrdenacao();
		
		Ordenacao ordeBubble = new Ordenacao();
		ordeBubble.BubbleSort(arq1.CriarVetor());
		ordeBubble.MostrarOrdenacao();
		
		Ordenacao ordeQuick = new Ordenacao();
		ordeQuick.QuickSort(arq1.getVetorTxt(), 0, arq1.getTamanhoVetor() - 2);
		ordeQuick.MostrarOrdenacao();
		
		Ordenacao ordeMerge = new Ordenacao();
		int[] vetorTeste = {1,8,6,98,35,12,47,58,245,15};
		int[] vetorTesteAuxiliar = new int[vetorTeste.length];
		String[] vetorTeste2 = {"joao", "Maria", "Pedrolino", "Marcos", "Bruna", "Luana", "Alvida"};
		String[] vetorTeste2Auxuliar = new String[vetorTeste2.length];
		
		mergeSortString(vetorTeste2, vetorTeste2Auxuliar, 0, vetorTeste.length - 2);
		
		System.out.println(Arrays.toString(vetorTeste2));
		//mergeSort(vetorTeste, vetorTesteAuxiliar, 0, vetorTeste.length - 1);
		
		//System.out.println(Arrays.toString(vetorTeste));*/
	}

}