package Dicionario;

import javax.swing.JOptionPane;

public class PrincipalDicionarioTrue {

	public static void main(String[] args) {

		String pathIngles = "./ArquivosTxt/DicionarioIngles.txt";
		String pathCroata = "./ArquivosTxt/DicionarioCroata.txt";
		String pathIndonesio = "./ArquivosTxt/DicionarioIndonesia.txt";
		String pathTcheco = "./AquivosTxt/DicionarioTcheco.txt";
		
		String[] opcoes = {"Americano", "Croata", "Indonésio", "Tcheco"};
		String[] opcoesOrdenacao = {"SelectionSort","InsertionSort","BubbleSort","QuickSort","MergeSort"};
		String[] opcoesBusca = {"Binária", "Sequencial"};
		
		JOptionPane.showMessageDialog(null,"Sistema de Ordenação e Busca de Palavras","Bem Vindo!" , 1);
		int op, escolha;
		do {
		
			escolha = JOptionPane.showOptionDialog(null, "Qual Dicionário deseja Manipular?", "Escolha de Arquivo", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			if(escolha == 0) {
				LerArquivo dicAmericano = new LerArquivo(pathIngles);
				dicAmericano.CriarVetor();
				int ordenacao = JOptionPane.showOptionDialog(null, "Qual tipo de ordenação deseja usar?", "Dionário Americano", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesOrdenacao, opcoesOrdenacao[0]);
				if(ordenacao == 0) {
					Ordenacao ordeSelection = new Ordenacao();
					ordeSelection.SelectionSort(dicAmericano.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeSelection.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeSelection.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeSelection.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução SelectionSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Americano", 
								JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesBusca, opcoesBusca[0]);
						if(busca == 0) {
							Busca buscaBinaria = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaBinaria.BuscaBinaria(ordeSelection.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaBinaria.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaBinaria.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaBinaria.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(busca == 1) {
							Busca buscaSequancial = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaSequancial.BuscaSequencial(ordeSelection.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaSequancial.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaSequancial.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaSequancial.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaSequencial", JOptionPane.INFORMATION_MESSAGE);
						}
					
						opbusca = JOptionPane.showConfirmDialog(null, "Deseja continuar buscando palavras?");
					}while(opbusca == 0);
				}
				if(ordenacao == 1) {
					Ordenacao ordeIncertion = new Ordenacao();
					ordeIncertion.IncertionSort(dicAmericano.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeIncertion.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeIncertion.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeIncertion.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução IncertionSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Americano", 
								JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesBusca, opcoesBusca[0]);
						if(busca == 0) {
							Busca buscaBinaria = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaBinaria.BuscaBinaria(ordeIncertion.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaBinaria.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaBinaria.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaBinaria.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(busca == 1) {
							Busca buscaSequancial = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaSequancial.BuscaSequencial(ordeIncertion.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaSequancial.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaSequancial.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaSequancial.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaSequencial", JOptionPane.INFORMATION_MESSAGE);
						}
					
						opbusca = JOptionPane.showConfirmDialog(null, "Deseja continuar buscando palavras?");
					}while(opbusca == 0);
				}
				if(ordenacao == 2) {
					Ordenacao ordeBubble = new Ordenacao();
					ordeBubble.BubbleSort(dicAmericano.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeBubble.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeBubble.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeBubble.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução BubbleSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Americano", 
								JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesBusca, opcoesBusca[0]);
						if(busca == 0) {
							Busca buscaBinaria = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaBinaria.BuscaBinaria(ordeBubble.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaBinaria.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaBinaria.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaBinaria.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(busca == 1) {
							Busca buscaSequancial = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaSequancial.BuscaSequencial(ordeBubble.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaSequancial.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaSequancial.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaSequancial.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaSequencial", JOptionPane.INFORMATION_MESSAGE);
						}
					
						opbusca = JOptionPane.showConfirmDialog(null, "Deseja continuar buscando palavras?");
					}while(opbusca == 0);
				}
				if(ordenacao == 3) {
					Ordenacao ordeQuick = new Ordenacao();
					JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");
					ordeQuick.QuickSort(dicAmericano.getVetorTxt(), 0, dicAmericano.getTamanhoVetor() - 2);
					JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");

					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeQuick.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeQuick.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeQuick.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução QuickSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Americano", 
								JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesBusca, opcoesBusca[0]);
						if(busca == 0) {
							Busca buscaBinaria = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaBinaria.BuscaBinaria(ordeQuick.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaBinaria.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaBinaria.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaBinaria.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(busca == 1) {
							Busca buscaSequancial = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaSequancial.BuscaSequencial(ordeQuick.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaSequancial.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaSequancial.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaSequancial.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaSequencial", JOptionPane.INFORMATION_MESSAGE);
						}
					
						opbusca = JOptionPane.showConfirmDialog(null, "Deseja continuar buscando palavras?");
					}while(opbusca == 0);
				}
				
			}
		
		
		op = JOptionPane.showConfirmDialog(null, "Continuar operações?");
		}while(op == 0);
	}

}
