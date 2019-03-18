package Dicionario;

import java.util.Arrays;
//uhudhuhsudhsuh
public class Ordenacao {

	private String[] vetorOrdenado;
	private double tempoExecucaoNano, tempoExecucaoMili;
	

	public Ordenacao(String[] vetorOrdenado, double tempoExecucaoNano, double tempoExecucaoMili) {
		
		this.vetorOrdenado = vetorOrdenado;
		this.tempoExecucaoNano = tempoExecucaoNano;
		this.tempoExecucaoMili = tempoExecucaoMili;
		
	}
	
	public Ordenacao() {

	}

	public String[] SelectionSort(String[] vetorTxt){
		
		long tempoNanoInicial = System.nanoTime();
		long tempoMiliInicial = System.currentTimeMillis();
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
	    long tempoNanoFinal = System.nanoTime();
		long tempoMiliFinal = System.currentTimeMillis();
		this.tempoExecucaoMili = tempoMiliFinal - tempoMiliInicial;
	    this.tempoExecucaoNano = tempoNanoFinal - tempoNanoInicial;
	    this.vetorOrdenado = vetorTxt;
	    return vetorTxt;
	    
	 }
	 public String[] IncertionSort(String[] vetorTxt) {
		
		 	long tempoNanoInicial = System.nanoTime();
			long tempoMiliInicial = System.currentTimeMillis();

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
		 long tempoNanoFinal = System.nanoTime();
		 long tempoMiliFinal = System.currentTimeMillis();
		 this.tempoExecucaoMili = tempoMiliFinal - tempoMiliInicial;
		 this.tempoExecucaoNano = tempoNanoFinal - tempoNanoInicial;
		 this.vetorOrdenado = vetorTxt;
		 return vetorTxt;
	 }
	 public String[] BubbleSort(String[] vetorTxt){
		
		 long tempoNanoInicial = System.nanoTime();
		 long tempoMiliInicial = System.currentTimeMillis();
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
		 long tempoNanoFinal = System.nanoTime();
		 long tempoMiliFinal = System.currentTimeMillis();
		 this.tempoExecucaoMili = tempoMiliFinal - tempoMiliInicial;
		 this.tempoExecucaoNano = tempoNanoFinal - tempoNanoInicial;
         this.vetorOrdenado = vetorTxt;
         return vetorTxt;
	 }
     public void QuickSort(String[] vetorTxt, int inicio, int fim) {
		long tempoNanoInicial = System.nanoTime();
		long tempoMiliInicial = System.currentTimeMillis();
        if(inicio < fim) {
             int posicaoPivo = Separar(vetorTxt, inicio, fim);
             QuickSort(vetorTxt, inicio, posicaoPivo - 1);
             QuickSort(vetorTxt, posicaoPivo + 1, fim);
             
        }
		long tempoNanoFinal = System.nanoTime();
		long tempoMiliFinal = System.currentTimeMillis();
		this.tempoExecucaoMili = tempoMiliFinal - tempoMiliInicial;
		this.tempoExecucaoNano = tempoNanoFinal - tempoNanoInicial;
        this.vetorOrdenado = vetorTxt;
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
     
     /*public void mergeSort(String vetor[], int inicio, int fim) {
         int meio, z;
         if (inicio < fim) {
             meio = (inicio + fim) / 2;
             mergeSort(vetor, inicio, meio);
             mergeSort(vetor, meio + 1, fim);
             intercala(vetor, inicio, meio, fim);
          }
         this.vetorOrdenado = vetor;
      }
  
     public void intercala(String vetor[], int inicio, int meio, int fim) {
         int i, j, k;
         String vetorB[] = new String[vetor.length];
         for (i = inicio; i <= meio; i++) {
             vetorB[i] = vetor[i];
         }
         for (j = meio + 1; j < fim; j++) {
             vetorB[fim + meio + 1 - j] = vetor[j];
         }
         i = inicio;
         j = fim;
         for (k = inicio; k <= fim; k++) {
             if(vetorB[i].length() < vetorB[j].length()) {
                 vetor[k] = vetorB[i];
                 i = i + 1;
             } else {
                 vetor[k] = vetorB[j];
                 j = j - 1;
             }
         
         }
     }
     /*public void MergeSort(String[] vetorTxt, String[] vetorAuxiliar, int inicioVet, int fimVet) {
    	 if(inicioVet < fimVet) {
    		 int meioVet = (inicioVet + fimVet) / 2;
    		 MergeSort(vetorTxt, vetorAuxiliar, inicioVet, meioVet);
    		 MergeSort(vetorTxt, vetorAuxiliar, meioVet + 1, fimVet);
    		 Intercalar(vetorTxt, inicioVet, meioVet, fimVet);
    	 }
    	 this.vetorOrdenado = vetorTxt;
     }
    
	 public void Intercalar(String[] vetorTxt, int inicioVet, int meioVet, int fimVet) {
		 
		 String[] vetorAuxiliar = new String[vetorTxt.length];
		
		 for(int i = inicioVet; i <= meioVet; i++) {
			 vetorAuxiliar[i] = vetorTxt[i];
			 System.out.println(vetorAuxiliar[i] + ", ");

		 }
		 
		 for(int j = meioVet + 1; j <= fimVet + 1; j++) {
			 vetorAuxiliar[j] = vetorTxt[j];
			 System.out.println(vetorAuxiliar[j] + "|");

		 }
		 int indiceEsq = inicioVet;
		 int indiceDir = fimVet;
		 
		 for(int k = inicioVet; k <= fimVet; k++) {
			 if(vetorAuxiliar[indiceEsq].length() <= vetorAuxiliar[indiceDir].length()) {
				 vetorTxt[k] = vetorAuxiliar[indiceEsq];
				 indiceEsq++;
			 }
			 else {
				 vetorTxt[k] = vetorAuxiliar[indiceDir];
				 indiceDir--;
				 
			 }
			 System.out.println(vetorTxt[k]);
		 }
		 //this.vetorOrdenado = vetorTxt;
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

	 public double getTempoExecucaoNano() {
		 return tempoExecucaoNano;
	 }

	 public void setTempoExecucaoNano(double tempoExecucaoNano) {
		this.tempoExecucaoNano = tempoExecucaoNano;
	 }

	public double getTempoExecucaoMili() {
		return tempoExecucaoMili;
	}

	public void setTempoExecucaoMili(double tempoExecucaoMili) {
		this.tempoExecucaoMili = tempoExecucaoMili;
	}
	 

}

