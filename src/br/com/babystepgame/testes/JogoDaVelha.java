package br.com.babystepgame.testes;

public class JogoDaVelha {
	int [][] velha = {{0, 0, 0}, { 0, 0, 0}, { 0, 0, 0}};	
	
	public void inserirBola(int i, int j) {
		velha[i][j] = 1;
	}

	public void inserirXis(int i, int j) {
		velha[i][j] = 2;		
	}
}
