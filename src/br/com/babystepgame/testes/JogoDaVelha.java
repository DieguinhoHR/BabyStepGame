package br.com.babystepgame.testes;

public class JogoDaVelha {
	int [][] velha = {{0, 0, 0}, { 0, 0, 0}, { 0, 0, 0}};	
	
	public boolean inserirBola(int i, int j) {
		if (i < 0 || i > 2)
			return false;		
		
		velha[i][j] = 1;
		
		return true;
	}

	public boolean inserirXis(int i, int j) {
		if (i < 0 || i > 2)
			return false;
		
		if (j < 0 || j > 2)
			return false;	
		
		velha[i][j] = 2;
		
		return true;
	}
}
