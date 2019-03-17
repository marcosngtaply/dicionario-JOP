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
    public void QuickSort(String[] vetorTxt, int inicio, int fim) {
        if(inicio < fim) {
             int posicaoPivo = separar(vetorTxt, inicio, fim);
             QuickSort(vetorTxt, inicio, posicaoPivo - 1);
             QuickSort(vetorTxt, posicaoPivo + 1, fim);
             
        }
        this.vetorOrdenado = vetorTxt;
    }

    public int separar(String[] vetorTxt, int inicio, int fim) {
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

