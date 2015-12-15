package br.com.babystepgame.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JogoDaVelhaTest {	
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
	public void testDeveInserirBolaForaDaMatriz() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(4, 0);
		
		assertFalse(retornoDoInserirXis);
		
		//assertEquals(2, jogoDaVelha.velha[4][0]);				
	}	
}
