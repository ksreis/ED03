package Controller;

public class Pares {
	
	public Pares() {
		super();
	}
	
	public static int QtdPar(int[] vetor, int tamanho) {
	    if (tamanho == 0) {
	        return 0;
	    } else {
	        if (vetor[tamanho-1] % 2 == 0) {
	            return 1 + QtdPar(vetor, tamanho-1);
	        } else {
	            return QtdPar(vetor, tamanho-1);
	        }
	    }
	}

}
