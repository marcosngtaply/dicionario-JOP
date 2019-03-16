package Dicionario;

public class PrincipalDicionario {

	public static void main(String[] args) {
		
		LerArquivo arq1 = new LerArquivo();
		arq1.setNomeArq("./AruivosTxt/DicionarioIngles.txt");
		///arq1.CriarVetor();
		Ordenacao orde1 = new Ordenacao();
		orde1.SelectionSort(arq1.CriarVetor());
		//orde1.MostrarOrdenacao();
		System.out.println(orde1.getVetorOrdenado());
		
	}

}
