package Dicionario;

import java.util.Arrays;

public class PrincipalDicionario {
	
	/*public static void mergeSort(int[] vetor,int[] vetorAuxiliar, int inicio, int fim) {
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
		
		for(int j = fim; j >= meio + 1; j--) {
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
			
			/*else if(vetorAuxiliar[esquerda].length() < vetorAuxiliar[esquerda + 1].length()) {
				vetor[k] = vetorAuxiliar[esquerda];
				esquerda++;
			}
			
			else if (vetorAuxiliar[direita].length() < vetorAuxiliar[direita - 1].length()) {
				vetor[k] = vetorAuxiliar[direita];
				direita--;
			}
			
		}
		
	}*/

	public static void main(String[] args) {
		
		LerArquivo arq1 = new LerArquivo();
		arq1.setNomeArq("./ArquivosTxt/DicionarioIngles.txt");
		arq1.CriarVetor();
		Ordenacao ordeSelection = new Ordenacao();
		ordeSelection.SelectionSort(arq1.getVetorTxt());
		//ordeSelection.MostrarOrdenacao();
		System.out.println("Executado em "+ ordeSelection.getTempoExecucaoMili() + " Milisegundos.");
		System.out.println("Executado em "+ ordeSelection.getTempoExecucaoNano() + " Nanosegundos.");
		System.out.println("Equivale aproximadamente " + ordeSelection.getTempoExecucaoMili() / 1000 + " segundos" );
		Busca buscaSequencial1 = new Busca();
		Busca buscaBinaria1 = new Busca();
		System.out.println(buscaSequencial1.BuscaSequencial(ordeSelection.getVetorOrdenado(), "maid/MNSX"));
		System.out.println(ordeSelection.getVetorOrdenado().length);
		System.out.println(buscaBinaria1.BuscaBinaria(ordeSelection.getVetorOrdenado(), "maid/MNSX"));
		//System.out.println("Equivalente a " + ordeSelection.getTempoExecucaoNano() / 1000000000 + " segundos");

		/*Ordenacao ordeIncertion = new Ordenacao();
		ordeIncertion.IncertionSort(arq1.CriarVetor());
		ordeIncertion.MostrarOrdenacao();*/
		
		/*Ordenacao ordeBubble = new Ordenacao();
		ordeBubble.BubbleSort(arq1.CriarVetor());
		ordeBubble.MostrarOrdenacao();*/
		
		/*Ordenacao ordeQuick = new Ordenacao();
		ordeQuick.QuickSort(arq1.CriarVetor(), 0, arq1.getTamanhoVetor() - 1);
		ordeQuick.MostrarOrdenacao();*/
		
		/*//Ordenacao ordeMerge = new Ordenacao();
		int[] vetorTeste = {1,8,6,98,35,12,47,58,245,15};
		int[] vetorTesteAuxiliar = new int[vetorTeste.length];
		String[] vetorTeste2 = {"joao", "Maria", "Pedrolino", "Marcos", "Bruna", "Luana", "Alvida"};
		String[] vetorTeste2Auxuliar = new String[vetorTeste2.length];
		
		mergeSortString(vetorTeste2, vetorTeste2Auxuliar, 0, vetorTeste.length - 1);
		
		System.out.println(Arrays.toString(vetorTeste2));
		//mergeSort(vetorTeste, vetorTesteAuxiliar, 0, vetorTeste.length - 1);
		
		//System.out.println(Arrays.toString(vetorTeste));*/
	}

}