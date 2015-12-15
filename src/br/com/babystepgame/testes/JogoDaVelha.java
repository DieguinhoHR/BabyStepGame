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
		if(verificarBolaColuna(1))
			return true;
		
		if(verificarBolaLinha(1))
			return true;		
		
		if(verificaPrimeiraDiagonal(1))
			return true;
		
		if(verificaSegundaDiagonal(1))
			return true;		

		return false;
	}
	
	private boolean verificarBolaLinha(int peca) {
		for (int i = 0; i <= 2; i++) {
			if(velha[i][0] == peca && velha[i][1] == peca && velha[i][2] == peca)
				return true;
		}
		return false;
	}
	
	private boolean verificarBolaColuna(int peca) {
		for (int i = 0; i <= 2; i++) {
			if(velha[0][i] == peca && velha[1][i] == peca && velha[2][i] == peca)
				return true;
		}
		return false;
	}

	private boolean verificaPrimeiraDiagonal(int peca) {		
		for (int i = 0; i <= 2; i++) {
			if(velha[i][i] == peca && velha[i][i] == peca && velha[i][i] == peca)
				return true;
		}
		return false;
	}	
	
	private boolean verificaSegundaDiagonal(int peca) {		
		int j=2;
		for (int i = 0; i <= 2; i++) {
			if(velha[i][j] == peca && velha[i][j] == peca && velha[i][j] == peca)
				return true;
			j--;
		}
		return false;				
	}

	public boolean verificaXisLinhaColuna() {		
		if(verificarBolaColuna(2))
			return true;
		
		if(verificarBolaLinha(2))
			return true;		
		
		if(verificaPrimeiraDiagonal(2))
			return true;
		
		if(verificaSegundaDiagonal(2))
			return true;		

		return false;		
	}		
}
