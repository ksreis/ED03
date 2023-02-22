package View;

import Controller.Pares;

public class Principal {

	public static void main(String [] args) {
	Pares PR = new Pares();
	
	int[] vetor = {4, 5, 8, 9, 10, 18};
	int tamanho = 6;
	int QtdPar =  PR.QtdPar(vetor,tamanho);
	
	int QTD = QtdPar;
	System.out.println("O vetor contém " + QTD + " números pares.");
	}
}