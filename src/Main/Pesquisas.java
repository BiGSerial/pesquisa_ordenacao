package Main;

import dados.No;

public class Pesquisas {
	
	
	 public static boolean pesquisaSeqOrdenado (int x, int numeros []){
		 for (int i = 0; i < numeros.length && x <= numeros[i]; i++)
		 if (x == numeros[i])
		 return true;
		 return false;
		 }
	 
	 public static boolean pesquisaBinaria(int x, int numeros[]) {
			int inicio = 0, fim = numeros.length - 1;
			int meio;
			while (inicio <= fim) {
				meio = (inicio + fim) / 2;
				if (x == numeros[meio])
					return true;
				if (x < numeros[meio])
					fim = meio - 1;
				else
					inicio = meio + 1;
			}
			return false;
		}
	
	 
		 
	 

}
