package Dicionario;

import javax.swing.JOptionPane;

public class PrincipalDicionarioTrue {

	public static void main(String[] args) {

		String pathIngles = "./ArquivosTxt/DicionarioIngles.txt";
		String pathCatalao = "./ArquivosTxt/DicionarioCatalao.txt";
		String pathIndonesio = "./ArquivosTxt/DicionarioIndonesia.txt";
		
		String[] opcoes = {"Americano", "Catalão", "Indonésio"};
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
				else if(ordenacao == 1) {
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
				else if(ordenacao == 2) {
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
				else if(ordenacao == 3) {
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
				else if(ordenacao == 4) {
					Ordenacao ordeMerge = new Ordenacao();
					JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");
					long tempoNanoInicial = System.nanoTime();
					long tempoMiliInicial = System.currentTimeMillis();
					ordeMerge.mergeSort(dicAmericano.getVetorTxt(), 0, dicAmericano.getTamanhoVetor() - 2);
					long tempoNanoFinal = System.nanoTime();
					long tempoMiliFinal = System.currentTimeMillis();
					JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");
					
					double tempoMergeMili = tempoMiliFinal - tempoMiliInicial;
					double tempoMergeNanno = tempoNanoFinal - tempoNanoInicial;
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ tempoMergeMili + "\nNanosegundos = " 
					+ tempoMergeNanno + "\nEquivalente a " + tempoMergeMili / 1000 + " segundos", 
					"Relatório de execução MergeSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Americano", 
								JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesBusca, opcoesBusca[0]);
						if(busca == 0) {
							Busca buscaBinaria = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaBinaria.BuscaBinaria(ordeMerge.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaBinaria.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaBinaria.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaBinaria.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(busca == 1) {
							Busca buscaSequancial = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaSequancial.BuscaSequencial(ordeMerge.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaSequancial.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaSequancial.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaSequancial.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaSequencial", JOptionPane.INFORMATION_MESSAGE);
						}
					
						opbusca = JOptionPane.showConfirmDialog(null, "Deseja continuar buscando palavras?");
					}while(opbusca == 0);
				}
			}
			else if(escolha == 1) {
				LerArquivo dicCatalao = new LerArquivo(pathCatalao);
				dicCatalao.CriarVetor();
				int ordenacao = JOptionPane.showOptionDialog(null, "Qual tipo de ordenação deseja usar?", "Dionário Croata", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesOrdenacao, opcoesOrdenacao[0]);
				if(ordenacao == 0) {
					Ordenacao ordeSelection = new Ordenacao();
					ordeSelection.SelectionSort(dicCatalao.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeSelection.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeSelection.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeSelection.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução SelectionSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Croata", 
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
				else if(ordenacao == 1) {
					Ordenacao ordeIncertion = new Ordenacao();
					ordeIncertion.IncertionSort(dicCatalao.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeIncertion.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeIncertion.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeIncertion.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução IncertionSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Croata", 
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
				else if(ordenacao == 2) {
					Ordenacao ordeBubble = new Ordenacao();
					ordeBubble.BubbleSort(dicCatalao.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeBubble.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeBubble.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeBubble.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução BubbleSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Croata", 
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
				else if(ordenacao == 3) {
					Ordenacao ordeQuick = new Ordenacao();
					JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");
					ordeQuick.QuickSort(dicCatalao.getVetorTxt(), 0, dicCatalao.getTamanhoVetor() - 2);
					JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");

					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeQuick.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeQuick.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeQuick.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução QuickSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Croata", 
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
				else if(ordenacao == 4) {
					Ordenacao ordeMerge = new Ordenacao();
					JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");
					long tempoNanoInicial = System.nanoTime();
					long tempoMiliInicial = System.currentTimeMillis();
					ordeMerge.mergeSort(dicCatalao.getVetorTxt(), 0, dicCatalao.getTamanhoVetor() - 2);
					long tempoNanoFinal = System.nanoTime();
					long tempoMiliFinal = System.currentTimeMillis();
					JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");
					
					double tempoMergeMili = tempoMiliFinal - tempoMiliInicial;
					double tempoMergeNanno = tempoNanoFinal - tempoNanoInicial;
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ tempoMergeMili + "\nNanosegundos = " 
					+ tempoMergeNanno + "\nEquivalente a " + tempoMergeMili / 1000 + " segundos", 
					"Relatório de execução MergeSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Croata", 
								JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesBusca, opcoesBusca[0]);
						if(busca == 0) {
							Busca buscaBinaria = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaBinaria.BuscaBinaria(ordeMerge.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaBinaria.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaBinaria.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaBinaria.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(busca == 1) {
							Busca buscaSequancial = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaSequancial.BuscaSequencial(ordeMerge.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaSequancial.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaSequancial.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaSequancial.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaSequencial", JOptionPane.INFORMATION_MESSAGE);
						}
					
						opbusca = JOptionPane.showConfirmDialog(null, "Deseja continuar buscando palavras?");
					}while(opbusca == 0);
				}
			}
			else if(escolha == 2) {
				LerArquivo dicIndonesio = new LerArquivo(pathIndonesio);
				dicIndonesio.CriarVetor();
				int ordenacao = JOptionPane.showOptionDialog(null, "Qual tipo de ordenação deseja usar?", "Dionário Indonésio", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesOrdenacao, opcoesOrdenacao[0]);
				if(ordenacao == 0) {
					Ordenacao ordeSelection = new Ordenacao();
					ordeSelection.SelectionSort(dicIndonesio.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeSelection.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeSelection.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeSelection.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução SelectionSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Indonésio", 
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
				else if(ordenacao == 1) {
					Ordenacao ordeIncertion = new Ordenacao();
					ordeIncertion.IncertionSort(dicIndonesio.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeIncertion.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeIncertion.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeIncertion.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução IncertionSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Indonésio", 
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
				else if(ordenacao == 2) {
					Ordenacao ordeBubble = new Ordenacao();
					ordeBubble.BubbleSort(dicIndonesio.getVetorTxt());
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeBubble.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeBubble.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeBubble.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução BubbleSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Indonésio", 
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
				else if(ordenacao == 3) {
					Ordenacao ordeQuick = new Ordenacao();
					JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");
					ordeQuick.QuickSort(dicIndonesio.getVetorTxt(), 0, dicIndonesio.getTamanhoVetor() - 2);
					JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");

					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ ordeQuick.getTempoExecucaoMili()
					+ "\nNanosegundos = "+ ordeQuick.getTempoExecucaoNano()
					+ "\nEquivalente a " + ordeQuick.getTempoExecucaoMili() / 1000 + " segundos", 
					"Relatório de execução QuickSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Indonésio", 
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
				else if(ordenacao == 4) {
					Ordenacao ordeMerge = new Ordenacao();
					JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");
					long tempoNanoInicial = System.nanoTime();
					long tempoMiliInicial = System.currentTimeMillis();
					ordeMerge.mergeSort(dicIndonesio.getVetorTxt(), 0, dicIndonesio.getTamanhoVetor() - 2);
					long tempoNanoFinal = System.nanoTime();
					long tempoMiliFinal = System.currentTimeMillis();
					JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");
					
					double tempoMergeMili = tempoMiliFinal - tempoMiliInicial;
					double tempoMergeNanno = tempoNanoFinal - tempoNanoInicial;
					
					JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ tempoMergeMili + "\nNanosegundos = " 
					+ tempoMergeNanno + "\nEquivalente a " + tempoMergeMili / 1000 + " segundos", 
					"Relatório de execução MergeSort", JOptionPane.INFORMATION_MESSAGE);
					
					int opbusca = 0;
					do {
						
						int busca = JOptionPane.showOptionDialog(null, "Qual tipo de busca deseja usar?", "Dionário Croata", 
								JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesBusca, opcoesBusca[0]);
						if(busca == 0) {
							Busca buscaBinaria = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaBinaria.BuscaBinaria(ordeMerge.getVetorOrdenado(), palavra));
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaBinaria.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaBinaria.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaBinaria.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(busca == 1) {
							Busca buscaSequancial = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							JOptionPane.showMessageDialog(null, buscaSequancial.BuscaSequencial(ordeMerge.getVetorOrdenado(), palavra));
							
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
