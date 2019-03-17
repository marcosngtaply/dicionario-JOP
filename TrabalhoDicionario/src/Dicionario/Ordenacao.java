package Dicionario;

public class Ordenacao {
// String path = "./arquivos/teste.txt"; //
	private String[] vetorOrdenado;
	private double tempoExecucao;
	

	public Ordenacao(String[] vetorOrdenado, double tempoExecucao) {
		this.vetorOrdenado = vetorOrdenado;
		this.tempoExecucao = tempoExecucao;
		
	}
	
	public Ordenacao() {

	}

	public String[] SelectionSort(String[] vetorTxt){
		
	    for (int i = 0; i < vetorTxt.length - 2; i++){
	      // primeiro (for) Percorre o vetor até 2 indices antes do fim pois a ultima linha esta nula
	      // segundo (for) Percorre o vetor até 1 indice antes do fim
	      int min = i;
	      for(int j = i + 1; j < vetorTxt.length - 1; j++) {
	    	  if(vetorTxt[j].length() < vetorTxt[min].length()) {
	    		  min = j;
	    	  }
	    	  // Troca de variáveis  
	    	  String temporaria = vetorTxt[i];
	    	  vetorTxt[i] = vetorTxt[min];
	    	  vetorTxt[min] = temporaria;
	      }
	    }
	    this.vetorOrdenado = vetorTxt;
	    return vetorTxt;
	    
	}
	public String[] IncertionSort(String[] vetorTxt) {
	
			String chave;
			int aux;
			
			for (int i = 0; i < vetorTxt.length - 1; i++) {
				chave = vetorTxt[i];
				aux = i - 1;
				while(aux >= 0 && vetorTxt[aux].length() > chave.length()){
					vetorTxt[aux + 1] = vetorTxt[aux];
					aux -= 1;
				}
				vetorTxt[aux + 1] = chave;
			}
		    this.vetorOrdenado = vetorTxt;
			return vetorTxt;
	}
	public String[] BubbleSort(String[] vetorTxt){
         
		 boolean troca = true;
         String aux;
         
         while (troca) {
             troca = false;
            
             for (int i = 0; i < vetorTxt.length - 2; i++) {
                 if (vetorTxt[i].length() > vetorTxt[i + 1].length()) {
                     aux = vetorTxt[i];
                     vetorTxt[i] = vetorTxt[i + 1];
                     vetorTxt[i + 1] = aux;
                     troca = true;
                 }
             }
         }
         this.vetorOrdenado = vetorTxt;
         return vetorTxt;
	}
	
    public void quickSort(String[] array) {
        if (array != null) {
        	QuickSort(array, 0, array.length - 2);
        }
        
        
    }
    
    public String[] QuickSort(String[] vetorTxt, int start, int end) {
        if (start < end) {
            int pivotIndex = Partition(vetorTxt, start, end);
            printArray(vetorTxt, 0, vetorTxt.length - 2);
            QuickSort(vetorTxt, start, pivotIndex - 1);
            QuickSort(vetorTxt, pivotIndex + 1, end);
        }
        return vetorTxt;
    }
    
    /* Must use "Lomuto Partition" scheme (which isn't very efficient) from Wikipedia:
       https://en.wikipedia.org/wiki/Quicksort#Lomuto_partition_scheme */
    public int Partition(String[] A, int lo, int hi) {
        String pivot = A[hi];
        int i = lo - 1;
        for(int j = lo; j < hi - 1; j++) {
            if (A[j].length() <= pivot.length()) {
                i++;
                swap(A, i , j);
            }
        }
        swap(A, i + 1, hi);
        return i + 1;
    }
    
    public void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void printArray(String[] array, int start, int end) {
        for (int i = start; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
	
	/*public String[] QuickSort(String[] vetorTxt,int inicio,int fim){
        int esq = inicio;
        int dir = fim;
        String pivo = vetorTxt[(esq + dir) / 2];
        String troca;

        while(esq <= dir){
            while(vetorTxt[esq].length() < pivo.length()){
                esq += 1;

            }
            while(vetorTxt[dir].length() > pivo.length()){
                dir -= 1;
            }
            if(esq <= dir){
                troca = vetorTxt[esq];
                vetorTxt[esq] = vetorTxt[dir];
                vetorTxt[dir] = troca;
                esq = esq+1 ;
                dir = dir +1;
            }
        }
        if(dir > inicio){
        	QuickSort(vetorTxt, inicio, dir);
        }
        if(esq < fim){
        	QuickSort(vetorTxt, esq, fim);
        }
        this.vetorOrdenado = vetorTxt;
        return vetorTxt;

    }


	/*public String[] QuickSort(String[] vetorTxt, int inicio, int fim) {
		
		int posicaoPivo = Separar(vetorTxt, inicio, fim);
		if (inicio < fim) {
			 
			 
			 QuickSort(vetorTxt, inicio, posicaoPivo - 1);
			 QuickSort(vetorTxt, posicaoPivo + 1, fim);
         }
		// this.vetorOrdenado = 
		 return QuickSort(vetorTxt, inicio, posicaoPivo - 1);
		
	}

	public int Separar(String[] vetorTxt, int inicio, int fim) {
         
		 String pivo = vetorTxt[inicio];
         int i = inicio + 1, f = fim;
         while(i <= f) {
               if(vetorTxt[i].length() <= pivo.length())
                      i++;
               else if (pivo.length() < vetorTxt[f].length())
                       f--;
               else {
                      String troca = vetorTxt[i];
                      vetorTxt[i] = vetorTxt[f];
                      vetorTxt[f] = troca;
                      i++;
                      f--;
                }
         }
         vetorTxt[inicio] = vetorTxt[f];
         vetorTxt[f] = pivo;
         return f;
    }
	 
	/* public String[] Quicksort(String[] vetorTxt){
	        
		 int esq = 0;
	     int dir = vetorTxt.length - 1;
	     String pivo = vetorTxt[(vetorTxt.length - 1) / 2];
	     String troca;

	     while(esq <= dir){
	    	 while(vetorTxt[esq].length() < pivo.length()){
	    		 esq =+ 1;

	         }
	         while(vetorTxt[dir].length() > pivo.length()){
	             dir =- 1;
	             
	         }
	         if(esq <= dir){
	             troca = vetorTxt[esq];
	             vetorTxt[esq] = vetorTxt[dir];
	             vetorTxt[dir] = troca;
	             esq =+1 ;
	             dir =+1;
	         }
	     }
	     if(dir > esq){
	    	 Quicksort(vetorTxt);
	     }
	     if(esq < dir){
	    	 Quicksort(vetorTxt);
	     } 
	     this.vetorOrdenado = vetorTxt;
	     return vetorTxt;

	    }*/

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

	public double getTempoExecucao() {
		return tempoExecucao;
	}

	public void setTempoExecucao(double tempoExecucao) {
		this.tempoExecucao = tempoExecucao;
	}

}

