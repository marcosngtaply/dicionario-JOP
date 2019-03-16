package Dicionario;

public class Ordenacao {
// String path = "./arquivos/teste.txt"; //
	private String[] vetorOrdenado;
	

	public Ordenacao(String[] vetorOrdenado) {
		this.vetorOrdenado = vetorOrdenado;
		
	}
	
	public Ordenacao() {

	}

	public String[] SelectionSort(String[] vetor){
	// Find the string reference that should go in each cell of
	// the array, from cell 0 to the end
	    for (int j = 0; j < vetor.length-1; j++){
	      // Find min: the index of the string reference that should go into cell j.
	      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
	      int min = j;
	      for(int k = j+1; k < vetor.length; k++) {
	    	  if(vetor[k].length() < vetor[min].length()) {
	    		  min = k;
	    	  }
	    	  // Swap the reference at j with the reference at min 
	    	  String temp = vetor[j];
		      vetor[j] = vetor[min];
		      vetor[min] = temp;
	      }
	    }
	    this.vetorOrdenado = vetor;
	    return vetor;
	    
	 }
	public void MostrarOrdenacao() {
		for(int o = 0; o < vetorOrdenado.length - 1; o++) {
			System.out.println(vetorOrdenado[o]);
		}
		
	}

	public String[] getVetorOrdenado() {
		return vetorOrdenado;
	}

	public void setVetorOrdenado(String[] vetorOrdenado) {
		this.vetorOrdenado = vetorOrdenado;
	}
	
}

