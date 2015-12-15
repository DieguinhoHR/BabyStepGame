package br.com.babystepgame.testes;

public class JogoDaVelha {
	int [][] velha = {{0, 0, 0}, { 0, 0, 0}, { 0, 0, 0}};	
	
	private int i = 0;
	private int j = 0;
	
	public boolean inserirBola(int i, int j) {		
		this.i = i;
		this.j = j;
		
		return inserir(1);
	}

	public boolean inserirXis(int i, int j) {
		this.i = i;
		this.j = j;	
		
		return inserir(2);
	}
	
	private boolean verificarPosicao() {
		if (i < 0 || i > 2)
			return false;
		
		if (j < 0 || j > 2)
			return false;		
		
		return true;
	}
	
	private boolean inserir(int peca) {		
		if(!verificarPosicao())
			return false; 
		
		velha[i][j] = peca;
		
		return true;		
	}
}
