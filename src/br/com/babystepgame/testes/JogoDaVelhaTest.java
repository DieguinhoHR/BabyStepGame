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

}
