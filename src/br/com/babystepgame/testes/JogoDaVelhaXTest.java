package br.com.babystepgame.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JogoDaVelhaXTest {
private JogoDaVelha jogoDaVelha;
	
	@Before
	public void setUp() {
		jogoDaVelha = new JogoDaVelha();
	}
	
	@Test
	public void testDeveInserirBolaNaPosicao00() {
		jogoDaVelha.inserirBola(0, 0);		
		assertEquals(1, jogoDaVelha.velha[0][0]);				
	}

	@Test
	public void testDeveInserirXisNaPosicao00() {
		jogoDaVelha.inserirXis(0, 0);		
		assertEquals(2, jogoDaVelha.velha[0][0]);				
	}	
	
	@Test
	public void testDeveInserirXisForaDaMatrizI() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(4, 0);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirXisNaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 4);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirXisDentroDaMatrizI() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(2, 0);		
		assertTrue(retornoDoInserirXis);					
	}

	@Test
	public void testDeveInserirXisDentroDaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 2);		
		assertTrue(retornoDoInserirXis);					
	}
	
	@Test
	public void testDeveInserirBolaForaDaMatrizI() {
		boolean retornoDoInserirXis = jogoDaVelha.inserirBola(4, 0);		
		assertFalse(retornoDoInserirXis);					
	}
	
	@Test
	public void testDeveInserirBolaForaDaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirBola(0, 4);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirBolaDentroDaMatrizI() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(2, 0);		
		assertTrue(retornoDoInserirXis);					
	}

	@Test
	public void testDeveInserirBolaDentroDaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 2);		
		assertTrue(retornoDoInserirXis);					
	}
	
	@Test
	public void testDeveVerificarSeAPrimeiralinhaContemSomenteBola() {		
		jogoDaVelha.inserirBola(0, 0);
		jogoDaVelha.inserirBola(0, 1);
		jogoDaVelha.inserirBola(0, 2);
		
		boolean verificarBola = jogoDaVelha.verificaBolaLinhaColuna();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeASegundalinhaContemSomenteBola() {		
		jogoDaVelha.inserirXis(1, 0);
		jogoDaVelha.inserirXis(1, 1);
		jogoDaVelha.inserirXis(1, 2);
		
		boolean verificarBola = jogoDaVelha.verificaXisLinhaColuna();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeATerceiralinhaContemSomenteBola() {		
		jogoDaVelha.inserirBola(2, 0);
		jogoDaVelha.inserirBola(2, 1);
		jogoDaVelha.inserirBola(2, 2);
		
		boolean verificarBola = jogoDaVelha.verificaBolaLinhaColuna();		
		assertTrue(verificarBola);
	}	
	
	@Test
	public void testDeveVerificarSeAPrimeiraColunaContemSomenteBola() {		
		jogoDaVelha.inserirBola(0, 0);
		jogoDaVelha.inserirBola(1, 0);
		jogoDaVelha.inserirBola(2, 0);
		
		boolean verificarBola = jogoDaVelha.verificaBolaLinhaColuna();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeASegundaColunaContemSomenteBola() {		
		jogoDaVelha.inserirBola(0, 1);
		jogoDaVelha.inserirBola(1, 1);
		jogoDaVelha.inserirBola(2, 1);
		
		boolean verificarBola = jogoDaVelha.verificaBolaLinhaColuna();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeATerceiraColunaContemSomenteBola() {		
		jogoDaVelha.inserirBola(0, 2);
		jogoDaVelha.inserirBola(1, 2);
		jogoDaVelha.inserirBola(2, 2);
		
		boolean verificarBola = jogoDaVelha.verificaBolaLinhaColuna();		
		assertTrue(verificarBola);
	}
	
	
	@Test
	public void testDeveVerificarSeAPrimeiraDiagonal() {		
		jogoDaVelha.inserirBola(0, 0);
		jogoDaVelha.inserirBola(1, 1);
		jogoDaVelha.inserirBola(2, 2);
		
		boolean verificarBola = jogoDaVelha.verificaBolaLinhaColuna();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeASegundaDiagonal() {		
		jogoDaVelha.inserirBola(0, 2);
		jogoDaVelha.inserirBola(1, 1);
		jogoDaVelha.inserirBola(2, 0);
		
		boolean verificarBola = jogoDaVelha.verificaBolaLinhaColuna();		
		assertTrue(verificarBola);
	}	
}
