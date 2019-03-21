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
							buscaBinaria.BuscaBinaria(ordeSelection.getVetorOrdenado(), palavra);
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaBinaria.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaBinaria.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaBinaria.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
						else if(busca == 1) {
							Busca buscaSequancial = new Busca();
							String palavra = JOptionPane.showInputDialog("Digite a palavra a ser buscada no vetor: ");
							buscaSequancial.BuscaSequencial(ordeSelection.getVetorOrdenado(), palavra);
							
							JOptionPane.showMessageDialog(null, "Tempo:\nMilisegundos = "+ buscaSequancial.getTempoExecucaoMili()
							+ "\nNanosegundos = "+ buscaSequancial.getTempoExecucaoNano()
							+ "\nEquivalente a " + buscaSequancial.getTempoExecucaoMili() / 1000 + " segundos", 
							"Relatório de execução da BuscaBinária", JOptionPane.INFORMATION_MESSAGE);
						}
					

					}while(opbusca == 0);
				}
			}
		
		
		op = JOptionPane.showConfirmDialog(null, "Continuar operações?");
		}while(op == 0);
	}

}
