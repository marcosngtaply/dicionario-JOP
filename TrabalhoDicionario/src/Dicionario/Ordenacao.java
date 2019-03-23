package Dicionario;

import java.util.Arrays;

import javax.swing.JOptionPane;

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
		JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");
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
	    JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");
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
		JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");

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
		 JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");
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
		 JOptionPane.showMessageDialog(null, "Por favor aguarde o processo de Ordenação...");

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
		 JOptionPane.showMessageDialog(null, "Ordenação concluída com sucesso!");
		 long tempoNanoFinal = System.nanoTime();
		 long tempoMiliFinal = System.currentTimeMillis();
		 this.tempoExecucaoMili = tempoMiliFinal - tempoMiliInicial;
		 this.tempoExecucaoNano = tempoNanoFinal - tempoNanoInicial;
         this.vetorOrdenado = vetorTxt;
         return vetorTxt;
	 }
     public void QuickSort(String[] vetorTxt, int inicio, int fim) {

        if(inicio < fim) {
             int posicaoPivo = Separar(vetorTxt, inicio, fim);
             QuickSort(vetorTxt, inicio, posicaoPivo - 1);
             QuickSort(vetorTxt, posicaoPivo + 1, fim);
             
        }
        this.vetorOrdenado = vetorTxt;
     }
     public int Separar(String[] vetorTxt, int inicio, int fim) {
        	
    	 String pivo = vetorTxt[inicio];
        	int i = inicio + 1, f = fim;
        	
        	while(i <= f) {
        		if(vetorTxt[i].length() <= pivo.length()) {
        			i++;
        		}
        			
        		else if(vetorTxt[f].length() > pivo.length()) {
        			f--;
        		}
        			
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
     private void Merge(String[] vetorTxt, int esquerdaVet, int meioVet, int direitaVet) { 
         
    	 int n1 = meioVet - esquerdaVet + 1; 
         int n2 = direitaVet - meioVet; 
   
         String L[] = new String [n1]; 
         String R[] = new String [n2]; 
   
         for (int i = 0; i < n1; ++i) {
             L[i] = vetorTxt[esquerdaVet + i]; 
         }
         for (int j = 0; j < n2; ++j) {
             R[j] = vetorTxt[meioVet + 1+ j]; 
         }
   
         int i = 0, j = 0; 
   
         int k = esquerdaVet; 
         while (i < n1 && j < n2) { 
             
        	 if (L[i].length() <= R[j].length()) { 
            	 vetorTxt[k] = L[i]; 
                 i++; 
             }
             else { 
            	 vetorTxt[k] = R[j]; 
                 j++; 
             }
             k++; 
         }
         while (i < n1) { 
        	 vetorTxt[k] = L[i]; 
             i++; 
             k++; 
         } 
         while (j < n2) { 
        	 vetorTxt[k] = R[j]; 
             j++; 
             k++; 
         } 
     } 
     public void MergeSort(String[] vetorTxt, int esquerdaVet, int direitaVet) { 
    	long tempoNanoInicial = System.nanoTime();
		long tempoMiliInicial = System.currentTimeMillis();
        
		if (esquerdaVet < direitaVet) { 
            
             int meio = (esquerdaVet+direitaVet)/2; 
 
             MergeSort(vetorTxt, esquerdaVet, meio); 
             MergeSort(vetorTxt , meio + 1, direitaVet); 
   
             Merge(vetorTxt, esquerdaVet, meio, direitaVet); 
        } 
        this.vetorOrdenado = vetorTxt;
        long tempoNanoFinal = System.nanoTime();
 		long tempoMiliFinal = System.currentTimeMillis();
 		this.tempoExecucaoMili = tempoMiliFinal - tempoMiliInicial;
 		this.tempoExecucaoNano = tempoNanoFinal - tempoNanoInicial;
 		
     } 
	 public void MostrarOrdenacao() {
		 for(int o = 0; o < vetorOrdenado.length - 1; o++) {
			 System.out.println(vetorOrdenado[o] + " |" + vetorOrdenado[o].length());
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

