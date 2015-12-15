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
	public void testDeveInserirXisForaDaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(4, 0);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirXisNaMatrizL() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 4);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirXisDentroDaMatrizL() {		
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
	
	/*
	@Test
	public void testDeveInserirBolaNaMatrizL() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 4);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirBolaDentroDaMatrizL() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(2, 0);		
		assertTrue(retornoDoInserirXis);					
	}

	@Test
	public void testDeveInserirBolaDentroDaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 2);		
		assertTrue(retornoDoInserirXis);					
	}	
	*/
}
