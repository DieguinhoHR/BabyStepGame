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
	
	public boolean verificaBolaLinhaColuna() {
		if(verificarBolaColuna())
			return true;
		
		if(verificarBolaLinha())
			return true;		
		
		if(verificaPrimeiraDiagonal())
			return true;
		
		if(verificaSegundaDiagonal())
			return true;		

		return false;
	}

	private boolean verificarBolaLinha() {
		for (int i = 0; i <= 2; i++) {
			if(velha[i][0] == 1 && velha[i][1] == 1 && velha[i][2] == 1)
				return true;
		}
		return false;
	}
	
	private boolean verificarBolaColuna() {
		for (int i = 0; i <= 2; i++) {
			if(velha[0][i] == 1 && velha[1][i] == 1 && velha[2][i] == 1)
				return true;
		}
		return false;
	}

	private boolean verificaPrimeiraDiagonal() {
		
		for (int i = 0; i <= 2; i++) {
			if(velha[i][i] == 1 && velha[i][i] == 1 && velha[i][i] == 1)
				return true;
		}
		return false;
	}	
	
	private boolean verificaSegundaDiagonal() {
		
		int j=2;
		for (int i = 0; i <= 2; i++) {
			if(velha[i][j] == 1 && velha[i][j] == 1 && velha[i][j] == 1)
				return true;
			j--;
		}
		return false;				
	}		
}
