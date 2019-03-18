package Dicionario;

public class Busca {

	public String BuscaSequencial(String[] vetorOrdenado, String palavra) {
		for(int i = 0; i <= vetorOrdenado.length; i++) {
			if(palavra.equals(vetorOrdenado[i])) {
				return "Palavra" + vetorOrdenado[i] + " encontrada no Vetor, no indice" 
				+ i + " do vetor.";
			}
				
		}
		return "Palavra não encontrada ou não existe no vetor";
	}
	public String BuscaBinaria(String[] vetorOrdenado, String palavra, int inicioVet, int fimVetor) {
		int meio;
		if(inicioVet > fimVetor) {
			return "Impossível fazer busca!";
		}
		
		meio = (inicioVet + fimVetor) / 2;
		
		if(palavra.equals(vetorOrdenado[meio])) {
			return "Palavra" + vetorOrdenado[meio] + " encontrada no Vetor, no indice" 
					+ meio + " do vetor.";
		}
		else if(palavra.length() < vetorOrdenado[meio].length()) {
			return(BuscaBinaria(vetorOrdenado, palavra, inicioVet, meio - 1));
		}
		else {
			return(BuscaBinaria(vetorOrdenado, palavra, meio + 1, fimVetor));
		}
	}
}
