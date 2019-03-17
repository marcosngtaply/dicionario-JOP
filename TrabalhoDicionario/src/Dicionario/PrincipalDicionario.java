package Dicionario;

public class PrincipalDicionario {

	public static void main(String[] args) {
		
		LerArquivo arq1 = new LerArquivo();
		arq1.setNomeArq("./ArquivosTxt/DicionarioIngles.txt");
		/*Ordenacao ordeSelection = new Ordenacao();
		ordeSelection.SelectionSort(arq1.CriarVetor());
		ordeSelection.MostrarOrdenacao();*/
		
		/*Ordenacao ordeIncertion = new Ordenacao();
		ordeIncertion.IncertionSort(arq1.CriarVetor());
		ordeIncertion.MostrarOrdenacao();*/
		
		/*Ordenacao ordeBubble = new Ordenacao();
		ordeBubble.BubbleSort(arq1.CriarVetor());
		ordeBubble.MostrarOrdenacao();*/
		
		Ordenacao ordeQuick = new Ordenacao();
		//ordeQuick.MostrarOrdenacao();
		ordeQuick.quickSort(ordeQuick.QuickSort(arq1.CriarVetor(), 0, arq1.getTamanhoVetor() - 1));
	}

}
